package com.ontony.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ontony.backend.config.SpringConfig;

@SpringBootApplication
@Import(SpringConfig.class)
public class SpringBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

}
