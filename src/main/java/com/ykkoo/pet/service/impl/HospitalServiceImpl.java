package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.vo.PetAnimalVO;
import com.ykkoo.pet.vo.InsuranceVO;
import com.ykkoo.pet.vo.UserVO;

import com.google.common.collect.Lists;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.type.FileType;
import com.ykkoo.pet.dto.*;
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.*;
import com.ykkoo.pet.service.FileService;
import com.ykkoo.pet.service.HospitalService;
import com.ykkoo.pet.service.InsurancePolicyService;
import com.ykkoo.pet.vo.*;
import lombok.AllArgsConstructor;
import lombok.Data;
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
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
    private PetPromoterRepository promoterRepository;
    private PetUserInfoRepository userInfoRepository;
    private PetInsuranceDiseaseRepository insuranceDiseaseRepository;
    private PetInsuranceRepository insuranceRepository;
    private PetAnimalRepository animalRepository;
    private PetDiseaseTypesRepository diseaseTypesRepository;
    private PetMedicalInfoRepository medicalInfoRepository;
    private PetHospitalAccountRepository hospitalAccountRepository;
    private PetCompensateDetailsRepository compensateDetailsRepository;
    private PetSalesmanRepository salesmanRepository;

    @Override
    public KVResult addHospital(HospitalDTO hospitalDTO, Integer salesmanId) {

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
        hospital.setSalesmanId(salesmanId);
        hospital = hospitalRepository.save(hospital);

        //医院头像
        FileDTO headPortrait = hospitalDTO.getHospitalHeadPortrait();
        if (headPortrait != null) {
            headPortrait.setHospitalId(hospital.getHospitalId());
            headPortrait.setFileType(FileType.HOSPITAL_HEAD_PORTRAIT);
            PetFile upload = fileService.upload(headPortrait, salesmanId);
            hospital.setHospitalHeadPortrait(upload.getFileUrl());
            hospital = hospitalRepository.save(hospital);
        }


        //医院
        FileUploadDTO businessLicense = hospitalDTO.getBusinessLicense();
        if (businessLicense != null) {
            for (FileDTO fileDTO : businessLicense.getFileDTOList()) {
                fileDTO.setHospitalId(hospital.getHospitalId());
                fileDTO.setFileType(FileType.HOSPITAL_BUSINESS_LICENSE);
            }
            fileService.upload(businessLicense, salesmanId);
        }


        FileUploadDTO hospitalDetailsPic = hospitalDTO.getHospitalDetailsPic();
        if (hospitalDetailsPic != null) {
            for (FileDTO fileDTO : hospitalDetailsPic.getFileDTOList()) {
                fileDTO.setHospitalId(hospital.getHospitalId());
                fileDTO.setFileType(FileType.HOSPITAL_DETAILS_PIC);
            }

            fileService.upload(hospitalDetailsPic, salesmanId);
        }


        PetHospitalInfo hospitalInfo = hospitalInfoRepository.findByHospitalId(hospital.getHospitalId());
        if (hospitalInfo == null) {
            hospitalInfo = new PetHospitalInfo();
            hospitalInfo.setCreateDate(new Date());
        }
        BeanUtils.copyProperties(hospitalDTO, hospitalInfo);
        hospitalInfo.setHospitalId(hospital.getHospitalId());
        hospitalInfoRepository.save(hospitalInfo);

        return KVResult.put(HttpStatus.OK);
    }


    @Override
    public KVResult getHospitalPage(Integer page, Integer size, Integer scope, Integer type, Integer cooperationState, String hospitalName, String contacts, Integer salesmanId) {

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
            if (!StringUtils.isEmpty(hospitalName)) {
                list.add(criteriaBuilder.like(root.get("hospitalName").as(String.class), String.format("%%%s%%", hospitalName)));
            }

            if (cooperationState != null && cooperationState != 0) {
                list.add(criteriaBuilder.equal(root.get("cooperationState").as(Integer.class), cooperationState));
            }
            if (salesmanId != null && salesmanId != 0) {
                list.add(criteriaBuilder.equal(root.get("salesmanId").as(Integer.class), salesmanId));

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
        List<PetFile> hospitalHeadPicList = fileService.findAllByFileTypeAndStateAndHospitalIdIn(FileType.HOSPITAL_HEAD_PORTRAIT, 1, hospitalIdList);
        List<PetFile> hospitalBusinessPicList = fileService.findAllByFileTypeAndStateAndHospitalIdIn(FileType.HOSPITAL_BUSINESS_LICENSE, 1, hospitalIdList);

        HospitalVO hospitalVO;
        List<HospitalVO> hospitalVOList = Lists.newArrayList();
        List<PetFile> petFileList;


        List<PetHospitalInfo> hospitalInfoList = hospitalInfoRepository.findAllByHospitalIdIn(hospitalIdList);


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


            petFileList = Lists.newArrayList();
            String hospitalHeadPortrait = "";
            for (PetFile petFile : hospitalHeadPicList) {
                if (petHospital.getHospitalId().equals(petFile.getHospitalId())) {
                    petFileList.add(petFile);
                    if (!StringUtils.isEmpty(petFile.getFileUrl())) {
                        hospitalHeadPortrait = petFile.getFileUrl();
                    }

                }
            }
            hospitalVO.setHospitalHeadPortraitList(petFileList);
            hospitalVO.setHospitalHeadPortrait(hospitalHeadPortrait);

            petFileList = Lists.newArrayList();
            for (PetFile petFile : hospitalBusinessPicList) {
                if (petHospital.getHospitalId().equals(petFile.getHospitalId())) {
                    petFileList.add(petFile);
                }
            }
            hospitalVO.setBusinessLicense(petFileList);


            HospitalInfoVO hospitalInfoVO;
            for (PetHospitalInfo hospitalInfo : hospitalInfoList) {
                if (hospitalInfo.getHospitalId().equals(petHospital.getHospitalId())) {
                    hospitalInfoVO = new HospitalInfoVO();
                    BeanUtils.copyProperties(hospitalInfo, hospitalInfoVO);
                    hospitalVO.setHospitalInfoVO(hospitalInfoVO);
                }
            }

            hospitalVOList.add(hospitalVO);
        }

        PageVo<HospitalVO> hospitalPageVO = new PageVo<>();
        BeanUtils.copyProperties(hospitalPage, hospitalPageVO);
        hospitalPageVO.setContent(hospitalVOList);

        return KVResult.put(hospitalPageVO);
    }

    @Override
    public KVResult medicalAppointments(Integer hospitalId, Integer userId) {

        List<PetInsurancePolicy> insurancePolicyList = insurancePolicyService.findByUserIdAndInsuranceStatus(userId, 3);

        if (insurancePolicyList.size() <= 0) {
            return KVResult.put(411, "您的保单不在保障期或未开通保单");
        }

        PetInsurancePolicy insurancePolicy = insurancePolicyList.get(0);

        PetReservationInfo reservationInfo = reservationInfoRepository.findAllByUserIdAndReservationStatus(userId, 1);

        if (reservationInfo != null) {
            if (reservationInfo.getHospitalId().equals(hospitalId)) {
                return KVResult.put(HttpStatus.OK);
            } else {
                return KVResult.put(412, "您已经预约其他医院，请前往就诊或取消预约");
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
    public KVResult bindingElectronicCard(Integer insurancePolicyId, Integer insuranceStatus, String electronicCard, Integer hospitalInfoId) {
        PetInsurancePolicy insurancePolicy = insurancePolicyService.findByInsurancePolicyId(insurancePolicyId);

        if (insurancePolicy == null) {
            return KVResult.put(411, "保单不存在");
        }

        PetAnimal electronicCardEx = animalRepository.findByElectronicCard(electronicCard);
        if (electronicCardEx != null) {
            return KVResult.put(412, "电子卡号已存在");
        }

        LocalDateTime dateTime = LocalDateTime.now();

        dateTime = dateTime.plusMonths(1);

        Date startDate = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
        dateTime = dateTime.plusYears(1);
        Date endDate = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
        insurancePolicy.setInsuranceStartDate(startDate);
        insurancePolicy.setInsuranceEndDate(endDate);
        insurancePolicy.setInsuranceStatus(insuranceStatus);
        insurancePolicyService.save(insurancePolicy);
        PetAnimal animal = animalRepository.findByAnimalId(insurancePolicy.getAnimalId());
        if (animal == null) {
            return KVResult.put(412, "保单未绑定宠物");
        }
        animal.setElectronicCard(electronicCard);

        animalRepository.save(animal);


        PetHospitalAccount hospitalAccount = new PetHospitalAccount();
        hospitalAccount.setHospitalId(hospitalInfoId);
        hospitalAccount.setMoney(20.0D);
        hospitalAccount.setType(1);
        hospitalAccount.setDate(new Date());
        hospitalAccount.setSource("绑定电子卡");
        hospitalAccount.setRatio(0);
        hospitalAccount.setState(1);
        hospitalAccount.setWithdrawalId(0);
        hospitalAccount.setAccountType(1);

        hospitalAccountRepository.save(hospitalAccount);


        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult addDiagnosticInfo(DiagnosticDTO paramDiagnosticDTO, Integer paramInteger) {

        PetInsurancePolicy insurancePolicy = insurancePolicyService.findByInsurancePolicyId(paramDiagnosticDTO.getInsurancePolicyId());
        if (insurancePolicy == null) {
            return KVResult.put(411, "保单不存在");
        }

//        PetCompensateDetails compensateDetails = new PetCompensateDetails();
//        compensateDetails.setCompensateId(0);
//        compensateDetails.setInsurancePolicyId(insurancePolicy.getInsurancePolicyId());
//        compensateDetails.setUserId(insurancePolicy.getUserId());
//        compensateDetails.setClaimStatus(1);
//        compensateDetails.setAuditStatus(1);
//        compensateDetails.setCompensateStatus(1);
//        compensateDetails.setAuditExplain("审核说明");
//        compensateDetails.setApplicationDate(new Date());
//        compensateDetails.setUpdateDate(new Date());
//        compensateDetails.setInsuranceName("保险名称");
//        compensateDetails.setInsuranceStartDate(new Date());
//        compensateDetails.setInsuranceEndDate(new Date());
//        compensateDetails.setCardNumber("卡号");
//        compensateDetails.setName("姓名");
//        compensateDetails.setAddress("地址");
//        compensateDetailsRepository.save(compensateDetails);

        List<Long> insuranceDiseaseIdList = paramDiagnosticDTO.getInsuranceDiseaseIdList();

        if (insuranceDiseaseIdList != null && insuranceDiseaseIdList.size() > 0) {
            PetMedicalInfo medicalInfo;
            List<PetMedicalInfo> medicalInfoList = new ArrayList<>();
            for (Long aLong : insuranceDiseaseIdList) {
                medicalInfo = new PetMedicalInfo();
                medicalInfo.setMedicalDate(new Date());
                medicalInfo.setInsurancePolicyId(insurancePolicy.getInsurancePolicyId());
                medicalInfo.setInsuranceDiseaseId(aLong);
                medicalInfo.setMedicalAdvice(StringUtils.isEmpty(paramDiagnosticDTO.getMedicalAdvice()) ? "" : paramDiagnosticDTO.getMedicalAdvice());
                medicalInfoList.add(medicalInfo);
            }

            if (medicalInfoList.size() > 0) {
                medicalInfoRepository.saveAll(medicalInfoList);
            }
        }

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult addPromoter(PromoterDTO promoterDTO, Integer salesmanId) {

        PetPromoter promoter;
        if (promoterDTO.getPromoterId() != null && promoterDTO.getPromoterId() != 0) {
            promoter = promoterRepository.findByPromoterId(promoterDTO.getPromoterId());
            if (promoter == null) {
                return KVResult.put(411, "推广员不存在");
            }
        } else {
            promoter = new PetPromoter();
            promoter.setCreateDate(new Date());
        }


        if (StringUtils.isEmpty(promoterDTO.getInvitationCode())) {
            return KVResult.put(411, "推广码不能为空");
        }

        PetPromoter invitationCode = promoterRepository.findByInvitationCode(promoterDTO.getInvitationCode());

        if (invitationCode != null) {
            if (!promoter.getInvitationCode().equals(invitationCode.getInvitationCode())) {
                return KVResult.put(412, "推广码已存在");
            }

        }

        BeanUtils.copyProperties(promoterDTO, promoter);
        promoter.setSalesmanId(salesmanId);
        promoter = promoterRepository.save(promoter);

        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        List<FileDTO> saveFileList = Lists.newArrayList();

        if (promoterDTO.getIdentityCard() != null) {
            List<FileDTO> fileDTOList = promoterDTO.getIdentityCard().getFileDTOList();
            for (FileDTO fileDTO : fileDTOList) {
                fileDTO.setFileType(FileType.IDENTITY_CARD_INFO);
                fileDTO.setPromoterId(promoter.getPromoterId());
                saveFileList.add(fileDTO);
            }

        }

        if (promoterDTO.getBankCard() != null) {
            List<FileDTO> fileDTOList = promoterDTO.getBankCard().getFileDTOList();
            for (FileDTO fileDTO : fileDTOList) {
                fileDTO.setFileType(FileType.BANK_CARD_INFO);
                fileDTO.setPromoterId(promoter.getPromoterId());
                saveFileList.add(fileDTO);
            }
        }
        fileUploadDTO.setFileDTOList(saveFileList);


        fileService.upload(fileUploadDTO, salesmanId);


        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getPromoterPage(Integer page, Integer size, Integer state, Integer salesmanId) {

        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "promoterId");
        Page<PetPromoter> promoterPage = promoterRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();


            if (state != null && state != 0) {
                list.add(criteriaBuilder.equal(root.get("state").as(Integer.class), state));
            }

            if (salesmanId != null && salesmanId != 0) {
                list.add(criteriaBuilder.equal(root.get("salesmanId").as(Integer.class), salesmanId));

            }

            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);

        PageVo<PromoterVO> promoterPageVo = new PageVo<>();

        List<PetPromoter> content = promoterPage.getContent();
        List<Integer> promoterIdList = Lists.newArrayList();
        for (PetPromoter promoter : content) {
            promoterIdList.add(promoter.getPromoterId());
        }
        BeanUtils.copyProperties(promoterPage, promoterPageVo);


        List<PetFile> IDENTITY_CARD = fileService.findAllByFileTypeAndStateAndPromoterIdIn(FileType.IDENTITY_CARD_INFO, 1, promoterIdList);
        List<PetFile> BANK_CARD = fileService.findAllByFileTypeAndStateAndPromoterIdIn(FileType.BANK_CARD_INFO, 1, promoterIdList);


        PromoterVO promoterVO;
        List<PromoterVO> promoterVOList = Lists.newArrayList();

        for (PetPromoter promoter : content) {
            promoterVO = new PromoterVO();
            BeanUtils.copyProperties(promoter, promoterVO);
            List<PetFile> petFileList = Lists.newArrayList();
            for (PetFile petFile : IDENTITY_CARD) {
                if (petFile.getPromoterId().equals(promoter.getPromoterId())) {
                    petFileList.add(petFile);
                }
            }
            promoterVO.setIdentityCard(petFileList);

            petFileList = Lists.newArrayList();
            for (PetFile petFile : BANK_CARD) {
                if (petFile.getPromoterId().equals(promoter.getPromoterId())) {
                    petFileList.add(petFile);
                }
            }
            promoterVO.setBankCard(petFileList);

            promoterVOList.add(promoterVO);
        }


        promoterPageVo.setContent(promoterVOList);

        return KVResult.put(promoterPageVo);
    }

    @Override
    public KVResult getInsurancePolicyDetails(String phone, String cardNum, Integer hospitalInfoId) {

        if (StringUtils.isEmpty(phone) && StringUtils.isEmpty(cardNum)) {
            return KVResult.put(411, "用户不存在");
        }
        PetUserInfo userInfo;
        if (!StringUtils.isEmpty(phone)) {
            userInfo = userInfoRepository.findByPhone(phone);
        } else {
            PetAnimal animal = animalRepository.findByElectronicCard(cardNum);
            if (animal == null) {
                return KVResult.put(412, "电子卡号不存在");
            }
            userInfo = userInfoRepository.findByUserId(animal.getUserId());
        }

        if (userInfo == null) {
            return KVResult.put(411, "用户不存在");
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userInfo, userVO);

        List<PetInsurancePolicy> insurancePolicyList = insurancePolicyService.findByUserIdAndInsuranceStatus(userInfo.getUserId(), 2);
        insurancePolicyList.addAll(insurancePolicyService.findByUserIdAndInsuranceStatus(userInfo.getUserId(), 3));

        if (insurancePolicyList == null || insurancePolicyList.size() <= 0) {
            return KVResult.put(412, "用户没有保单信息");
        }
        InsurancePolicyVO insurancePolicyVO;
        List<InsurancePolicyVO> insurancePolicyVOList = new ArrayList<>();
        for (PetInsurancePolicy insurancePolicy : insurancePolicyList) {

            insurancePolicyVO = new InsurancePolicyVO();
            BeanUtils.copyProperties(insurancePolicy, insurancePolicyVO);

            //保单疾病
            List<PetInsuranceDisease> insuranceDiseaseList = insuranceDiseaseRepository.findAllByInsurancePolicyId(insurancePolicy.getInsurancePolicyId());
            InsuranceDiseaseVO insuranceDiseaseVO;
            List<InsuranceDiseaseVO> insuranceDiseaseVOList = new ArrayList<>();
            for (PetInsuranceDisease insuranceDisease : insuranceDiseaseList) {
                insuranceDiseaseVO = new InsuranceDiseaseVO();
                BeanUtils.copyProperties(insuranceDisease, insuranceDiseaseVO);
                insuranceDiseaseVOList.add(insuranceDiseaseVO);
            }
            insurancePolicyVO.setInsuranceDiseaseVOList(insuranceDiseaseVOList);

            //保险详情
            PetInsurance insurance = insuranceRepository.findByInsuranceId(insurancePolicy.getInsuranceId());
            InsuranceVO insuranceVO = new InsuranceVO();
            BeanUtils.copyProperties(insurance, insuranceVO);
            insurancePolicyVO.setInsuranceVO(insuranceVO);

            //宠物信息
            PetAnimal animal = animalRepository.findByAnimalId(insurancePolicy.getAnimalId());
            PetAnimalVO animalVO = new PetAnimalVO();
            BeanUtils.copyProperties(animal, animalVO);
            insurancePolicyVO.setAnimalVO(animalVO);

            //疾病分类
            List<PetDiseaseTypes> diseaseTypes = diseaseTypesRepository.findAll();
            insurancePolicyVO.setTypes(diseaseTypes);

            //就诊信息
            List<PetMedicalInfo> medicalInfoList = medicalInfoRepository.findAllByInsurancePolicyId(insurancePolicy.getInsurancePolicyId());
            PetMedicalInfoVO medicalInfoVO;
            List<PetMedicalInfoVO> medicalInfoVOList = new ArrayList<>();
            for (PetMedicalInfo medicalInfo : medicalInfoList) {
                medicalInfoVO = new PetMedicalInfoVO();
                BeanUtils.copyProperties(medicalInfo, medicalInfoVO);
                medicalInfoVOList.add(medicalInfoVO);
            }
            insurancePolicyVO.setMedicalInfoList(medicalInfoVOList);

            insurancePolicyVO.setUserVO(userVO);
            insurancePolicyVOList.add(insurancePolicyVO);
        }


        return KVResult.put(insurancePolicyVOList);
    }

    @Override
    public KVResult addSalesman(Integer salesmanId, String name, String account, String password, String phone, String region, Integer state, Integer adminId) {
        PetSalesman petSalesman;
        if (salesmanId == null || salesmanId == 0) {
            if (StringUtils.isEmpty(name) || StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
                return KVResult.put(411, "数据不完整");
            }

            petSalesman = new PetSalesman();

        } else {
            petSalesman = salesmanRepository.findBySalesmanId(salesmanId);
        }

        if (!StringUtils.isEmpty(name)) {
            petSalesman.setName(name);
        }
        if (!StringUtils.isEmpty(account)) {
            petSalesman.setAccount(account);
        }
        if (!StringUtils.isEmpty(password)) {
            petSalesman.setPassword(password);
        }
        if (!StringUtils.isEmpty(phone)) {
            petSalesman.setPhone(phone);
        }
        if (!StringUtils.isEmpty(region)) {
            petSalesman.setRegion(region);
        }
        petSalesman.setToken("");
        petSalesman.setCreateDate(new Date());
        petSalesman.setAdminId(adminId);
        if (state != null && state != 0) {
            petSalesman.setState(state);
        }
        salesmanRepository.save(petSalesman);

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getSalesmanPage(Integer page, Integer size, Integer state, Integer adminId) {
        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "salesmanId");
        Page<PetSalesman> salesmanPage = salesmanRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();

            if (state != null && state != 0) {
                list.add(criteriaBuilder.equal(root.get("state").as(Integer.class), state));
            }

            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);

        return KVResult.put(salesmanPage);

    }


}
