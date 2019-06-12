package com.ykkoo.pet.vo;

import com.ykkoo.pet.pojo.PetFile;
import lombok.Data;

import java.util.List;

@Data
public class HospitalVO {
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


    private List<PetFile> hospitalHeadPortrait;
    private String hospitalIntroduction;



    private String scopeProtection;
    private List<PetFile> hospitalDetailsPic;
    private List<PetFile> businessLicense;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.util.Date createDate;
    private HospitalInfoVO hospitalInfoVO;

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


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/HospitalVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */