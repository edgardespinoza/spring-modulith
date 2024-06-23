package com.eespinoza.service.orders.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Table("orders")
public record Order(@Id Integer id, Set<LineItem> lineItems) {
}
