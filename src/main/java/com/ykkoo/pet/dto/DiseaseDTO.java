
package com.ykkoo.pet.dto;


import lombok.Data;

@Data
public class DiseaseDTO {
    private Integer diseaseId;
    private String diseaseName;
    private Integer diseaseState;
    private String diseaseDesc;
    private Integer claimNumber;
    private Integer specificNumber;
    private String claimExplanation;
    private Integer typeId;
    private Double claimAmount;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/DiseaseDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */