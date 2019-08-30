package com.lk.ijse.service;

import com.lk.ijse.dto.MetalDto;
import com.lk.ijse.dto.UpdateMetalDto;

import java.util.ArrayList;

public interface MetalService {
    boolean saveMetal(MetalDto dto);

    ArrayList<MetalDto> getAllMetal();

    boolean deleteMetal(int id);

    boolean updateMetal(UpdateMetalDto dto);

    int getMetalsCount();
}
