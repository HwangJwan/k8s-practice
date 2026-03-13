package com.example.ordersystem.order.repository;

import com.example.ordersystem.order.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderingDetailRepository extends JpaRepository<OrderDetail, Long> {
}
