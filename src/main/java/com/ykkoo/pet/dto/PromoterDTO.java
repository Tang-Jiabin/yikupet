package com.ykkoo.pet.dto;

import lombok.Data;

/**
 * 推广员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/12
 * @email : seven_tjb@163.com
 **/
@Data
public class PromoterDTO {

    private Integer promoterId;

    private  String promotionUnit;

    private  String promotionName;

    private  String contactNumber;

    private  FileUploadDTO identityCard;

    private  FileUploadDTO  bankCard;

    private  String  invitationCode;

    private  String bankCardNumber;

    private  String openBank;

    private  String promotionArea;

    private  String returnRatio;

    private  String accountNumber;

    private  String  password;

    private  Integer  state;

    private  String salesmanName;

    private  String salesmanTelephone;
}
