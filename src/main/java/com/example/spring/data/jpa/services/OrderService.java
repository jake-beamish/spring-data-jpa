package com.example.spring.data.jpa.services;

import com.example.spring.data.jpa.OrderRepository;
import com.example.spring.data.jpa.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final OrderRepository repository;

    public OrderService(@Autowired OrderRepository repository) {
        this.repository = repository;
    }

    public Order saveOrder(Order order) {
        Order newOrder = repository.save(order);
        return newOrder;
    }

    public Iterable<Order> findAll() {
        Iterable<Order> list = this.repository.findAll();
        return list;
    }
}