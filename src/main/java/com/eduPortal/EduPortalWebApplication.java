package com.eduPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.eduPortal.repository")
@SpringBootApplication
public class EduPortalWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduPortalWebApplication.class, args);
	}

}