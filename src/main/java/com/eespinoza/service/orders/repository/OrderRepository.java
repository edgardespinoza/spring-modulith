package com.eespinoza.service.orders.repository;


import com.eespinoza.service.orders.entity.Order;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<Order, Integer> {
}
