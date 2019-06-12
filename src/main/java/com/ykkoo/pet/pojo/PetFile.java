package com.ykkoo.pet.pojo;

import com.ykkoo.pet.common.type.FileType;
import lombok.Data;

import java.util.Date;

@Data
@javax.persistence.Table(name = "pet_file")
@javax.persistence.Entity
public class PetFile implements Comparable<PetFile> {
    @javax.persistence.Id
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
    private Long fileId;
    private String fileUrl;
    private String jumpLink;
    private FileType fileType;
    private Integer insuranceId;
    private Integer hospitalId;
    private Integer promoterId;



    private Integer compensateId;
    private Integer reservationId;
    private Integer sequence;
    private Integer state;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date uploadDate;
    private Integer adminId;

     @Override
     public int compareTo(PetFile o) {
        /* 86 */
        return this.sequence.intValue() - o.sequence.intValue();
    }
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */