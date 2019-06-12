
package com.ykkoo.pet.vo;


import com.ykkoo.pet.pojo.PetDiseaseTypes;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class InsurancePolicyVO {
    private Integer insurancePolicyId;
    private Integer insuranceStatus;
    private Integer claimNumber;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insuranceStartDate;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insuranceEndDate;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insuranceUpdateDate;


    private String policyDocuments;
    private InsuranceVO insuranceVO;
    private PetAnimalVO animalVO;
    private List<PetDiseaseTypes> types;

    private UserVO userVO;
    private java.util.List<InsuranceDiseaseVO> insuranceDiseaseVOList;
    private java.util.List<PetMedicalInfoVO> medicalInfoList;

}

