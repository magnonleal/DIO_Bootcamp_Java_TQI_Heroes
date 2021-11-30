package com.magnon.heroesapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HerosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerosApiApplication.class, args);
		System.out.println("Super poderes com webflux");
	}
}
