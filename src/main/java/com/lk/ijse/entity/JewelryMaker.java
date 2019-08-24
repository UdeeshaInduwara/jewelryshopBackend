package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class JewelryMaker {
    @Id
    @GeneratedValue
    private int jewMId;
    private String jewMName;
    private int contactNo;

    @OneToMany(mappedBy = "jewelryMaker", cascade = CascadeType.ALL)
    private List<JewelryMakingDetails> jewelryMakingDetails = new ArrayList<>();

    public JewelryMaker() {
    }

    public JewelryMaker(String jewMName, int contactNo) {
        this.jewMName = jewMName;
        this.contactNo = contactNo;
    }
}
