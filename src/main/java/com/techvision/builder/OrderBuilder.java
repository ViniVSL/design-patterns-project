package com.techvision.builder;

import com.techvision.model.Customer;
import com.techvision.model.Order;

public class OrderBuilder {
    private Long id;
    private Customer customer;
    private double total;

    public OrderBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder setTotal(double total) {
        this.total = total;
        return this;
    }

    public Order build() {
        return new Order(id, customer, total);
    }
}
