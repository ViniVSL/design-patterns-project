package com.techvision.factory;

import com.techvision.strategy.PaymentStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PaymentFactory {

    private final ApplicationContext context;

    public PaymentFactory(ApplicationContext context) {
        this.context = context;
    }

    public PaymentStrategy getPaymentStrategy(String type) {
        try {
            return (PaymentStrategy) context.getBean(type);
        } catch (Exception e) {
            return null;
        }
    }
}
