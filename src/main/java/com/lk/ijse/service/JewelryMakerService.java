package com.lk.ijse.service;

import com.lk.ijse.dto.JewelryMakerDto;

import java.util.ArrayList;

public interface JewelryMakerService {
    boolean saveJewelryMaker(JewelryMakerDto dto);

    ArrayList<JewelryMakerDto> getAllJewelryMaker();

    boolean deleteJewelryMaker(int id);

    int getJewelryMakersCount();
}
