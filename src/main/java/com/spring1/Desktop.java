package com.spring1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desk")
@Primary
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("desktop object created");
    }


    @Override
    public void compile(){
        System.out.println("Compiling using Desktop...");
    }

}
