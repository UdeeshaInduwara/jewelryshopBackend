package com.lk.ijse.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MetalDto {
    private String metalId;
    private String metalType;
    private int carat;
    private double weight;
    private Date addedDate;
}
