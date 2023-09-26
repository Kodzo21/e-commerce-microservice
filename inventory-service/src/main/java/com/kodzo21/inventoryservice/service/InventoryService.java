package com.kodzo21.inventoryservice.service;

import com.kodzo21.inventoryservice.model.Inventory;
import com.kodzo21.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;


    public Integer getQuantity(String SKU) {
        return inventoryRepository.findBySKU(SKU).getQuantity();
    }

    public void updateQuantity(String SKU, Integer quantity) {
        inventoryRepository.findBySKU(SKU).setQuantity(quantity);
    }

    public void addQuantity(String SKU, Integer quantity) {
        inventoryRepository.findBySKU(SKU).setQuantity(inventoryRepository.findBySKU(SKU).getQuantity() + quantity);
    }

    public void subtractQuantity(String SKU, Integer quantity) {
        inventoryRepository.findBySKU(SKU).setQuantity(inventoryRepository.findBySKU(SKU).getQuantity() - quantity);
    }

    public void deleteInventory(String SKU) {
        inventoryRepository.delete(inventoryRepository.findBySKU(SKU));
    }

    public void createInventory(String SKU, Integer quantity) {
        inventoryRepository.save(
                Inventory.builder()
                        .SKU(SKU)
                        .quantity(quantity)
                        .build()
        );
    }

    public Boolean checkIfIsInStock(String SKU) {
        return inventoryRepository.findBySKU(SKU).getQuantity() > 0;
    }
}
