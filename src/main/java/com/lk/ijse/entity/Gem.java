package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Gem {
    @Id
    private String gemId;
    private String gemType;
    private int carat;
    private double weight;
    private Date addedDate;
}
