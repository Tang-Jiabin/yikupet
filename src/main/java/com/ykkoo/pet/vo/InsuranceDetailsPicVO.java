package com.ykkoo.pet.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ykkoo.pet.common.type.FileType;
import lombok.Data;

@Data
public class InsuranceDetailsPicVO {
    private String fileUrl;
    private String jumpLink;
    private FileType fileType;
    private Integer insuranceId;
    private Integer sequence;
    private Integer state;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.util.Date uploadDate;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceDetailsPicVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */