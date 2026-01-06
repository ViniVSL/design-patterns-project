package com.techvision.builder;

import com.techvision.model.Customer;

public class CustomerBuilder {
    private String name;
    private String email;

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Customer build() {
        return new Customer(name, email);
    }
}
