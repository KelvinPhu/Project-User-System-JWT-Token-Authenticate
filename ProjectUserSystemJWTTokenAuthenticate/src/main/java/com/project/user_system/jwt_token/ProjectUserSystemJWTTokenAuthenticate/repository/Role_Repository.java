package com.project.user_system.jwt_token.ProjectUserSystemJWTTokenAuthenticate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.user_system.jwt_token.ProjectUserSystemJWTTokenAuthenticate.model.EnumRole;
import com.project.user_system.jwt_token.ProjectUserSystemJWTTokenAuthenticate.model.Role;

@Repository
public interface Role_Repository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(EnumRole name);
}
