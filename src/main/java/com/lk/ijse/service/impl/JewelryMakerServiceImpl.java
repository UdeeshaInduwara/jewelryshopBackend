package com.lk.ijse.service.impl;

import com.lk.ijse.dto.JewelryMakerDto;
import com.lk.ijse.entity.JewelryMaker;
import com.lk.ijse.repository.JewelryMakerRepository;
import com.lk.ijse.service.JewelryMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class JewelryMakerServiceImpl implements JewelryMakerService {

    @Autowired
    private JewelryMakerRepository jewelryMakerRepository;

    @Override
    public boolean saveJewelryMaker(JewelryMakerDto dto) {
        JewelryMaker jewelryMaker = new JewelryMaker();
        jewelryMaker.setJewMName(dto.getJewMName());
        jewelryMaker.setContactNo(dto.getContactNo());
        jewelryMakerRepository.save(jewelryMaker);
        return true;
    }

    @Override
    public ArrayList<JewelryMakerDto> getAllJewelryMaker() {
        List<JewelryMaker> jewelryMakers = jewelryMakerRepository.findAll();
        ArrayList<JewelryMakerDto> jewelryMakerDtos = new ArrayList<>();

        for (JewelryMaker jewelryMaker : jewelryMakers) {
            jewelryMakerDtos.add(new JewelryMakerDto(jewelryMaker.getJewMId(), jewelryMaker.getJewMName(),
                    jewelryMaker.getContactNo()));
        }
        return jewelryMakerDtos;
    }

    @Override
    public boolean deleteJewelryMaker(int id) {
        jewelryMakerRepository.deleteById(id);
        return true;
    }

    @Override
    public int getJewelryMakersCount() {
        return jewelryMakerRepository.getMakersCount();
    }
}
