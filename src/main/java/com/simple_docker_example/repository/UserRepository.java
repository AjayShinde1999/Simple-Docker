package com.simple_docker_example.repository;

import com.simple_docker_example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
