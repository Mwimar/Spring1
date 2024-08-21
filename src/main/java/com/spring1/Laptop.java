package com.spring1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("new Laptop object");
    }
    @Override
    public void compile(){
        System.out.println("Compiling using Laptop...");
    }
}
