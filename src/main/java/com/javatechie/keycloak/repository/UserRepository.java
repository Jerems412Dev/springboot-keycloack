package com.javatechie.keycloak.repository;

import com.javatechie.keycloak.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
