package com.sha.springbootbookseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringbootBookSellerApplication {

// @PropertySource("classpath:application-${spring.profiles.active:default}.properties")
	// application-default.properties
	// application-prod.properties
	// active profile
	// > ./gradlew bootRun

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBookSellerApplication.class, args);
	}

}
