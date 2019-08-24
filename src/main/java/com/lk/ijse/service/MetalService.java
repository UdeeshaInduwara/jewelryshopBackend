package com.lk.ijse.service;

import com.lk.ijse.dto.MetalDto;

import java.util.ArrayList;

public interface MetalService {
    boolean saveMetal(MetalDto dto);

    ArrayList<MetalDto> getAllMetal();

    boolean deleteMetal(int id);
}
