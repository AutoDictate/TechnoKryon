package com.tk.week1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week1Application.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		System.out.println("Hello World !!!");
		System.out.println("Hello Spring Boot Application !!!");
	}
}
