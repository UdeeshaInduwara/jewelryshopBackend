package com.lk.ijse.dto;

import lombok.Data;

@Data
public class UpdateMetalDto {
    private int metalId;
    private double updatedWeight;

    public UpdateMetalDto() {
    }

    public UpdateMetalDto(int metalId, double updatedWeight) {
        this.metalId = metalId;
        this.updatedWeight = updatedWeight;
    }
}
