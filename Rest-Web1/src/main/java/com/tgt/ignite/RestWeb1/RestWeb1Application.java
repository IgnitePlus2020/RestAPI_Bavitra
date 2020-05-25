package com.tgt.ignite.RestWeb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestWeb1Application.class, args);
	}

}
