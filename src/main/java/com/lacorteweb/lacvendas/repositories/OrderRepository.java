package com.lacorteweb.lacvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lacorteweb.lacvendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
