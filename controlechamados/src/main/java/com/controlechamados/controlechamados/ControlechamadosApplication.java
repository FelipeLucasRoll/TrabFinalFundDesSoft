package com.controlechamados.controlechamados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.controlechamados"})
//@EnableJpaRepositories({"com.controlechamados"})
//@EntityScan(basePackages = {"com.controlechamados"})

public class ControlechamadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlechamadosApplication.class, args);
	}
	

}
