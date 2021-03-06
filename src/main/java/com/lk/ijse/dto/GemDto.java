package com.lk.ijse.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GemDto {
    private int gemId;
    private String gemType;
    private int carat;
    private double weight;
    private Date addedDate;
    private Date givenDate;

    public GemDto() {
    }

    public GemDto(int gemId, String gemType, int carat, double weight, Date addedDate, Date givenDate) {
        this.gemId = gemId;
        this.gemType = gemType;
        this.carat = carat;
        this.weight = weight;
        this.addedDate = addedDate;
        this.givenDate = givenDate;
    }
}
