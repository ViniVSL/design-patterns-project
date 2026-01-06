package com.techvision.model;

public class Order {
    private Long id;
    private Customer customer;
    private double total;

    public Order(Long id, Customer customer, double total) {
        this.id = id;
        this.customer = customer;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }
}
