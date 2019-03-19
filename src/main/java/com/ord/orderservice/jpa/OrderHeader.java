package com.ord.orderservice.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderHeader {

    @Id
    @GeneratedValue
    private int id;
    private String description;
    private String userName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="orderHeaderId", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public OrderHeader() {
        super();
    }

    public OrderHeader(int id, String description, String userName, List<OrderItem> orderItems) {
        super();
        this.id = id;
        this.description = description;
        this.userName = userName;
        this.orderItems = orderItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
