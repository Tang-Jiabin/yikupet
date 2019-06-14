package com.ykkoo.pet.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;

@Data
@javax.persistence.Entity
@javax.persistence.Table(name = "pet_disease")
public class PetDisease {
    @javax.persistence.Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer diseaseId;
    private Integer insuranceId;
    private String diseaseName;
    private Integer diseaseState;
    private Integer typeId;

    private String diseaseDesc;
    private Integer claimNumber;
    private Integer specificNumber;
    private String claimExplanation;
    private Double claimAmount;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetDisease.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */