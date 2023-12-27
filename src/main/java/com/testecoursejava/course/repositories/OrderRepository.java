package com.testecoursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testecoursejava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
