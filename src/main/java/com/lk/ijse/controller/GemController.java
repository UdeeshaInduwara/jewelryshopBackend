package com.lk.ijse.controller;

import com.lk.ijse.dto.GemDto;
import com.lk.ijse.service.GemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/gem")
public class GemController {

    @Autowired
    private GemService gemService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveGem(@RequestBody GemDto gem) {
        return gemService.saveGem(gem);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<GemDto> getAllGem() {
        return gemService.getAllGem();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteGem(@PathVariable("id") int gemId) {
        return gemService.deleteGem(gemId);
    }

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getGemCount() {
        return gemService.getGemCount();
    }
}
