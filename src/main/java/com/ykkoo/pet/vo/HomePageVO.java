
package com.ykkoo.pet.vo;


import lombok.Data;

import java.util.List;


@Data
public class HomePageVO {
    private List<RotationChartVO> rotationChartVOList;
    private List<InsuranceBriefVO> insuranceBriefVOList;
    private List<InsuranceVO> insuranceVOList;
    private Integer members;
    private Integer cost;
    private Integer show;

    private String floatingWindowPictures;
    private String floatingWindowLink;
    private String publicNumberPictures;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/HomePageVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */