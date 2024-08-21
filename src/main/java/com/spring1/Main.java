package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien1", Alien.class);
//      obj.setAge(30);
obj.code();
    System.out.println(obj.getAge());
Computer com = context.getBean(Computer.class);
Desktop obj1 = context.getBean( Desktop.class);
    }
}