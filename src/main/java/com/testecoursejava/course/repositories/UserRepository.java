package com.testecoursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testecoursejava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
