package com.ykkoo.pet.pojo;

import com.ykkoo.pet.dto.FileUploadDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 推广员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/12
 * @email : seven_tjb@163.com
 **/
@Data
@Entity
@Table(name = "pet_promoter")
public class PetPromoter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
