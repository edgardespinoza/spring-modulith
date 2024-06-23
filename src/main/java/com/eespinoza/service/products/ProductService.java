package com.eespinoza.service.products;

import com.eespinoza.service.orders.OrderSaveEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
class ProductService {

    @ApplicationModuleListener
    void on(OrderSaveEvent orderSaveEvent) throws Exception{
        System.out.println("starting ["+orderSaveEvent+"]");
        Thread.sleep(10_000);
        System.out.println("stopping ["+orderSaveEvent+"]");
    }
}
