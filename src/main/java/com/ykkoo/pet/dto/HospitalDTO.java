package com.ykkoo.pet.dto;

import lombok.Data;

@Data
public class HospitalDTO {
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
    private FileDTO hospitalHeadPortrait;
    private String hospitalIntroduction;
    private FileUploadDTO hospitalDetailsPic;
    private String scopeProtection;
    private FileUploadDTO businessLicense;
    private Integer rebateRatio;
    private String hospitalAccount;
    private String hospitalPassword;
    private String contacts;
    private String phone;
    private String invitationCode;

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


