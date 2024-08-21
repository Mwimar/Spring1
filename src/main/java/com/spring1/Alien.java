package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Autowired
@Qualifier("lap")
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    @Value("26")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
//        System.out.println("Calling setter");
    }



    public Alien(){
        System.out.println("Alien object created");
    }

//    @ConstructorProperties({"lap", "age"})
//    public Alien(Computer com, int age) {
//        this.com = com;
//        this.age = age;
//
//    }


    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
