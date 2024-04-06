package com.corhuila.shoppingcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ShoppingCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCarApplication.class, args);
	}

}
