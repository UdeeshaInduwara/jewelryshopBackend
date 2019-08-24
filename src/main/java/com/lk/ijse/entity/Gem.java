package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private Date givenDate;
    private boolean availability;

    @OneToMany(mappedBy = "gem", cascade = CascadeType.ALL)
    private List<JewelryMakingDetails> jewelryMakingDetails = new ArrayList<>();
}
