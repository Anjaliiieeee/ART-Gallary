package com.symbiosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.symbiosis","com.controller","com.service","com.dao","com.model"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")

public class ArtGalleryKalkarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtGalleryKalkarApplication.class, args);
	}

}
