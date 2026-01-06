package com.techvision.controller;

import com.techvision.facade.OrderFacade;
import com.techvision.facade.OrderFacade.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderFacade orderFacade;

    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrder(@PathVariable Long id,
                                      @RequestParam(required = false) String payment) {
        OrderDTO order = orderFacade.getOrder(id, payment);
        if (order == null) return ResponseEntity.badRequest().body("Pedido não encontrado");
        return ResponseEntity.ok(order);
    }
}
