package com.techvision.facade;

import com.techvision.model.Order;
import com.techvision.repository.OrderRepository;
import com.techvision.factory.PaymentFactory;
import com.techvision.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

    private final OrderRepository orderRepository;
    private final PaymentFactory paymentFactory;

    public OrderFacade(OrderRepository orderRepository, PaymentFactory paymentFactory) {
        this.orderRepository = orderRepository;
        this.paymentFactory = paymentFactory;
    }

    public OrderDTO getOrder(Long orderId, String paymentMethod) {
        Order order = orderRepository.getOrderById(orderId);
        if (order == null) return null;

        OrderDTO dto = new OrderDTO(order.getId(), order.getCustomer().getName(),
                order.getCustomer().getEmail(), order.getTotal());

        if (paymentMethod != null) {
            PaymentStrategy strategy = paymentFactory.getPaymentStrategy(paymentMethod);
            if (strategy != null) {
                dto.setPaymentResult(strategy.pay(order));
            } else {
                dto.setPaymentResult("Método de pagamento inválido");
            }
        }

        return dto;
    }

    public static class OrderDTO {
        private Long id;
        private String customerName;
        private String email;
        private double total;
        private String paymentResult;

        public OrderDTO(Long id, String customerName, String email, double total) {
            this.id = id;
            this.customerName = customerName;
            this.email = email;
            this.total = total;
        }

        public Long getId() { return id; }
        public String getCustomerName() { return customerName; }
        public String getEmail() { return email; }
        public double getTotal() { return total; }
        public String getPaymentResult() { return paymentResult; }
        public void setPaymentResult(String paymentResult) { this.paymentResult = paymentResult; }
    }
}
