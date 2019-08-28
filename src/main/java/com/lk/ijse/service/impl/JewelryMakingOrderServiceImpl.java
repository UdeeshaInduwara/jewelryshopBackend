package com.lk.ijse.service.impl;

import com.lk.ijse.dto.JewelryMakingOrderDto;
import com.lk.ijse.entity.Gem;
import com.lk.ijse.entity.JewelryMaker;
import com.lk.ijse.entity.JewelryMakingOrder;
import com.lk.ijse.entity.Metal;
import com.lk.ijse.repository.GemRepository;
import com.lk.ijse.repository.JewelryMakerRepository;
import com.lk.ijse.repository.JewelryMakingOrderRepository;
import com.lk.ijse.repository.MetalRepository;
import com.lk.ijse.service.JewelryMakingOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class JewelryMakingOrderServiceImpl implements JewelryMakingOrderService {

    @Autowired
    private JewelryMakingOrderRepository jewelryMakingOrderRepository;

    @Autowired
    private GemRepository gemRepository;

    @Autowired
    private MetalRepository metalRepository;

    @Autowired
    private JewelryMakerRepository jewelryMakerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean placeOrder(JewelryMakingOrderDto dto) {
        JewelryMakingOrder jewelryMakingOrder = new JewelryMakingOrder();
        jewelryMakingOrder.setGivenDate(dto.getGivenDate());
        jewelryMakingOrder.setGivenMetalWeight(dto.getGivenMetalWeight());

        Gem gem = gemRepository.findById(dto.getGem().getGemId()).get();
        jewelryMakingOrder.setGem(gem);
        gem.setGivenDate(dto.getGivenDate());

        Metal metal = metalRepository.findById(dto.getMetal().getMetalId()).get();
        jewelryMakingOrder.setMetal(metal);
        metal.setWeight((metal.getWeight() - dto.getGivenMetalWeight()));

        JewelryMaker jewelryMaker = jewelryMakerRepository.findById(dto.getJewelryMaker().getJewMId()).get();
        jewelryMakingOrder.setJewelryMaker(jewelryMaker);

        jewelryMakingOrderRepository.save(jewelryMakingOrder);
        return true;
    }
}
