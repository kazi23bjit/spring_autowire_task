package com.bjit.kazi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    public String name = "audi";
    @Autowired
    public Engine engine;

//    public Car(String name, Engine engine){
//        this.name = name;
//        this.engine = engine;
//    }

    public void getCar(){
        System.out.println("Car name is : "+ name);
        engine.printEngine();
    }
}
