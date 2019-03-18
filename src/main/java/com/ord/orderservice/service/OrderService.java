package com.ord.orderservice.service;

import com.ord.orderservice.jpa.OrderHeader;
import com.ord.orderservice.jpa.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<OrderHeader> getAllOrders() {
        List<OrderHeader> orderHeaders = new ArrayList<OrderHeader>();
        orderRepository.findAll().forEach(orderHeader -> orderHeaders.add(orderHeader));
        return orderHeaders;
    }

    public OrderHeader getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    public OrderHeader saveOrUpdate(OrderHeader orderHeader) {
        return orderRepository.save(orderHeader);
    }

    public void delete(int id) {
        orderRepository.deleteById(id);
    }

}
