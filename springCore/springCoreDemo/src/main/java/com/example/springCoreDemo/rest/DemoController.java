package com.example.springCoreDemo.rest;

import com.example.springCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    //anything will be injected bks of the autowired
    @Autowired
    public void seCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/daliyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
