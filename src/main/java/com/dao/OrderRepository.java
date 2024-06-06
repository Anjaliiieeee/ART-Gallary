package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Order1;

public interface OrderRepository extends JpaRepository<Order1, Integer> {

}
