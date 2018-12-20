package com.shaibal.hibernate.play.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = ApplicationConfig.PACKAGE_HIBERNATE_PLAY_REST)
@EntityScan(basePackages = ApplicationConfig.PACKAGE_HIBERNATE_PLAY_ENTITY)
@EnableJpaRepositories(basePackages = ApplicationConfig.PACKAGE_HIBERNATE_PLAY_REPOSITORY)
public class ApplicationConfig {

	protected static final String PACKAGE_HIBERNATE_PLAY_REST = "com.shaibal.hibernate.play";
	protected static final String PACKAGE_HIBERNATE_PLAY_ENTITY = "com.shaibal.hibernate.play.model";
	protected static final String PACKAGE_HIBERNATE_PLAY_REPOSITORY = "com.shaibal.hibernate.play.repository";
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}
}
