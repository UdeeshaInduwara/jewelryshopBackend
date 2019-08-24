package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Metal {
    @Id
    @GeneratedValue
    private int metalId;
    private String metalType;
    private int carat;
    private double weight;
    private Date addedDate;
}
