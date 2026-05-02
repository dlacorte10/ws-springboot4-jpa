package com.lacorteweb.lacvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lacorteweb.lacvendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
