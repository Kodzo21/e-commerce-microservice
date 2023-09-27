package com.kodzo21.inventoryservice.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryRequest  {
    String SKU;
    Integer quantity;
}