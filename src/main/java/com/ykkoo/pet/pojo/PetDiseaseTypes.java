package com.ykkoo.pet.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * 疾病种类
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/11
 * @email : seven_tjb@163.com
 **/
@Data
@Entity
@Table(name = "pet_disease_types")
public class PetDiseaseTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;

    private String typeName;

}
