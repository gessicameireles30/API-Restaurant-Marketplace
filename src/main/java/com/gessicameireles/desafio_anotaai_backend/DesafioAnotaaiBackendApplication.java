package com.gessicameireles.desafio_anotaai_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DesafioAnotaaiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioAnotaaiBackendApplication.class, args);
	}

}
