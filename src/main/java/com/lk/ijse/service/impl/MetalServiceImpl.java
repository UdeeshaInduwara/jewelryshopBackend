package com.lk.ijse.service.impl;

import com.lk.ijse.dto.MetalDto;
import com.lk.ijse.dto.UpdateMetalDto;
import com.lk.ijse.entity.Metal;
import com.lk.ijse.repository.MetalRepository;
import com.lk.ijse.service.MetalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MetalServiceImpl implements MetalService {

    @Autowired
    private MetalRepository metalRepository;

    @Override
    public boolean saveMetal(MetalDto dto) {
        Metal metal = new Metal();
        metal.setMetalType(dto.getMetalType());
        metal.setCarat(dto.getCarat());
        metal.setWeight(dto.getWeight());
        metal.setAddedDate(dto.getAddedDate());
        metalRepository.save(metal);
        return true;
    }

    @Override
    public ArrayList<MetalDto> getAllMetal() {
        List<Metal> metals = metalRepository.findAll();
        ArrayList<MetalDto> metalDtos = new ArrayList<>();

        for (Metal metal : metals) {
            metalDtos.add(new MetalDto(metal.getMetalId(), metal.getMetalType(), metal.getCarat(), metal.getWeight(),
                    metal.getAddedDate()));
        }
        return metalDtos;
    }

    @Override
    public boolean deleteMetal(int id) {
        metalRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateMetal(UpdateMetalDto dto) {
        Metal metal = metalRepository.findById(dto.getMetalId()).get();
        metal.setWeight((metal.getWeight() + dto.getUpdatedWeight()));
        metalRepository.save(metal);
        return true;
    }

    @Override
    public int getMetalsCount() {
        return metalRepository.getMetalCount();
    }
}
