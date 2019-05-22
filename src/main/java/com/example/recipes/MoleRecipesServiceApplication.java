package com.example.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.database") 
@EntityScan("com.example.database")
@SpringBootApplication
public class MoleRecipesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoleRecipesServiceApplication.class, args);
	}

}
