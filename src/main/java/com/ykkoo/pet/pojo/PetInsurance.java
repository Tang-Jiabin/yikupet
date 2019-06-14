package com.ykkoo.pet.pojo;

import lombok.Data;

import java.util.Date;

@Data
@javax.persistence.Entity
@javax.persistence.Table(name = "pet_insurance")
public class PetInsurance {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer insuranceId;
    private String insuranceName;
    private Integer insuranceType;
    private Integer insuranceState;
    private String securityCardPic;
    private Integer insurancePrice;
    private String underwritingScope;



    private Double guaranteeAmount;
    private String ageSupport;
    private Integer guaranteeTime;



    private String diseaseProtection;



    private String claimExplanation;



    private Date createDate;
    private Date updateDate;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetInsurance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */