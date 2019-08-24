package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
public class Gem {
    @Id
    @GeneratedValue
    private int gemId;
    private String gemType;
    private int carat;
    private double weight;
    private Date addedDate;
}
