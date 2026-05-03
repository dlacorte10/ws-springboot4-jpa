package com.lacorteweb.lacvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lacorteweb.lacvendas.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}