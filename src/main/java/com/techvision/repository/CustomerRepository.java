package com.techvision.repository;

import com.techvision.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepository {

    private final Map<String, Customer> customers = new HashMap<>();

    public CustomerRepository() {
        customers.put("Alice", new Customer("Alice", "alice@email.com"));
        customers.put("Bob", new Customer("Bob", "bob@email.com"));
    }

    public Customer getCustomerByName(String name) {
        return customers.get(name);
    }
}
