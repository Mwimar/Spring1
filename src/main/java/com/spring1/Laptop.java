package com.spring1;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("new Laptop object");
    }
    @Override
    public void compile(){
        System.out.println("Compiling...");
    }
}
