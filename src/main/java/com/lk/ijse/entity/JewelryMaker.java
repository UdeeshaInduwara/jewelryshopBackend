package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class JewelryMaker {
    @Id
    @GeneratedValue
    private int jewMId;
    private String jewMName;
    private int contactNo;
}
