package com.lk.ijse.service;

import com.lk.ijse.dto.GemDto;

import java.util.ArrayList;

public interface GemService {
    boolean saveGem(GemDto dto);

    ArrayList<GemDto> getAllGem();

    boolean deleteGem(int id);

    int getGemCount();
}
