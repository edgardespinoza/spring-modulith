package com.eespinoza.service.orders.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders_line_items")
public record LineItem(@Id Integer id, int product, int quantity) {
}
