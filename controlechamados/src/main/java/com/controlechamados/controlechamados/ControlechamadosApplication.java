package com.controlechamados.controlechamados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controlechamados"})
public class ControlechamadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlechamadosApplication.class, args);
	}
	

}
