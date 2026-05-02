package com.lacorteweb.lacvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lacorteweb.lacvendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
