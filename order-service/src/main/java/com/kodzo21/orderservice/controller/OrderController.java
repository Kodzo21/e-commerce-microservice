package com.kodzo21.orderservice.controller;

import com.kodzo21.orderservice.dto.OrderRequest;
import com.kodzo21.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/order")
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/place")
    public void placeOrder(@RequestBody OrderRequest orderRequest) {
        //todo implement
    }
}
