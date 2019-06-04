package com.ykkoo.pet.service.impl;

import java.io.IOException;
import java.util.*;

import com.google.common.collect.Maps;
import com.ykkoo.pet.common.type.FileType;

import com.google.common.collect.Lists;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.FileDTO;
import com.ykkoo.pet.dto.FileUpdateDTO;
import com.ykkoo.pet.dto.FileUploadDTO;
import com.ykkoo.pet.pojo.PetFile;
import com.ykkoo.pet.repository.PetFileRepository;
import com.ykkoo.pet.service.FileService;
import com.ykkoo.pet.utils.SnowflakeIdFactory;
import com.ykkoo.pet.utils.UploadFileUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传文件
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/10
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class FileServiceImpl implements FileService {

    private PetFileRepository petFileRepository;


    @Override
    public KVResult<Map<String,Object>> upload(FileUploadDTO fileUploadDTO, Integer adminId) {

        int total = 0;
        int successNum = 0;
        int failNum = 0;
        Map<String, Object> resultMap = Maps.newHashMap();
        List<String> success = Lists.newArrayList();
        List<String> fail = Lists.newArrayList();
        resultMap.put("total", total);
        resultMap.put("successNum", successNum);
        resultMap.put("failNum", failNum);
        resultMap.put("fail", fail);
        resultMap.put("success", success);
        resultMap.put("errMsg", "");

        if (fileUploadDTO == null) {
            resultMap.put("errMsg","数据格式错误");
            return KVResult.put(410, resultMap);
        }

        List<FileDTO> fileDTOList = fileUploadDTO.getFileDTOList();

        if (fileDTOList == null || fileDTOList.size() <= 0) {
            resultMap.put("errMsg","数据格式错误");
            return KVResult.put(410, resultMap);
        }

        SnowflakeIdFactory sf = new SnowflakeIdFactory(SnowflakeIdFactory.getWorkerId(), 1000);
        List<PetFile> petFileList = Lists.newArrayList();
        PetFile petFile;

        total = fileDTOList.size();

        for (FileDTO fileDTO : fileDTOList) {

            //验证文件格式
            MultipartFile file = fileDTO.getFile();
            String fileName = file.getOriginalFilename();
            String suffix = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();

            List<String> suffixList = Arrays.asList("jpg", "jpeg", "png");

            if (!suffixList.contains(suffix)) {
                return KVResult.put(resultMap);
            }

            if (StringUtils.isEmpty(fileDTO.getFileName())) {
                fileDTO.setFileName(String.format("%s.%s", String.valueOf(System.currentTimeMillis()), suffix));
            }

            String path = String.format("%s%s", fileDTO.getUploadPath(), fileDTO.getFileName());

            String fileUrl = null;

            try {
                fileUrl = UploadFileUtil.uploadPetFiles(file.getInputStream(), path);
            } catch (IOException e) {
                e.printStackTrace();
                log.error("图片上传失败 FileServiceImpl:81");

                failNum = failNum + 1;
                fail.add(fileDTO.getAlias());
                continue;
            }

            if (!StringUtils.isEmpty(fileUrl)) {
                petFile = new PetFile();
                petFile.setFileId(sf.nextId());
                petFile.setFileUrl(fileUrl);
                petFile.setJumpLink(fileDTO.getJumpLink());
                petFile.setFileType(fileDTO.getFileType());
                petFile.setState(fileDTO.getState());
                petFile.setUploadDate(new Date());
                petFile.setAdminId(adminId);
                petFile.setInsuranceId(fileDTO.getInsuranceId());

                petFileList.add(petFile);

                successNum = successNum + 1;
                success.add(fileDTO.getAlias());
            }

        }

        petFileRepository.saveAll(petFileList);

        resultMap.put("total", total);
        resultMap.put("successNum", successNum);
        resultMap.put("failNum", failNum);
        resultMap.put("fail", fail);
        resultMap.put("success", success);

        return KVResult.put(resultMap);
    }

    @Override
    public PetFile upload(FileDTO fileDTO, Integer adminId) {

        if (StringUtils.isEmpty(fileDTO.getFileName())) {
            fileDTO.setFileName(String.valueOf(System.currentTimeMillis()));
        }

        String path = String.format("%s%s", fileDTO.getUploadPath(), fileDTO.getFileName());

        String fileUrl = null;
        try {
            fileUrl = UploadFileUtil.uploadPetFiles(fileDTO.getFile().getInputStream(), path);
        } catch (IOException e) {
            e.printStackTrace();
            log.error("图片上传失败 FileServiceImpl:81");
        }
        SnowflakeIdFactory sf = new SnowflakeIdFactory(SnowflakeIdFactory.getWorkerId(), 1000);
        PetFile petFile = null;
        if (!StringUtils.isEmpty(fileUrl)) {
            petFile = new PetFile();
            petFile.setFileId(sf.nextId());
            petFile.setFileUrl(fileUrl);
            petFile.setJumpLink(fileDTO.getJumpLink());
            petFile.setFileType(fileDTO.getFileType());
            petFile.setState(fileDTO.getState());
            petFile.setUploadDate(new Date());
            petFile.setAdminId(adminId);
            petFile.setInsuranceId(fileDTO.getInsuranceId());
            petFile = petFileRepository.save(petFile);
        }

        return petFile;
    }

    @Override
    public List<PetFile> findAllByTypeAndState(FileType type, int state) {
        return petFileRepository.findAllByFileTypeAndState(type, state);
    }

    @Override
    public List<PetFile> findAllByFileTypeAndStateAndInsuranceId(FileType type, int state, Integer insuranceId) {
        return petFileRepository.findAllByFileTypeAndStateAndInsuranceId(type, state, insuranceId);
    }

    @Override
    public List<PetFile> findAllByFileTypeAndStateAndHospitalIdIn(FileType fileType, int state, List<Integer> hospitalIdList) {
        return petFileRepository.findAllByFileTypeAndStateAndHospitalIdIn(fileType, state, hospitalIdList);
    }

    @Override
    public List<PetFile> findAllByFileTypeAndStateAndCompensateId(FileType type, int state, Integer compensateId) {
        return petFileRepository.findAllByFileTypeAndStateAndCompensateId(type,state,compensateId);
    }

    @Override
    public List<PetFile> findAllByFileTypeAndStateAndInsuranceIdIn(FileType paramFileType, int paramInt, List<Integer> paramList) {
        return null;
    }

    @Override
    public KVResult update(FileUpdateDTO paramFileUpdateDTO, Integer paramInteger) {
        return null;
    }

    @Override
    public List<PetFile> findAllByFileTypeAndStateAndHospitalId(FileType paramFileType, int paramInt, Integer paramInteger) {
        return null;
    }

    @Override
    public List<PetFile> save(List<PetFile> paramList) {
        return null;
    }

    @Override
    public List<PetFile> findAllByFileTypeAndStateAndReservationId(FileType paramFileType, int paramInt, Integer paramInteger) {
        return null;
    }

    @Override
    public KVResult getFilePage(Integer paramInteger1, Integer paramInteger2, FileType paramFileType, Integer paramInteger3, Integer paramInteger4) {
        return null;
    }
}
