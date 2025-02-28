package com.braian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braian.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
