package com.kodzo21.controller;


import com.kodzo21.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;


}
