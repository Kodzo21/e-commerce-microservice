package com.kodzo21.inventoryservice.service;

import com.kodzo21.inventoryservice.dto.InventoryRequest;
import com.kodzo21.inventoryservice.dto.InventoryResponse;
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

    public InventoryResponse createInventory(InventoryRequest inventoryRequest) {
        var inventory = Inventory.builder()
                        .SKU(inventoryRequest.getSKU())
                        .quantity(inventoryRequest.getQuantity())
                        .build();
        inventoryRepository.save(inventory);
        return mapToResponse(inventory);
    }

    public Boolean checkIfIsInStock(String SKU) {
        return inventoryRepository.findBySKU(SKU).getQuantity() > 0;
    }

    private InventoryResponse mapToResponse(Inventory inventory) {
        return InventoryResponse.builder()
                .SKU(inventory.getSKU())
                .quantity(inventory.getQuantity())
                .build();
    }
}
