package com.example.blakespringbootstart.controller;

import com.example.blakespringbootstart.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/myController")
    public String test() {
        return myService.testMyStarter();
    }
}
