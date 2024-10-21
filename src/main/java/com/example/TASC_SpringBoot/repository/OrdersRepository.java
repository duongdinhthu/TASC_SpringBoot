package com.example.TASC_SpringBoot.repository;

import com.example.TASC_SpringBoot.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
