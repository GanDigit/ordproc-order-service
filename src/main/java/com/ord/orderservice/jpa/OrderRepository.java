package com.ord.orderservice.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository /// here is the trick
public interface OrderRepository extends CrudRepository<OrderHeader, Integer> {}

