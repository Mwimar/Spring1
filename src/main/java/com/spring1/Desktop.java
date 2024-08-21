package com.spring1;

public class Desktop implements Computer{

    public Desktop(){
        System.out.println("desktop object created");
    }


    @Override
    public void compile(){
        System.out.println("Compiling using Desktop...");
    }

}
