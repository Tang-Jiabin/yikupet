package com.ykkoo.pet.vo;

import lombok.Data;

import java.util.Date;

@Data
public class InsuranceEvaluationVO {
    private String headPortrait;
    private String userName;
    private Integer starClass;
    private String evaluate;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date evaluateDate;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceEvaluationVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */