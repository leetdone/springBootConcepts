package com.example.springCoreDemo.config;

import com.example.springCoreDemo.common.BeanCoach;
import com.example.springCoreDemo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("MrBean")
    public Coach beanCoach(){
        return new BeanCoach();
    }
}
