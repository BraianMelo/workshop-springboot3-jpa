package com.braian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braian.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
