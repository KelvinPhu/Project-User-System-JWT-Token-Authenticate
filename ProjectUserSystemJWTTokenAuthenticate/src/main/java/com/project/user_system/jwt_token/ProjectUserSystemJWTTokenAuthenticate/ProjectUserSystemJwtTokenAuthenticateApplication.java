package com.project.user_system.jwt_token.ProjectUserSystemJWTTokenAuthenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
// (exclude = {DataSourceAutoConfiguration.class})
public class ProjectUserSystemJwtTokenAuthenticateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectUserSystemJwtTokenAuthenticateApplication.class, args);
	}

}
