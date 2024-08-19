package com.spring1;

public class Alien {
    private Laptop lap;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Calling setter");
    }

    private int age =25;
    public Alien(){
        System.out.println("Alien object");
    }

    public Alien(Laptop lap, int age) {
        this.lap = lap;
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding...");
        lap.compile();
    }
}
