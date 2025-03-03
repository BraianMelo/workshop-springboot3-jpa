package com.braian.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braian.curso.entities.OrderItem;
import com.braian.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
