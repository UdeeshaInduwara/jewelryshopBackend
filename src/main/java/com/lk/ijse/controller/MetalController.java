package com.lk.ijse.controller;

import com.lk.ijse.dto.MetalDto;
import com.lk.ijse.dto.UpdateMetalDto;
import com.lk.ijse.service.MetalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/metal")
public class MetalController {

    @Autowired
    private MetalService metalService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveMetal(@RequestBody MetalDto metal) {
        return metalService.saveMetal(metal);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<MetalDto> getAllMetal() {
        return metalService.getAllMetal();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteMetal(@PathVariable("id") int metalId) {
        return metalService.deleteMetal(metalId);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateMetal(@RequestBody UpdateMetalDto metal) {
        return metalService.updateMetal(metal);
    }

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getMetalCount() {
        return metalService.getMetalsCount();
    }
}
