package com.eespinoza.service.orders.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrdersIntegrationConfiguration {
    public static final String ORDERS_DESTINATION = "orders";

    @Bean
    Binding binding(Queue queue, Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ORDERS_DESTINATION).noargs();
    }

    @Bean
    Queue queue() {
        return QueueBuilder.durable(ORDERS_DESTINATION).build();
    }

    @Bean
    Exchange exchange() {
        return ExchangeBuilder.directExchange(ORDERS_DESTINATION).durable(true).build();
    }

}