package com.lk.ijse.service;

import com.lk.ijse.dto.JewelryMakingOrderDto;

import java.util.ArrayList;

public interface JewelryMakingOrderService {
    boolean placeOrder(JewelryMakingOrderDto jewelryMakingOrderDto);

    ArrayList<JewelryMakingOrderDto> getAllOrders();

    int getOrdersCount();
}
