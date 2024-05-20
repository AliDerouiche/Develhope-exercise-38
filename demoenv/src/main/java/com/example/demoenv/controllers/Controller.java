package com.example.demoenv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/get")
    public String hello() {
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return "Developer name is: " + devName + ", This is the relative auth code: " + authCode;
    }
}