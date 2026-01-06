package com.techvision.strategy;

import com.techvision.model.Order;
import org.springframework.stereotype.Component;

@Component("credit-card")
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String pay(Order order) {
        return "Pagamento via cartão de crédito processado para pedido " + order.getId();
    }
}
