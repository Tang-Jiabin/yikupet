
package com.ykkoo.pet.vo;


import lombok.Data;

import java.util.Date;

@Data
public class CompensateDetailsVO {
    private Integer compensateId;
    private Integer userId;
    private Integer claimStatus;
    private Integer auditStatus;
    private String auditExplain;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applicationDate;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    private String cardNumber;

    private String name;

    private String address;





    private String insuranceName;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insuranceStartDate;




    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insuranceEndDate;





    private InsurancePolicyVO insurancePolicyVO;
    private UserVO userVO;





    private java.util.List<com.ykkoo.pet.pojo.PetFile> claimInvoice;
    private java.util.List<com.ykkoo.pet.pojo.PetFile> claimDiagnosis;
    private java.util.List<com.ykkoo.pet.pojo.PetFile> claimVoucher;



}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/CompensateDetailsVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */