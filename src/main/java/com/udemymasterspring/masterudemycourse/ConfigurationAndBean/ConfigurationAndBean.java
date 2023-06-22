package com.udemymasterspring.masterudemycourse.ConfigurationAndBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAndBean {

    @Bean
    public String name(){
        return "Mehmet";
    }

    @Bean(name = "yourAge")
    public int age(){
        return 28;
    }

}
