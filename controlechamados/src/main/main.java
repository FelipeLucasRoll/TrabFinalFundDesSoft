package com.controlechamados.main;


import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@SpringBootApplication({"com.controlechamados"})

@ComponentScan({"com.controlechamados"})

@EnableJpaRepositories({"com.controlechamados"})

@EntityScan({"com.controlechamados"}) 

public class BackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndApplication.class, args);
    }
}

