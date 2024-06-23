package com.eespinoza.service.orders;

import com.eespinoza.service.orders.configuration.OrdersIntegrationConfiguration;
import org.springframework.modulith.events.Externalized;

@Externalized(target = OrdersIntegrationConfiguration.ORDERS_DESTINATION)
public record OrderSaveEvent(int orderId) {
}
