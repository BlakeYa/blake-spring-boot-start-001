package com.example.blakespringbootstartuser.controller;

import com.example.blakespringbootstart.controller.MyController;
import com.example.blakespringbootstart.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlakeController {

    @Autowired
    private MyService myService;

    @GetMapping("/my")
    public String test() {
        return myService.testMyStarter();
    }
}
