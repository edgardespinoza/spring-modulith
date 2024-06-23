package com.eespinoza.service.orders;

import com.eespinoza.service.orders.entity.Order;
import com.eespinoza.service.orders.repository.OrderRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class OrderService {

    private final OrderRepository orderRepository;
    private final ApplicationEventPublisher applicationEventPublisher;


    OrderService(OrderRepository orderRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.orderRepository = orderRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    void save(Order order) {

        var saved = this.orderRepository.save(order);
        System.out.println("saved [" + saved + "]");

        this.applicationEventPublisher.publishEvent(new OrderSaveEvent(saved.id()));
    }

}

