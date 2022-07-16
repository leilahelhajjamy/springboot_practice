package com.example.multiplicationboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultiplicationbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplicationbootApplication.class, args);
	}


	@Bean
	ObjectMapper objectMapper(){
		ObjectMapper om = new ObjectMapper();
		om.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
		return om;
	}
}
