package com.spring1;

import com.spring1.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



        Alien obj = context.getBean(Alien.class);

       obj.code();







        Desktop dt = context.getBean(Desktop.class);
        dt.compile();

        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");









//    System.out.println(obj.getAge());
//Computer com = context.getBean(Computer.class);
//Desktop obj1 = context.getBean( Desktop.class);
    }
}