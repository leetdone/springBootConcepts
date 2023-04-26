package com.example.springCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

//    @PostConstruct
//    public void startup(){
//        System.out.println("starting!");
//    }
//
//    @PreDestroy
//    public void cleanup(){
//        System.out.println("ending");
//    }

    public TennisCoach() {
        System.out.println("In construction" + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "tennis is running";
    }
}
