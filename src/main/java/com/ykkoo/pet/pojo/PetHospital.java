package com.ykkoo.pet.pojo;

import lombok.Data;

import java.util.Date;

@Data
@javax.persistence.Entity
@javax.persistence.Table(name = "pet_hospital")
public class PetHospital {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer hospitalId;
    private String hospitalName;
    private String longitude;
    private String latitude;
    private String region;
    private String detailedAddress;
    private String tel;



    private Integer hospitalType;
    private Integer hospitalScope;
    private Integer cooperationState;
    private String hospitalHeadPortrait;


    private String hospitalIntroduction;
    private String scopeProtection;


    private Date createDate;
    private Date updateDate;


    /**
     * 城市
     */
    private String city;

    /**
     * 姓名
     */
    private String salesmanName;
    /**
     * 电话
     */
    private String salesmanTel;
    /**
     * 银行卡号
     */
    private String salesmanCardNumber;
    /**
     * 开户行
     */
    private String salesmanBank;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospital.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */