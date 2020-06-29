package com.controlechamados.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.controlechamados"})
@EnableJpaRepositories({"com.controlechamados"})
@EntityScan({"com.controlechamados"})


public class BackEndApplication{

    public static void main(String[] args){
        SpringApplication.run(BackEndApplication.class, args);
    }
}