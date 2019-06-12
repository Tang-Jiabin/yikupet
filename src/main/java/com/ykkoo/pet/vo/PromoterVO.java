package com.ykkoo.pet.vo;

import com.ykkoo.pet.dto.FileUploadDTO;
import com.ykkoo.pet.pojo.PetFile;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/12
 * @email : seven_tjb@163.com
 **/
@Data
public class PromoterVO {

    private Integer promoterId;

    private  String promotionUnit;

    private  String promotionName;

    private  String contactNumber;

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

    private String token;

    private Date createDate;

    private Integer adminId;

    private List<PetFile>   identityCard;

    private  List<PetFile>  bankCard;

}
