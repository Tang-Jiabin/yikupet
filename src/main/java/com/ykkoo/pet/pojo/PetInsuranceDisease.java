package com.ykkoo.pet.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name = "pet_insurance_disease")
@Data
public class PetInsuranceDisease {

    @javax.persistence.Id
    @JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
    private Long insuranceDiseaseId;
    private Integer reservationId;
    private Integer insurancePolicyId;
    private String diseaseName;
    private String diseaseDesc;
    private Integer claimNumber;
    private Integer specificNumber;
    private String claimExplanation;
    @Column(name="type_Id" ,nullable=false,columnDefinition="INT default 0")
    private Integer typeId;
    private Double claimAmount;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetInsuranceDisease.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */