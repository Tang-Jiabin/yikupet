package com.ykkoo.pet.pojo;

import lombok.Data;

import java.util.Date;

@Data
@javax.persistence.Entity
@javax.persistence.Table(name = "pet_hospital_account")
public class PetHospitalAccount {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer accountId;
    private Integer hospitalId;
    private Integer promoterId;
    private Double money;
    private Integer type;
    private Date date;
    private String source;
    private Integer ratio;
    private Integer state;
    private Integer withdrawalId;

    /**
     * 账户类型 1-商户 2-推广员
     */
    private Integer accountType;

    /**
     * 保险名称
     */
    private String insuranceName;
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospitalAccount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */