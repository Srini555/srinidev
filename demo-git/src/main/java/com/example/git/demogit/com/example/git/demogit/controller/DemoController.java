package com.example.git.demogit.com.example.git.demogit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/rest/getname/")
    public String geetName(){

        return "Welcome Demo Controller";
    }
}
