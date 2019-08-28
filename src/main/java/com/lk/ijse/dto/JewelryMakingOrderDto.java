package com.lk.ijse.dto;

import com.lk.ijse.entity.Gem;
import com.lk.ijse.entity.JewelryMaker;
import com.lk.ijse.entity.Metal;
import lombok.Data;

import java.util.Date;

@Data
public class JewelryMakingOrderDto {
    private int jewMDId;
    private Date givenDate;
    private MetalDto metal;
    private GemDto gem;
    private JewelryMakerDto jewelryMaker;
    private double givenMetalWeight;

    public JewelryMakingOrderDto() {
    }

    public JewelryMakingOrderDto(int jewMDId, Date givenDate, MetalDto metal, GemDto gem, JewelryMakerDto jewelryMaker, double givenMetalWeight) {
        this.jewMDId = jewMDId;
        this.givenDate = givenDate;
        this.metal = metal;
        this.gem = gem;
        this.jewelryMaker = jewelryMaker;
        this.givenMetalWeight = givenMetalWeight;
    }
}
