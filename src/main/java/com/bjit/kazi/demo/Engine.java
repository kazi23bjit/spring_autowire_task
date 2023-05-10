package com.bjit.kazi.demo;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    public String name = "m8";
    public String price;

//    public Engine(String name, String price){
//        this.name = name;
//        this.price = price;
//    }
    public void printEngine(){
        System.out.println("Engine name is: "+name);
    }
}
