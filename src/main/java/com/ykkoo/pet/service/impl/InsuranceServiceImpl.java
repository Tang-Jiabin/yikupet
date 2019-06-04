package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.common.type.FileType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;
import com.ykkoo.pet.dto.DiseaseDTO;
import com.ykkoo.pet.dto.FileDTO;
import com.ykkoo.pet.dto.FileUploadDTO;
import com.ykkoo.pet.dto.InsuranceDTO;
import com.ykkoo.pet.pojo.PetDisease;
import com.ykkoo.pet.pojo.PetFile;
import com.ykkoo.pet.pojo.PetInsurance;
import com.ykkoo.pet.pojo.PetInsuranceEvaluation;
import com.ykkoo.pet.repository.PetDiseaseRepository;
import com.ykkoo.pet.repository.PetFileRepository;
import com.ykkoo.pet.repository.PetInsuranceRepository;
import com.ykkoo.pet.service.FileService;
import com.ykkoo.pet.service.InsuranceEvaluationService;
import com.ykkoo.pet.utils.UploadFileUtil;
import com.ykkoo.pet.vo.InsuranceDetailsPicVO;
import com.ykkoo.pet.vo.InsuranceEvaluationVO;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.service.InsuranceService;
import com.ykkoo.pet.vo.InsuranceVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * 保险
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/11
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class InsuranceServiceImpl implements InsuranceService {

    private PetInsuranceRepository insuranceRepository;
    private FileService fileService;
    private InsuranceEvaluationService evaluationService;
    private PetDiseaseRepository diseaseRepository;

    @Override
    public KVResult findInsuranceByType(Integer type) {

        List<PetInsurance> insuranceList = insuranceRepository.findAllByInsuranceType(type);

        List<InsuranceVO> insuranceVOList = Lists.newArrayList();
        InsuranceVO insuranceVO;
        InsuranceEvaluationVO insuranceEvaluationVO;
        List<InsuranceDetailsPicVO> detailsPicVOList;

        for (PetInsurance petInsurance : insuranceList) {

            insuranceEvaluationVO = getInsuranceEvaluationVO(petInsurance);

            detailsPicVOList = getInsuranceDetailsPicVOList(petInsurance);

            insuranceVO = getInsuranceVO(insuranceEvaluationVO, detailsPicVOList, petInsurance);

            insuranceVOList.add(insuranceVO);
        }


        return KVResult.put(insuranceVOList);
    }


    private InsuranceEvaluationVO getInsuranceEvaluationVO(PetInsurance petInsurance) {
        InsuranceEvaluationVO insuranceEvaluationVO;
        PetInsuranceEvaluation evaluation = evaluationService.findMaxStarClassByInsuranceId(petInsurance.getInsuranceId());
        insuranceEvaluationVO = new InsuranceEvaluationVO();
        if (evaluation != null) {
            BeanUtils.copyProperties(evaluation, insuranceEvaluationVO);
        }
        return insuranceEvaluationVO;
    }

    private InsuranceVO getInsuranceVO(InsuranceEvaluationVO insuranceEvaluationVO, List<InsuranceDetailsPicVO> detailsPicVOList, PetInsurance petInsurance) {
        InsuranceVO insuranceVO = new InsuranceVO();
        if (petInsurance != null) {
            BeanUtils.copyProperties(petInsurance, insuranceVO);
        }
        insuranceVO.setInsuranceEvaluation(insuranceEvaluationVO);
        insuranceVO.setInsuranceDetailsPicList(detailsPicVOList);
        return insuranceVO;
    }

    private List<InsuranceDetailsPicVO> getInsuranceDetailsPicVOList(PetInsurance petInsurance) {
        List<InsuranceDetailsPicVO> detailsPicVOList = Lists.newArrayList();
        InsuranceDetailsPicVO detailsPicVO;
        List<PetFile> fileList = fileService.findAllByFileTypeAndStateAndInsuranceId(FileType.INSURANCE_DETAILS, 1, petInsurance.getInsuranceId());
        for (PetFile petFile : fileList) {
            detailsPicVO = new InsuranceDetailsPicVO();
            BeanUtils.copyProperties(petFile, detailsPicVO);
            detailsPicVOList.add(detailsPicVO);
        }
        return detailsPicVOList;
    }


    /***********************************  管理端  ***********************************/

    @Override
    public KVResult addInsurance(InsuranceDTO insuranceDTO, Integer adminId) {

        PetInsurance petInsurance = new PetInsurance();
        BeanUtils.copyProperties(insuranceDTO, petInsurance);

        petInsurance = insuranceRepository.save(petInsurance);

        FileDTO securityCardPic = insuranceDTO.getSecurityCardPic();
        securityCardPic.setInsuranceId(petInsurance.getInsuranceId());
        securityCardPic.setFileType(FileType.SECURITY_CARD);

        PetFile petFile = fileService.upload(securityCardPic, adminId);
        if (petFile != null) {
            petInsurance.setSecurityCardPic(petFile.getFileUrl());
        }

        List<FileDTO> fileDTOList = insuranceDTO.getInsuranceDetailsPic().getFileDTOList();
        for (FileDTO fileDTO : fileDTOList) {
            fileDTO.setFileType(FileType.INSURANCE_DETAILS);
            fileDTO.setInsuranceId(petInsurance.getInsuranceId());
        }
        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        fileUploadDTO.setFileDTOList(fileDTOList);

        KVResult upload = fileService.upload(fileUploadDTO, adminId);

        petInsurance = insuranceRepository.save(petInsurance);


        PetDisease petDisease;
        List<PetDisease> diseaseList = Lists.newArrayList();

        for (DiseaseDTO diseaseDTO : insuranceDTO.getDisease()) {
            petDisease = new PetDisease();
            BeanUtils.copyProperties(diseaseDTO, petDisease);
            petDisease.setInsuranceId(petInsurance.getInsuranceId());
            diseaseList.add(petDisease);
        }
        diseaseRepository.saveAll(diseaseList);

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public PetInsurance findByInsuranceId(Integer insuranceId) {
        return insuranceRepository.findByInsuranceId(insuranceId);
    }

    @Override
    public List<PetInsurance> findAllByInsuranceIdIn(List<Integer> insuranceIdList) {
        return insuranceRepository.findAllByInsuranceIdIn(insuranceIdList);
    }

    @Override
    public KVResult getInsurancePage(Integer paramInteger1, Integer paramInteger2, String paramString, Integer paramInteger3, Integer paramInteger4, Integer paramInteger5) {
        return null;
    }

}
