package com.example.springCoreDemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Lazy
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 15 minutes!?!";
    }
}
