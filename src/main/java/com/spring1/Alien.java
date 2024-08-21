package com.spring1;

import java.beans.ConstructorProperties;

public class Alien {
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
//        System.out.println("Calling setter");
    }

    private int age;


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
