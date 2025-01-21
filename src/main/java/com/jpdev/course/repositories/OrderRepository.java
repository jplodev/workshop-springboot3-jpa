package com.jpdev.course.repositories;

import com.jpdev.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
