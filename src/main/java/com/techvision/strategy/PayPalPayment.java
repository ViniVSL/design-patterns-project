package com.techvision.strategy;

import com.techvision.model.Order;
import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalPayment implements PaymentStrategy {
    @Override
    public String pay(Order order) {
        return "Pagamento via PayPal processado para pedido " + order.getId();
    }
}
