package com.krew.tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.krew.tools"})
public class ScannerToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScannerToolApplication.class, args);
	}
}
