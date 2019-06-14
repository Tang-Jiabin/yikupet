
package com.ykkoo.pet.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ykkoo.pet.pojo.PetDisease;
import com.ykkoo.pet.pojo.PetDiseaseTypes;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class InsuranceVO {

    private Integer insuranceId;
    private String securityCardPic;
    private String insuranceName;
    private Integer insuranceType;
    private Integer insuranceState;
    private Integer insurancePrice;
    private String underwritingScope;
    private String guaranteeAmount;
    private String ageSupport;
    private Integer guaranteeTime;
    private InsuranceEvaluationVO insuranceEvaluation;
    private List<InsuranceDetailsPicVO> insuranceDetailsPicList;
    private String diseaseProtection;
    private String claimExplanation;
    private List<PetDisease> disease;
    private List<PetDiseaseTypes> diseaseTypes;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */