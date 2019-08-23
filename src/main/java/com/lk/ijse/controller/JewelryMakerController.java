package com.lk.ijse.controller;

import com.lk.ijse.service.JewelryMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/jewelryMaker")
public class JewelryMakerController {

    @Autowired
    private JewelryMakerService jewelryMakerService;
}
