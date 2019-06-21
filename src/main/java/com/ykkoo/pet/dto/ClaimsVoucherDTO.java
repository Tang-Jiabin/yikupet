package com.ykkoo.pet.dto;

import lombok.Data;

import java.util.List;


@Data
public class ClaimsVoucherDTO {
    private Integer compensateId;

    private List<FileDTO> claimInvoiceList;

    private List<FileDTO> claimDiagnosisList;

    private List<FileDTO> idPictureList;

    private String cardNumber;

    private String name;

    private String address;


}
