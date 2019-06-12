package com.ykkoo.pet.dto;

import lombok.Data;

import java.util.List;


@Data
public class ClaimsVoucherDTO {
    private Integer compensateId;
    //改成身份证
    private List<FileDTO> claimInvoiceList;
    private List<FileDTO> claimDiagnosisList;

    private String cardNumber;

    private String name;

    private String address;


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/ClaimsVoucherDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */