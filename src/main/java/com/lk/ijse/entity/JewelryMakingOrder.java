package com.lk.ijse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class JewelryMakingOrder {
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

    public JewelryMakingOrder() {
    }

    public JewelryMakingOrder(Date givenDate, Metal metal, Gem gem, JewelryMaker jewelryMaker, double givenMetalWeight) {
        this.givenDate = givenDate;
        this.metal = metal;
        this.gem = gem;
        this.jewelryMaker = jewelryMaker;
        this.givenMetalWeight = givenMetalWeight;
    }
}
