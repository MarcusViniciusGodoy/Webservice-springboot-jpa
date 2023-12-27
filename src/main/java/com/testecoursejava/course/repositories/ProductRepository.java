package com.testecoursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testecoursejava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
