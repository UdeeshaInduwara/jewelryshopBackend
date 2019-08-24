package com.lk.ijse.service.impl;

import com.lk.ijse.dto.GemDto;
import com.lk.ijse.entity.Gem;
import com.lk.ijse.repository.GemRepository;
import com.lk.ijse.service.GemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GemServiceImpl implements GemService {

    @Autowired
    private GemRepository gemRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveGem(GemDto dto) {
        Gem gem = new Gem();
        gem.setCarat(dto.getCarat());
        gem.setWeight(dto.getWeight());
        gem.setGemType(dto.getGemType());
        gem.setAddedDate(dto.getAddedDate());
        gemRepository.save(gem);
        return true;
    }

    @Override
    public ArrayList<GemDto> getAllGem() {
        List<Gem> gems = gemRepository.findAll();
        ArrayList<GemDto> gemDtos = new ArrayList<>();

        for (Gem gem : gems) {
            gemDtos.add(new GemDto(gem.getGemId(), gem.getGemType(), gem.getCarat(), gem.getWeight(), gem.getAddedDate()));
        }
        return gemDtos;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteGem(int id) {
        gemRepository.deleteById(id);
        return true;
    }
}
