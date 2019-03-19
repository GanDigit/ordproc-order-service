package com.ord.orderservice.controller;

import com.ord.orderservice.jpa.OrderHeader;
import com.ord.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    private List<OrderHeader> getAllOrders() {
        System.out.println("OrderController getAllOrders ....." );
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    private OrderHeader getOrder(@PathVariable("id") int id) {
        return orderService.getOrderById(id);
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
    private void deleteOrder(@PathVariable("id") int id) {
        orderService.delete(id);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.PUT)
    private OrderHeader saveOrder(@RequestBody OrderHeader order) {
        System.out.println("Save order --->" + order);
        return orderService.saveOrUpdate(order);
    }

}
