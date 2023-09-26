package com.kodzo21.controller;


import com.kodzo21.dto.ProductRequest;
import com.kodzo21.dto.ProductResponse;
import com.kodzo21.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;


    @PostMapping("/create")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        // TODO implement
        return null;
    }

    @PutMapping("/update")
    public void updateProduct() {
        // TODO implement
    }

    @DeleteMapping("/delete")
    public void deleteProduct() {
        // TODO implement
    }

    @GetMapping("{name}")
    public void getProduct(@PathVariable String name) {
        // TODO implement
    }

    @GetMapping("/all")
    public void getAllProducts() {
        // TODO implement
    }
}
