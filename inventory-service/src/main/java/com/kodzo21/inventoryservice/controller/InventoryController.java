package com.kodzo21.inventoryservice.controller;


import com.kodzo21.inventoryservice.dto.InventoryRequest;
import com.kodzo21.inventoryservice.dto.InventoryResponse;
import com.kodzo21.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;


    @GetMapping("/quantity/{sku}")
    public ResponseEntity<Integer> getQuantity(@PathVariable String sku) {
        return ResponseEntity.ok(inventoryService.getQuantity(sku));
    }

    @PostMapping("/create")
    public ResponseEntity<InventoryResponse> createInventory(@RequestBody InventoryRequest inventoryRequest){
        return ResponseEntity.ok(inventoryService.createInventory(inventoryRequest));
    }

    @GetMapping("/in-stock/{sku}")
    public ResponseEntity<Boolean> isInStock(@PathVariable String sku){
        return ResponseEntity.ok(inventoryService.checkIfIsInStock(sku));
    }


}
