package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@SpringBootApplication
public class TogglzDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TogglzDemoApplication.class, args);
	}
	
}
