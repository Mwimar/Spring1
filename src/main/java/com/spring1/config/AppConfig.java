package com.spring1.config;

import com.spring1.Alien;
import com.spring1.Computer;
import com.spring1.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien (@Autowired Computer com){
        Alien obj = new Alien();
        obj.setCom(com);
        obj.setAge(25);
        return obj;
    }

//    @Bean(name = {"com1", "Don", "Ace" })

    @Bean
    //@Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    };





}
