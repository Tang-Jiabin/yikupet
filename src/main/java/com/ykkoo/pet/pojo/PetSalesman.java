package com.ykkoo.pet.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 销售员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/24
 * @email : seven_tjb@163.com
 **/
@Data
@Entity
@Table(name = "pet_salesman")
public class PetSalesman {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer salesmanId;

    private String name;

    private String account;

    private String password;

    private String token;

    private String phone;

    private String region;

    private Integer state;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    private Integer adminId;
}
