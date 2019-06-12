package com.ykkoo.pet.pojo;

import lombok.Data;

import java.util.Date;

@Data
@javax.persistence.Entity
@javax.persistence.Table(name = "pet_user_info")
public class PetUserInfo {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer userId;
    private String headPortrait;
    private String nickName;
    private String source;
    private String inviter;
    private String phone;
    private String token;
    private Integer gender;
    private String realName;
    private String identityCard;
    private Date createDate;
    private Date updateDate;
    private Date loginDate;

}


