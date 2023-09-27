package com.kodzo21.orderservice.service;

import com.kodzo21.orderservice.dto.OrderRequest;
import com.kodzo21.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;


    public void placeOrder(OrderRequest orderRequest) {
        //todo implement
    }
}
