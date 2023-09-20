package com.kodzo21.orderservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String SKU;
    private BigDecimal price;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}