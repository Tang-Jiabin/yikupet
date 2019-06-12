
package com.ykkoo.pet.pojo;


import lombok.Data;

import java.util.Date;


/**
 * @author J.Tang
 */
@Data

@javax.persistence.Entity

@javax.persistence.Table(name = "pet_compensate_details")
public class PetCompensateDetails {

    @javax.persistence.Id

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer compensateId;
    private Integer insurancePolicyId;
    private Integer userId;
    private Integer claimStatus;
    private Integer auditStatus;
    private Integer compensateStatus;
    private String auditExplain;
    private Date applicationDate;
    private Date updateDate;
    private String insuranceName;
    private Date insuranceStartDate;
    private Date insuranceEndDate;

    private String cardNumber;

    private String name;

    private String address;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetCompensateDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */