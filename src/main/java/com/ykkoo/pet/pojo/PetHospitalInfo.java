package com.ykkoo.pet.pojo;

import lombok.Data;

import java.util.Date;

@Data
@javax.persistence.Entity
@javax.persistence.Table(name = "pet_hospital_info")
public class PetHospitalInfo {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer hospitalInfoId;
    private Integer hospitalId;
    private Integer rebateRatio;
    private String hospitalAccount;
    private String hospitalPassword;
    private String contacts;
    private String phone;
    private String invitationCode;
    private String token;
    private Date createDate;


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


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospitalInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */