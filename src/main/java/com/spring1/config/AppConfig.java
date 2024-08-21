package com.spring1.config;

import com.spring1.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name = {"com1", "Don", "Ace" })

    @Bean
    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    };

}
