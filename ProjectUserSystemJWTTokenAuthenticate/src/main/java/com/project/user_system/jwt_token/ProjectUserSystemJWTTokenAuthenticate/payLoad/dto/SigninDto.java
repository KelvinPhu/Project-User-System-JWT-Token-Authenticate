package com.project.user_system.jwt_token.ProjectUserSystemJWTTokenAuthenticate.payLoad.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SigninDto {

	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
}
