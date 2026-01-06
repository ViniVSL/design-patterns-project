package com.techvision.repository;

import com.techvision.model.Customer;
import com.techvision.model.Order;
import com.techvision.builder.OrderBuilder;
import com.techvision.builder.CustomerBuilder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {

    private final Map<Long, Order> orders = new HashMap<>();

    public OrderRepository() {
        Customer alice = new CustomerBuilder().setName("Alice").setEmail("alice@email.com").build();
        Customer bob = new CustomerBuilder().setName("Bob").setEmail("bob@email.com").build();

        orders.put(1L, new OrderBuilder().setId(1L).setCustomer(alice).setTotal(150.0).build());
        orders.put(2L, new OrderBuilder().setId(2L).setCustomer(bob).setTotal(250.0).build());
    }

    public Order getOrderById(Long id) {
        return orders.get(id);
    }
}
