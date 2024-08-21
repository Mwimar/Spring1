package com.spring1.config;

import com.spring1.Alien;
import com.spring1.Computer;
import com.spring1.Desktop;
import com.spring1.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.spring1")
public class AppConfig {

//    @Bean
//    public Alien alien ( @Autowired Computer com){ //@Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setCom(com);
//        obj.setAge(25);
//        return obj;
//    }
//
//
//    @Bean
//    @Primary
//    public Laptop laptop (){
//        return new Laptop();
//    }
//
////    @Bean(name = {"com1", "Don", "Ace" })
//    @Bean
//    //@Scope(value = "prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    };





}
