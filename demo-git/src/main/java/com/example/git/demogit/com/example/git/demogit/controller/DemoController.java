package com.example.git.demogit.com.example.git.demogit.controller;

import com.example.git.demogit.com.example.git.demogit.controller.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
public class DemoController {

    @GetMapping(value = "/rest/getname/" )
    public String geetName(){
//
        return "Welcome Demo Controller";
    }

    public String postOperation( @RequestBody Employee employee){
        return null;
    }
}
