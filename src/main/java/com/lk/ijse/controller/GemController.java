package com.lk.ijse.controller;

import com.lk.ijse.service.GemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/gem")
public class GemController {

    @Autowired
    private GemService gemService;

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public String get() {
        return "hello";
    }
}
