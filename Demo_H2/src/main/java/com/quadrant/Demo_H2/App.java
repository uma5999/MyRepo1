package com.quadrant.Demo_H2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication sp = new SpringApplication(App.class);
		sp.run(args);
	}
}
