package com.example.springCoreDemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In construction" + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "tennis is running";
    }
}
