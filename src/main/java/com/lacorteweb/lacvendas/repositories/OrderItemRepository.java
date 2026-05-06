package com.lacorteweb.lacvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lacorteweb.lacvendas.entities.OrderItem;
import com.lacorteweb.lacvendas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}