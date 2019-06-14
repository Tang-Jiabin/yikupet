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
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.PetDiseaseRepository;
import com.ykkoo.pet.repository.PetDiseaseTypesRepository;
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
import com.ykkoo.pet.vo.PageVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;

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
    private PetDiseaseTypesRepository diseaseTypesRepository;

    @Override
    public KVResult findInsuranceByType(Integer type) {

        List<PetInsurance> insuranceList = insuranceRepository.findAllByInsuranceTypeAndInsuranceState(type, 1);

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

        PetInsurance petInsurance;
        if (insuranceDTO.getInsuranceId() != null && insuranceDTO.getInsuranceId() != 0) {
            petInsurance = insuranceRepository.findByInsuranceId(insuranceDTO.getInsuranceId());
            if (petInsurance == null) {
                return KVResult.put(411,"保险不存在");
            }
        }else {
            petInsurance =  new PetInsurance();
            petInsurance.setCreateDate(new Date());
        }
        petInsurance.setUpdateDate(new Date());

        BeanUtils.copyProperties(insuranceDTO, petInsurance);

        petInsurance = insuranceRepository.save(petInsurance);

        FileDTO securityCardPic = insuranceDTO.getSecurityCardPic();
        if (securityCardPic != null) {
            securityCardPic.setInsuranceId(petInsurance.getInsuranceId());
            securityCardPic.setFileType(FileType.SECURITY_CARD);

            PetFile petFile = fileService.upload(securityCardPic, adminId);
            if (petFile != null) {
                petInsurance.setSecurityCardPic(petFile.getFileUrl());
            }
        }

        FileUploadDTO insuranceDetailsPic = insuranceDTO.getInsuranceDetailsPic();
        if (insuranceDetailsPic != null) {
            List<FileDTO> fileDTOList = insuranceDetailsPic.getFileDTOList();
            if (fileDTOList != null) {
                for (FileDTO fileDTO : fileDTOList) {
                    fileDTO.setFileType(FileType.INSURANCE_DETAILS);
                    fileDTO.setInsuranceId(petInsurance.getInsuranceId());
                }
                FileUploadDTO fileUploadDTO = new FileUploadDTO();
                fileUploadDTO.setFileDTOList(fileDTOList);

                KVResult upload = fileService.upload(fileUploadDTO, adminId);
            }
        }

        petInsurance = insuranceRepository.save(petInsurance);


        PetDisease petDisease;
        List<PetDisease> diseaseList = Lists.newArrayList();
        List<DiseaseDTO> disease = insuranceDTO.getDisease();
        if (disease != null) {
            for (DiseaseDTO diseaseDTO : disease) {
                petDisease = new PetDisease();
                BeanUtils.copyProperties(diseaseDTO, petDisease);
                petDisease.setInsuranceId(petInsurance.getInsuranceId());
                if (petDisease.getTypeId() == null) {
                    petDisease.setTypeId(0);
                }
                diseaseList.add(petDisease);
            }
            diseaseRepository.saveAll(diseaseList);
        }


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
    public KVResult getInsurancePage(Integer page, Integer size, String insuranceName, Integer insuranceType, Integer insuranceState, Integer adminId) {


        Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC, "insuranceId");
        Page<PetInsurance> insurancePage = insuranceRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();


            if (!StringUtils.isEmpty(insuranceName)) {
                list.add(criteriaBuilder.equal(root.get("insuranceName").as(Integer.class), insuranceName));
            }

            if (null != insuranceType && 0 != insuranceType) {
                list.add(criteriaBuilder.equal(root.get("insuranceType").as(Integer.class), insuranceType));
            }

            if (null != insuranceState && 0 != insuranceState) {
                list.add(criteriaBuilder.equal(root.get("insuranceState").as(Integer.class), insuranceState));
            }

            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);


        InsuranceVO insuranceVO;
        List<InsuranceVO> insuranceVOList = Lists.newArrayList();
        PageVo<InsuranceVO> insuranceVOPageVo = new PageVo<>();

        List<PetInsurance> content = insurancePage.getContent();

        List<Integer> insuranceIdList = new ArrayList<>();
        for (PetInsurance insurance : content) {
            insuranceIdList.add(insurance.getInsuranceId());
        }

        List<PetDisease> diseaseList = diseaseRepository.findAllByDiseaseStateAndInsuranceIdIn(1, insuranceIdList);
        List<PetDiseaseTypes> diseaseTypes = diseaseTypesRepository.findAll();
        List<PetFile> petFileList = fileService.findAllByFileTypeAndStateAndInsuranceIdIn(FileType.INSURANCE_DETAILS, 1, insuranceIdList);

        BeanUtils.copyProperties(insurancePage, insuranceVOPageVo);

        for (PetInsurance insurance : content) {
            insuranceVO = new InsuranceVO();
            BeanUtils.copyProperties(insurance, insuranceVO);

            List<PetDisease> petDiseaseList = new ArrayList<>();
            for (PetDisease petDisease : diseaseList) {
                if (petDisease.getInsuranceId().equals(insurance.getInsuranceId())) {
                    petDiseaseList.add(petDisease);
                }
            }
            insuranceVO.setDisease(petDiseaseList);
            insuranceVO.setDiseaseTypes(diseaseTypes);

            List<InsuranceDetailsPicVO> insuranceDetailsPicVOS = new ArrayList<>();

            for (PetFile petFile : petFileList) {
                if(insurance.getInsuranceId().equals(petFile.getInsuranceId())){
                    InsuranceDetailsPicVO insuranceDetailsPicVO = new InsuranceDetailsPicVO();
                    BeanUtils.copyProperties(petFile,insuranceDetailsPicVO);
                    insuranceDetailsPicVOS.add(insuranceDetailsPicVO);
                }
            }
            insuranceVO.setInsuranceDetailsPicList(insuranceDetailsPicVOS);

            insuranceVOList.add(insuranceVO);
        }
        insuranceVOPageVo.setContent(insuranceVOList);

        return KVResult.put(insuranceVOPageVo);
    }

    @Override
    public KVResult addDiseaseType(Integer typeId, String typeName, Integer adminId) {
        PetDiseaseTypes diseaseTypes;
        if (typeId != 0) {
            diseaseTypes = diseaseTypesRepository.findByTypeId(typeId);

            if (diseaseTypes == null) {
                return KVResult.put(411, "不存在");
            }
        } else {
            diseaseTypes = new PetDiseaseTypes();
        }

        diseaseTypes.setTypeName(typeName);
        PetDiseaseTypes save = diseaseTypesRepository.save(diseaseTypes);
        return KVResult.put(save);
    }

    @Override
    public KVResult deleteDiseaseType(Integer typeId) {
        PetDiseaseTypes diseaseTypes = diseaseTypesRepository.findByTypeId(typeId);

        if (diseaseTypes != null) {
            diseaseTypesRepository.delete(diseaseTypes);
        }

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getDiseaseType() {

        List<PetDiseaseTypes> diseaseTypesList = diseaseTypesRepository.findAll();
        return KVResult.put(diseaseTypesList);
    }

}
