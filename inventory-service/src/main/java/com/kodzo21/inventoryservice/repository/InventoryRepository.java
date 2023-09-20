package com.kodzo21.inventoryservice.repository;

import com.kodzo21.inventoryservice.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

}

