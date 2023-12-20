package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootIocProj39DataJpaLargeObjectOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootIocProj39DataJpaLargeObjectOracleApplication.class, args);
	}
	@Bean
	public Scanner getScanner() {
		System.out.println("getScanner()");
		return new Scanner(System.in);
	}
}
