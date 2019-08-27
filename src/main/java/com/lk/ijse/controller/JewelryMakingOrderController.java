package com.lk.ijse.controller;

import com.lk.ijse.dto.JewelryMakingOrderDto;
import com.lk.ijse.service.JewelryMakingOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/jewelryMakingOrder")
public class JewelryMakingOrderController {

    @Autowired
    private JewelryMakingOrderService jewelryMakingOrderService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveJewelryMaker(@RequestBody JewelryMakingOrderDto jewelryMakingOrderDto) {
        return jewelryMakingOrderService.placeOrder(jewelryMakingOrderDto);
    }
}
