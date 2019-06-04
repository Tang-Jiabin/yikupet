package com.ykkoo.pet.service.impl;

import java.util.Date;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.type.FileType;
import com.ykkoo.pet.dto.ClaimsVoucherDTO;
import com.ykkoo.pet.dto.FileDTO;
import com.ykkoo.pet.dto.FileUploadDTO;
import com.ykkoo.pet.dto.InsurancePolicyDTO;
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.PetCompensateDetailsRepository;
import com.ykkoo.pet.repository.PetInsuranceDiseaseRepository;
import com.ykkoo.pet.repository.PetInsurancePolicyRepository;
import com.ykkoo.pet.service.*;
import com.ykkoo.pet.utils.wechat.pay.TenPay;
import com.ykkoo.pet.vo.*;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 保单
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/13
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

    private PetCompensateDetailsRepository compensateDetailsRepository;
    private PetInsuranceDiseaseRepository insuranceDiseaseRepository;
    private PetInsurancePolicyRepository insurancePolicyRepository;
    private InsuranceService insuranceService;
    private PetAnimalService animalService;
    private UserService userService;
    private FileService fileService;


    @Override
    public KVResult createInsurancePolicy(InsurancePolicyDTO insurancePolicyDTO, Integer userId) {


        if (StringUtils.isEmpty(insurancePolicyDTO.getRealName()) || StringUtils.isEmpty(insurancePolicyDTO.getIdentityCard()) || StringUtils.isEmpty(insurancePolicyDTO.getPhone())) {
            return KVResult.put(411, "请填写投保人信息");
        }

        if (StringUtils.isEmpty(insurancePolicyDTO.getPetName())) {
            return KVResult.put(412, "请填写宠物名称");
        }
        if (StringUtils.isEmpty(insurancePolicyDTO.getPetAge())) {
            return KVResult.put(412, "请填写宠物年龄");
        }

        PetInsurance insurance = insuranceService.findByInsuranceId(insurancePolicyDTO.getInsuranceId());

        //更新投保人信息
        PetUserInfo userInfo = updateUserInfo(insurancePolicyDTO, userId);

        //创建宠物信息
        PetAnimal animal = createAnimal(insurancePolicyDTO, userId, insurance);

        //创建保单
        PetInsurancePolicy insurancePolicy = createInsurancePolicy(userId, insurance, animal);

        Map<String,Integer> info = Maps.newHashMap();
        info.put("an",animal.getAnimalId());
        info.put("ip",insurancePolicy.getInsurancePolicyId());
        String attach = new Gson().toJson(info);

        String title = "微宠保障卡";
        String pay = TenPay.pay(title, attach, "123", 1, insurancePolicyDTO.getIp());

        return KVResult.put(HttpStatus.OK,pay);
    }

    private PetInsurancePolicy createInsurancePolicy(Integer userId, PetInsurance insurance, PetAnimal animal) {
        PetInsurancePolicy insurancePolicy = new PetInsurancePolicy();
        insurancePolicy.setUserId(userId);
        insurancePolicy.setAnimalId(animal.getAnimalId());
        insurancePolicy.setInsuranceId(insurance.getInsuranceId());
        insurancePolicy.setInsuranceStatus(2);
        insurancePolicy.setClaimStatus(1);
        insurancePolicy.setAuditStatus(1);
        insurancePolicy.setAuditExplain("未审核");
        insurancePolicy.setClaimNumber(0);
        insurancePolicy.setCreateDate(new Date());
        insurancePolicy.setInsuranceStartDate(new Date());
        insurancePolicy.setInsuranceEndDate(new Date());
        insurancePolicy.setInsuranceUpdateDate(new Date());
        insurancePolicy.setPolicyDocuments("");
        insurancePolicy = insurancePolicyRepository.save(insurancePolicy);
        return insurancePolicy;
    }

    private PetUserInfo updateUserInfo(InsurancePolicyDTO insurancePolicyDTO, Integer userId) {
        PetUserInfo userInfo = userService.findByUserId(userId);
        userInfo.setPhone(insurancePolicyDTO.getPhone());
        userInfo.setRealName(insurancePolicyDTO.getRealName());
        userInfo.setIdentityCard(insurancePolicyDTO.getIdentityCard());
        userInfo = userService.save(userInfo);
        return userInfo;
    }

    private PetAnimal createAnimal(InsurancePolicyDTO insurancePolicyDTO, Integer userId, PetInsurance insurance) {
        //宠物种类
        int species = insurance.getInsuranceType();
        //宠物性别
        int animalSex = 0;
        //保险状态
        int insuranceStatus = 1;
        //理赔次数
        int claimsNumber = 0;
        //宠物名称
        String animalName = insurancePolicyDTO.getPetName();
        //宠物年龄
        String animalAge = insurancePolicyDTO.getPetAge();
        //宠物品种
        String animalBreeds = insurancePolicyDTO.getPetBreeds();
        //宠物头像
        String photo = "";

        PetAnimal animal = animalService.createPetAnimal(userId, species, animalSex, insuranceStatus, claimsNumber, animalName, animalAge, animalBreeds, photo);

        animal = animalService.save(animal);
        return animal;
    }

    @Override
    public List<PetInsurancePolicy> findByUserId(Integer userId) {
        return insurancePolicyRepository.findByUserId(userId);
    }

    @Override
    public KVResult getInsurancePolicyPage(Integer page, Integer insuranceStatus, Integer insuranceType, Integer claimStatus, Integer animalId, Integer userId) {

        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "insurancePolicyId");
        Page<PetInsurancePolicy> insurancePolicyPage = insurancePolicyRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();

            if (insuranceStatus != null && insuranceStatus != 0) {
                list.add(criteriaBuilder.equal(root.get("insuranceStatus").as(Integer.class), insuranceStatus));
            }
            if (insuranceType != null && insuranceType != 0) {
                list.add(criteriaBuilder.equal(root.get("insuranceType").as(Integer.class), insuranceType));
            }
            if (claimStatus != null && claimStatus != 0) {
                list.add(criteriaBuilder.equal(root.get("claimStatus").as(Integer.class), claimStatus));
            }
            if (animalId != null && animalId != 0) {
                list.add(criteriaBuilder.equal(root.get("insuranceType").as(Integer.class), animalId));
            }
            if (userId != null && userId != 0) {
                list.add(criteriaBuilder.equal(root.get("userId").as(Integer.class), userId));
            }
            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);

        //创建视图类
        List<PetInsurancePolicy> insurancePolicyList = insurancePolicyPage.getContent();
        List<InsurancePolicyVO> insurancePolicyVOList = Lists.newArrayList();
        PageVo<InsurancePolicyVO> insurancePolicyPageVo = new PageVo<>();
        BeanUtils.copyProperties(insurancePolicyPage, insurancePolicyPageVo);
        InsurancePolicyVO insurancePolicyVO;
        PetAnimalVO animalVO;
        InsuranceVO insuranceVO;

        //保险及宠物数据
        List<Integer> insuranceIdList = Lists.newArrayList();
        List<Integer> animalIdList = Lists.newArrayList();
        for (PetInsurancePolicy insurancePolicy : insurancePolicyList) {
            insuranceIdList.add(insurancePolicy.getInsuranceId());
            animalIdList.add(insurancePolicy.getAnimalId());
        }
        List<PetInsurance> insuranceList = insuranceService.findAllByInsuranceIdIn(insuranceIdList);
        List<PetAnimal> animalList = animalService.findAllByAnimalIdIn(animalIdList);

        //组合数据
        for (PetInsurancePolicy insurancePolicy : insurancePolicyList) {
            insurancePolicyVO = new InsurancePolicyVO();
            BeanUtils.copyProperties(insurancePolicy, insurancePolicyVO);

            for (PetAnimal animal : animalList) {
                if (insurancePolicy.getAnimalId().equals(animal.getAnimalId())) {
                    animalVO = new PetAnimalVO();
                    BeanUtils.copyProperties(animal, animalVO);
                    insurancePolicyVO.setAnimalVO(animalVO);
                }
            }

            for (PetInsurance insurance : insuranceList) {
                if (insurance.getInsuranceId().equals(insurancePolicy.getInsuranceId())) {
                    insuranceVO = new InsuranceVO();
                    BeanUtils.copyProperties(insurance, insuranceVO);
                    insurancePolicyVO.setInsuranceVO(insuranceVO);
                }
            }

            insurancePolicyVOList.add(insurancePolicyVO);
        }
        insurancePolicyPageVo.setContent(insurancePolicyVOList);

        return KVResult.put(insurancePolicyPageVo);
    }

    @Override
    public KVResult getInsurancePolicyDetails(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3) {
        return null;
    }

