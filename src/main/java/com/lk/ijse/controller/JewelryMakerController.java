package com.lk.ijse.controller;

import com.lk.ijse.dto.JewelryMakerDto;
import com.lk.ijse.service.JewelryMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/jewelryMaker")
public class JewelryMakerController {

    @Autowired
    private JewelryMakerService jewelryMakerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveJewelryMaker(@RequestBody JewelryMakerDto jewelryMaker) {
        return jewelryMakerService.saveJewelryMaker(jewelryMaker);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<JewelryMakerDto> getAllJewelryMaker() {
        return jewelryMakerService.getAllJewelryMaker();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteJewelryMaker(@PathVariable("id") int jewelryMakerId) {
        return jewelryMakerService.deleteJewelryMaker(jewelryMakerId);
    }

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getJewelryMakersCount() {
        return jewelryMakerService.getJewelryMakersCount();
    }
}
