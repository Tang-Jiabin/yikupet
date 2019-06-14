
package com.ykkoo.pet.pojo;


import lombok.Data;

import java.util.Date;


@javax.persistence.Entity
@Data
@javax.persistence.Table(name = "pet_hospital_withdrawal")
public class PetHospitalWithdrawal {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer withdrawalId;
    private Integer hospitalId;
    private Double amount;
    private String cardNumber;
    private Integer promoterId;
    private String cardBank;
    private String name;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applyDate;
    private Integer state;

    /**
     * 1-商户 2-推广员
     */
    private Integer type;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospitalWithdrawal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */