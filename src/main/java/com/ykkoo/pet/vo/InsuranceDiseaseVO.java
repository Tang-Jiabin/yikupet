
package com.ykkoo.pet.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


@Data
public class InsuranceDiseaseVO {

    @JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
    private Long insuranceDiseaseId;
    private String diseaseName;
    private String diseaseDesc;
    private Integer claimNumber;
    private Integer specificNumber;
    private String claimExplanation;
    private Integer typeId;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceDiseaseVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */