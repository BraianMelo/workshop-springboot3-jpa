package com.braian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braian.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
