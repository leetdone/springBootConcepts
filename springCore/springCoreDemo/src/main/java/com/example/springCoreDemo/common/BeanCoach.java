package com.example.springCoreDemo.common;

import org.springframework.context.annotation.Configuration;


public class BeanCoach implements Coach{

    public BeanCoach() {
        System.out.println("Bean Constructing");
    }

    @Override
    public String getDailyWorkout() {
        return "BeanBean";
    }
}
