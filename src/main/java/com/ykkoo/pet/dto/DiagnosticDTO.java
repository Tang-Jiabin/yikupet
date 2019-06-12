package com.ykkoo.pet.dto;

import lombok.Data;

import java.util.List;

@Data
public class DiagnosticDTO {
    private Integer insurancePolicyId;
    private List<Long> insuranceDiseaseIdList;
    private String medicalAdvice;
    private String doctorName;
    private String doctorTel;
}


