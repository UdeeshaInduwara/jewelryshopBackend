package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "metal", cascade = CascadeType.ALL)
    private List<JewelryMakingDetails> jewelryMakingDetails = new ArrayList<>();
}