//    @Override
    public KVResult getInsurancePolicyDetails(Integer insurancePolicyId, Integer userId) {

        PetInsurancePolicy insurancePolicy = insurancePolicyRepository.findByInsurancePolicyId(insurancePolicyId);

        PetAnimal animal = animalService.findByAnimalId(insurancePolicy.getAnimalId());

        PetInsurance insurance = insuranceService.findByInsuranceId(insurancePolicy.getInsuranceId());

        List<PetInsuranceDisease> insuranceDiseasesList = insuranceDiseaseRepository.findAllByInsurancePolicyId(insurancePolicyId);

        InsurancePolicyVO insurancePolicyVO = new InsurancePolicyVO();
        BeanUtils.copyProperties(insurancePolicy, insurancePolicyVO);

        PetAnimalVO animalVO = new PetAnimalVO();
        BeanUtils.copyProperties(animal, animalVO);

        InsuranceVO insuranceVO = new InsuranceVO();
        BeanUtils.copyProperties(insurance, insuranceVO);

        InsuranceDiseaseVO insuranceDiseaseVO;
        List<InsuranceDiseaseVO> insuranceDiseaseVOList = Lists.newArrayList();
        for (PetInsuranceDisease petInsuranceDisease : insuranceDiseasesList) {
            insuranceDiseaseVO = new InsuranceDiseaseVO();
            BeanUtils.copyProperties(petInsuranceDisease, insuranceDiseaseVO);
            insuranceDiseaseVOList.add(insuranceDiseaseVO);
        }

        insurancePolicyVO.setInsuranceVO(insuranceVO);
        insurancePolicyVO.setAnimalVO(animalVO);
        insurancePolicyVO.setInsuranceDiseaseVOList(insuranceDiseaseVOList);


        return KVResult.put(insurancePolicyVO);
    }

    @Override
    public KVResult getCompensateDetails(Integer insurancePolicyId, Integer userId) {

        PetCompensateDetails compensateDetails = compensateDetailsRepository.findByInsurancePolicyIdAndCompensateStatus(insurancePolicyId, 1);
        if (compensateDetails == null) {
            return KVResult.put(411, "暂无理赔信息");
        }

        CompensateDetailsVO compensateDetailsVO = new CompensateDetailsVO();
        BeanUtils.copyProperties(compensateDetails, compensateDetailsVO);

        List<PetFile> claimInvoice = fileService.findAllByFileTypeAndStateAndCompensateId(FileType.CLAIM_INVOICE, 1, compensateDetails.getCompensateId());
        List<PetFile> claimVoucher = fileService.findAllByFileTypeAndStateAndCompensateId(FileType.CLAIM_VOUCHER, 1, compensateDetails.getCompensateId());
        List<PetFile> claimDiagnosis = fileService.findAllByFileTypeAndStateAndCompensateId(FileType.CLAIM_DIAGNOSIS, 1, compensateDetails.getCompensateId());
        compensateDetailsVO.setClaimInvoice(claimInvoice);
        compensateDetailsVO.setClaimVoucher(claimVoucher);
        compensateDetailsVO.setClaimDiagnosis(claimDiagnosis);


        return KVResult.put(compensateDetailsVO);
    }

    @Override
    public List<PetInsurancePolicy> findByUserIdAndInsuranceStatus(Integer userId, int status) {
        return insurancePolicyRepository.findByUserIdAndInsuranceStatus(userId, status);
    }

    @Override
    public KVResult applyClaims(Integer insurancePolicyId, Integer userId) {
        PetInsurancePolicy insurancePolicy = insurancePolicyRepository.findByInsurancePolicyId(insurancePolicyId);
        if (insurancePolicy.getClaimStatus() != 1 && insurancePolicy.getClaimStatus() != 5) {
            return KVResult.put(411, "当前保单您已申请过理赔或理赔尚未完成");
        }
        insurancePolicy.setClaimStatus(2);
        insurancePolicy.setAuditStatus(1);
        insurancePolicy.setAuditExplain("未审核");
        insurancePolicy.setInsuranceUpdateDate(new Date());
        insurancePolicyRepository.save(insurancePolicy);

        PetInsurance insurance = insuranceService.findByInsuranceId(insurancePolicy.getInsuranceId());

        PetCompensateDetails compensateDetails = new PetCompensateDetails();
        compensateDetails.setInsurancePolicyId(insurancePolicyId);
        compensateDetails.setCompensateStatus(1);
        compensateDetails.setApplicationDate(new Date());
        compensateDetails.setUpdateDate(new Date());
        compensateDetails.setInsuranceName(insurance.getInsuranceName());
        compensateDetails.setInsuranceStartDate(insurancePolicy.getInsuranceStartDate());
        compensateDetails.setInsuranceEndDate(insurancePolicy.getInsuranceEndDate());
        compensateDetailsRepository.save(compensateDetails);

        CompensateDetailsVO compensateDetailsVO = new CompensateDetailsVO();
        BeanUtils.copyProperties(compensateDetails,compensateDetailsVO);

        return KVResult.put(compensateDetailsVO);
    }

    @Override
    public KVResult uploadClaimsVoucher(ClaimsVoucherDTO claimsVoucherDTO, Integer userId) {

        PetCompensateDetails compensateDetails = compensateDetailsRepository.findByCompensateId(claimsVoucherDTO.getCompensateId());
        if (compensateDetails == null) {
            return KVResult.put(411,"尚未申请理赔");
        }
        List<FileDTO> claimDiagnosisList = claimsVoucherDTO.getClaimDiagnosisList();
        List<FileDTO> claimInvoiceList = claimsVoucherDTO.getClaimInvoiceList();

        for (FileDTO fileDTO : claimDiagnosisList) {
            fileDTO.setFileType(FileType.CLAIM_DIAGNOSIS);
            fileDTO.setCompensateId(claimsVoucherDTO.getCompensateId());
            fileDTO.setUploadPath(String.format("compensate/%s/diagnosis/",claimsVoucherDTO.getCompensateId()));
        }
        FileUploadDTO claimDiagnosis = new FileUploadDTO();
        claimDiagnosis.setFileDTOList(claimDiagnosisList);

        for (FileDTO fileDTO : claimInvoiceList) {
            fileDTO.setFileType(FileType.CLAIM_INVOICE);
            fileDTO.setCompensateId(claimsVoucherDTO.getCompensateId());
            fileDTO.setUploadPath(String.format("compensate/%s/invoice/",claimsVoucherDTO.getCompensateId()));
        }
        FileUploadDTO claimInvoice = new FileUploadDTO();
        claimDiagnosis.setFileDTOList(claimInvoiceList);

        KVResult<Map<String, Object>> diagnosis = fileService.upload(claimDiagnosis, userId);
        KVResult<Map<String, Object>> invoice = fileService.upload(claimInvoice, userId);


        Map<String, Object> resultMap = Maps.newHashMap();

        int total = 0;
        int successNum = 0;
        int failNum = 0;
        List<String> success = Lists.newArrayList();
        List<String> fail = Lists.newArrayList();

        if (diagnosis.getKey() == 200) {
            Map<String, Object> diagnosisMap = invoice.getVal();
            getResultMap(total,successNum,failNum,success,fail,diagnosisMap);

        }
        if (invoice.getKey()==200) {
            Map<String, Object> invoiceMap = invoice.getVal();
            getResultMap(total,successNum,failNum,success,fail,invoiceMap);
        }

        resultMap.put("total", total);
        resultMap.put("successNum", successNum);
        resultMap.put("failNum", failNum);
        resultMap.put("fail", fail);
        resultMap.put("success", success);
        resultMap.put("errMsg", "");

        return KVResult.put(resultMap);
    }

    @Override
    public List<InsuranceDiseaseVO> findAllInsuranceDiseaseByReservationId(Integer paramInteger) {
        return null;
    }

    @Override
    public KVResult getCompensatePage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString, Integer paramInteger4, Integer paramInteger5) {
        return null;
    }

    @Override
    public KVResult updateCompensateInfo(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString, Integer paramInteger4) {
        return null;
    }

    @Override
    public KVResult updateCompensateInfo(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3) {
        return null;
    }

    @Override
    public PetInsurancePolicy findByInsurancePolicyId(Integer paramInteger) {
        return null;
    }

    @Override
    public PetInsurancePolicy save(PetInsurancePolicy paramPetInsurancePolicy) {
        return null;
    }

    @Override
    public KVResult getInsurancePolicyPage(Integer paramInteger1, String paramString1, String paramString2, Integer paramInteger2) {
        return null;
    }

    private void getResultMap(int total,int successNum,int failNum,List<String> success,List<String> fail,Map<String, Object> map){
        total = (Integer) map.get("total");
        successNum = (Integer) map.get("successNum");
        failNum = (Integer) map.get("failNum");
        success.addAll((ArrayList<String>)map.get("success"));
        fail.addAll((ArrayList<String>)map.get("fail"));
    }


}