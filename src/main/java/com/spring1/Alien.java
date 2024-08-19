package com.spring1;

public class Alien {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age =25;
    public Alien(){
        System.out.println("Alien object");
    }
    public void code(){
        System.out.println("Coding...");
    }
}
