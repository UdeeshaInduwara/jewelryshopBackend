package com.lk.ijse.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GemDto {
    private String gemId;
    private String gemType;
    private int carat;
    private double weight;
    private Date addedDate;
}
