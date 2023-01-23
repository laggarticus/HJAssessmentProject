package com.laggarticus.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.laggarticus")
@ComponentScan("com.laggarticus")
@EntityScan("com.laggarticus.*")
public class HjAssessmentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HjAssessmentProjectApplication.class, args);
	}

}
