package com.lk.ijse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class JewelryMakingDetails {
    @Id
    @GeneratedValue
    private int jewMDId;
    private Date givenDate;

    @ManyToOne
    private Metal metal;

    @ManyToOne
    private Gem gem;

    @ManyToOne
    private JewelryMaker jewelryMaker;

    private double givenMetalWeight;
}
