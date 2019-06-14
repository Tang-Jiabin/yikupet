
package com.ykkoo.pet.dto;


import lombok.Data;

import java.util.List;

@Data
public class InsuranceDTO {
    private Integer insuranceId;
    private String insuranceName;
    private Integer insuranceType;
    private Integer insuranceState;
    private FileDTO securityCardPic;
    private Integer insurancePrice;
    private String underwritingScope;
    private Double guaranteeAmount;
    private String ageSupport;
    private Integer guaranteeTime;
    private String diseaseProtection;
    private String claimExplanation;
    private FileUploadDTO insuranceDetailsPic;
    private List<DiseaseDTO> disease;


}


