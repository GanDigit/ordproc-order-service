package com.ord.orderservice.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderHeader {

    @Id
    @GeneratedValue
    private int id;
    private String referenceText;
    private String userName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="orderHeaderId", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public OrderHeader() {
        super();
    }

    public OrderHeader(int id, String referenceText, String userName, List<OrderItem> orderItems) {
        super();
        this.id = id;
        this.referenceText = referenceText;
        this.userName = userName;
        this.orderItems = orderItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferenceText() {
        return referenceText;
    }

    public void setReferenceText(String referenceText) {
        this.referenceText = referenceText;
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
}
