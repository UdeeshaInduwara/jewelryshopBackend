package com.lk.ijse.service.impl;

import com.lk.ijse.dto.JewelryMakingOrderDto;
import com.lk.ijse.service.JewelryMakingOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class JewelryMakingOrderServiceImpl implements JewelryMakingOrderService {

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean placeOrder(JewelryMakingOrderDto jewelryMakingOrderDto) {
        return false;
    }
}
