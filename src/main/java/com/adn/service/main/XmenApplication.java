package com.adn.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.adn"})
public class XmenApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmenApplication.class, args);
	}

}
