package com.techvision.strategy;

import com.techvision.model.Order;

public interface PaymentStrategy {
    String pay(Order order);
}
