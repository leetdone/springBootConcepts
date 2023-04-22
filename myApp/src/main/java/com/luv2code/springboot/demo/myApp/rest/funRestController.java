package com.luv2code.springboot.demo.myApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @Value("${lin.name}")
    private String userName;

    //expose "/" that return "hello world"
    @GetMapping("/")
    public String sayHi(){
        return "Hi";
    }

    @GetMapping("/dev")
    public String devTest(){
        return "dev Worksdgg?";
    }

    @GetMapping("yourName")
    public String getName(){
        return userName;
    }
}
