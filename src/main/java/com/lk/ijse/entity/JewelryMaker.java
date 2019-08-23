package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class JewelryMaker {
    @Id
    private String jewMId;
    private String jewMName;
    private int contactNo;
}
