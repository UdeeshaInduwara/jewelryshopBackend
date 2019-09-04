package com.lk.ijse.controller;

import com.lk.ijse.dto.UserDto;
import com.lk.ijse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean logIn(@RequestBody UserDto user) {
        return userService.canAuthenticate(user);
    }
}
