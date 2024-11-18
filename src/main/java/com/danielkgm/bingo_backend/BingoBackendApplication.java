package com.danielkgm.bingo_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = { "com.danielkgm.bingo_backend.*" })
public class BingoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BingoBackendApplication.class, args);
	}

}
