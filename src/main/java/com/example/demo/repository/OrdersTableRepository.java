package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrdersTable;

@Repository
public interface OrdersTableRepository extends JpaRepository<OrdersTable, Integer> {

}