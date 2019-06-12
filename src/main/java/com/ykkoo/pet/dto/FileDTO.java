package com.ykkoo.pet.dto;

import com.ykkoo.pet.common.type.FileType;
import lombok.Data;

@Data
public class FileDTO {
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
    private Long fileId;
    private String alias;
    private String uploadPath;
    private String jumpLink;
    private FileType fileType;
    private Integer insuranceId;

    private Integer promoterId;
    private Integer hospitalId;
    private Integer compensateId;
    private Integer reservationId;
    private Integer sequence;
    private String fileName;
    private Integer state;
    private org.springframework.web.multipart.MultipartFile file;

}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/FileDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */