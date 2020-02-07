package com.quadrant.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = { "com.quadrant.*" })
@EntityScan(value = "com.quadrant.model")
@EnableJpaRepositories("com.quadrant.*")
public class StartMyBootApp implements CommandLineRunner {

	protected static final Logger logger = LoggerFactory.getLogger(StartMyBootApp.class);

	public static void main(String[] args) {
		SpringApplication sp = new SpringApplication(StartMyBootApp.class);
		sp.run(args);
		System.out.println("Hello World!");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Application has started successfully.....");
	}
}
