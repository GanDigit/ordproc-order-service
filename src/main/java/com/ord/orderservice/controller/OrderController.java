package com.ord.orderservice.controller;

import com.ord.orderservice.jpa.OrderHeader;
import com.ord.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    private List<OrderHeader> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    private OrderHeader getOrder(@PathVariable("id") int id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/orders/{id}")
    private void deleteOrder(@PathVariable("id") int id) {
        orderService.delete(id);
    }

    @PostMapping("/orders")
    private int saveOrder(@RequestBody OrderHeader orderHeader) {
        orderService.saveOrUpdate(orderHeader);
        return orderHeader.getId();
    }
}
