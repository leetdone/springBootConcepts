package com.example.springCoreDemo.rest;

import com.example.springCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Lazy
@RestController
public class DemoController {
    private Coach myCoach;




    //anything will be injected bks of the autowired
    @Autowired
    public void seCoach(@Qualifier("MrBean") Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/daliyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check(){
//        return "Comparingin \n" + (myCoach == anotherCoach);
//    }
}
