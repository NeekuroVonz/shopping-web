package com.theplayer.kits.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.theplayer.kits"})
public class ShoppingApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingApplication.class, args);
	}

}
