package com.lacorteweb.lacvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lacorteweb.lacvendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
