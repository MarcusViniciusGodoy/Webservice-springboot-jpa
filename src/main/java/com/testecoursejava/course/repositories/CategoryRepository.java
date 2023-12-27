package com.testecoursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testecoursejava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
