package com.ykkoo.pet.service.impl;

import com.google.common.collect.Lists;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.type.FileType;
import com.ykkoo.pet.dto.DiagnosticDTO;
import com.ykkoo.pet.dto.FileDTO;
import com.ykkoo.pet.dto.FileUploadDTO;
import com.ykkoo.pet.dto.HospitalDTO;
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.PetHospitalInfoRepository;
import com.ykkoo.pet.repository.PetHospitalRepository;
import com.ykkoo.pet.repository.PetReservationInfoRepository;
import com.ykkoo.pet.service.FileService;
import com.ykkoo.pet.service.HospitalService;
import com.ykkoo.pet.service.InsurancePolicyService;
import com.ykkoo.pet.vo.HospitalVO;
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

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 医院
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/12
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class HospitalServiceImpl implements HospitalService {

    private FileService fileService;
    private PetHospitalRepository hospitalRepository;
    private PetHospitalInfoRepository hospitalInfoRepository;
    private InsurancePolicyService insurancePolicyService;
    private PetReservationInfoRepository reservationInfoRepository;

    @Override
    public KVResult addHospital(HospitalDTO hospitalDTO, Integer adminId) {

        PetHospital hospital;
        if (hospitalDTO.getHospitalId() != null && hospitalDTO.getHospitalId() != 0) {
            hospital = hospitalRepository.findByHospitalId(hospitalDTO.getHospitalId());
            if (hospital == null) {
                return KVResult.put(411, "医院不存在");
            }
        } else {
            hospital = new PetHospital();
            hospital.setCreateDate(new Date());
        }

        BeanUtils.copyProperties(hospitalDTO, hospital);
        hospital.setUpdateDate(new Date());
        hospital = hospitalRepository.save(hospital);

        //医院头像
        FileDTO headPortrait = hospitalDTO.getHospitalHeadPortrait();
        headPortrait.setHospitalId(hospital.getHospitalId());
        headPortrait.setFileType(FileType.HOSPITAL_HEAD_PORTRAIT);
        PetFile upload = fileService.upload(headPortrait, adminId);
        hospital.setHospitalHeadPortrait(upload.getFileUrl());
        hospital = hospitalRepository.save(hospital);

        //医院
        FileUploadDTO businessLicense = hospitalDTO.getBusinessLicense();
        for (FileDTO fileDTO : businessLicense.getFileDTOList()) {
            fileDTO.setHospitalId(hospital.getHospitalId());
            fileDTO.setFileType(FileType.HOSPITAL_BUSINESS_LICENSE);
        }
        fileService.upload(businessLicense, adminId);

        FileUploadDTO hospitalDetailsPic = hospitalDTO.getHospitalDetailsPic();
        for (FileDTO fileDTO : hospitalDetailsPic.getFileDTOList()) {
            fileDTO.setHospitalId(hospital.getHospitalId());
            fileDTO.setFileType(FileType.HOSPITAL_DETAILS_PIC);
        }
        fileService.upload(hospitalDetailsPic, adminId);

        PetHospitalInfo hospitalInfo = hospitalInfoRepository.findByHospitalId(hospital.getHospitalId());
        if (hospitalInfo == null) {
            hospitalInfo = new PetHospitalInfo();
            hospitalInfo.setCreateDate(new Date());
        }
        BeanUtils.copyProperties(hospitalDTO, hospitalInfo);


        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getHospitalPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4, Integer paramInteger5, String paramString1, String paramString2, Integer paramInteger6) {
        return null;
    }

//    @Override
    public KVResult getHospitalPage(Integer page, Integer scope, Integer type,String name) {

        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "hospitalId");
        Page<PetHospital> hospitalPage = hospitalRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();

            if (scope != null && scope != 0) {
                CriteriaBuilder.In<Integer> in = criteriaBuilder.in(root.get("hospitalScope").as(Integer.class));
                in.value(scope);
                in.value(3);
                list.add(in);
            }
            if (type != null && type != 0) {

                CriteriaBuilder.In<Integer> in = criteriaBuilder.in(root.get("hospitalType").as(Integer.class));
                in.value(type);
                in.value(3);
                list.add(in);
            }
            if(!StringUtils.isEmpty(name)){
                list.add(criteriaBuilder.like(root.get("hospitalName").as(String.class), String.format("%%%s%%", name)));
            }
            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);

        List<PetHospital> hospitalList = hospitalPage.getContent();

        List<Integer> hospitalIdList = Lists.newArrayList();
        for (PetHospital petHospital : hospitalList) {
            hospitalIdList.add(petHospital.getHospitalId());
        }

        List<PetFile> hospitalDetailsPicList = fileService.findAllByFileTypeAndStateAndHospitalIdIn(FileType.HOSPITAL_DETAILS_PIC, 1, hospitalIdList);

        HospitalVO hospitalVO;
        List<HospitalVO> hospitalVOList = Lists.newArrayList();
        List<PetFile> petFileList;

        for (PetHospital petHospital : hospitalList) {
            hospitalVO = new HospitalVO();
            BeanUtils.copyProperties(petHospital, hospitalVO);
            petFileList = Lists.newArrayList();
            for (PetFile petFile : hospitalDetailsPicList) {
                if (petHospital.getHospitalId().equals(petFile.getHospitalId())) {
                    petFileList.add(petFile);
                }
            }
            hospitalVO.setHospitalDetailsPic(petFileList);
            hospitalVOList.add(hospitalVO);
        }

        PageVo<HospitalVO> hospitalPageVO = new PageVo<>();
        BeanUtils.copyProperties(hospitalPage, hospitalPageVO);
        hospitalPageVO.setContent(hospitalVOList);

        return KVResult.put(hospitalPageVO);
    }

    @Override
    public KVResult medicalAppointments(Integer hospitalId, Integer userId) {

        List<PetInsurancePolicy> insurancePolicyList = insurancePolicyService.findByUserIdAndInsuranceStatus(userId,3);

        if (insurancePolicyList.size()<=0) {
            return KVResult.put(411,"您的保单不在保障期或未开通保单");
        }

        PetInsurancePolicy insurancePolicy = insurancePolicyList.get(0);

        PetReservationInfo reservationInfo = reservationInfoRepository.findAllByUserIdAndReservationStatus(userId, 1);

        if (reservationInfo != null) {
            if (reservationInfo.getHospitalId().equals(hospitalId)) {
                return KVResult.put(HttpStatus.OK);
            }else {
                return KVResult.put(412,"您已经预约其他医院，请前往就诊或取消预约");
            }
        }

        reservationInfo = new PetReservationInfo();
        reservationInfo.setUserId(userId);
        reservationInfo.setAnimalId(insurancePolicy.getAnimalId());
        reservationInfo.setInsurancePolicyId(insurancePolicy.getInsurancePolicyId());
        reservationInfo.setReservationStatus(1);
        reservationInfo.setApplicationDate(new Date());
        reservationInfo.setConsultationDate(null);
        reservationInfo.setHospitalId(hospitalId);
        reservationInfoRepository.save(reservationInfo);

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getReservationPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString1, String paramString2, Date paramDate1, Date paramDate2, Integer paramInteger4) {
        return null;
    }

    @Override
    public List<PetReservationInfo> findReservationInfoByInsurancePolicyId(Integer paramInteger) {
        return null;
    }

    @Override
    public PetHospitalInfo findByHospitalInfoId(Integer paramInteger) {
        return null;
    }

    @Override
    public KVResult bindingElectronicCard(Integer paramInteger1, Integer paramInteger2, String paramString, Integer paramInteger3) {
        return null;
    }

    @Override
    public KVResult getInsurancePolicyDetails(Integer paramInteger1, Integer paramInteger2) {
        return null;
    }

    @Override
    public KVResult addDiagnosticInfo(DiagnosticDTO paramDiagnosticDTO, Integer paramInteger) {
        return null;
    }


}
