package com.example.TASC_SpringBoot.life_cycle_bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("Constructor: MyBean is created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: MyBean is initialized.");
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("PreDestroy: MyBean is being destroyed.");
    }
}
