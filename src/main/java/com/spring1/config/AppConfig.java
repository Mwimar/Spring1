package com.spring1.config;

import com.spring1.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "com1")
    public Desktop desktop(){
        return new Desktop();
    };

}
