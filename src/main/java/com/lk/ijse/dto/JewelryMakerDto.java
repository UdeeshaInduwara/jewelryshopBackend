package com.lk.ijse.dto;

import lombok.Data;

@Data
public class JewelryMakerDto {
    private int jewMId;
    private String jewMName;
    private int contactNo;

    public JewelryMakerDto() {
    }

    public JewelryMakerDto(int jewMId, String jewMName, int contactNo) {
        this.jewMId = jewMId;
        this.jewMName = jewMName;
        this.contactNo = contactNo;
    }
}
