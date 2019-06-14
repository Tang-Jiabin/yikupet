package com.ykkoo.pet.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "pet_insurance_policy")
public class PetInsurancePolicy {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer insurancePolicyId;
    private Integer userId;
    private Integer animalId;
    private Integer insuranceId;
    private Integer insuranceType;
    private Integer insuranceStatus;
    private Integer claimStatus;
    private Integer auditStatus;
    private String auditExplain;
    private Integer claimNumber;
    private Date createDate;
    private Date insuranceStartDate;
    private Date insuranceEndDate;
    private Date insuranceUpdateDate;
    private String policyDocuments;
    private String address;
    private Double guaranteeAmount;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetInsurancePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */