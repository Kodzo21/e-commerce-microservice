package com.kodzo21.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "product")
@Data
@Builder
public class Product {

    @Id
    private String id;
    private String name;
    private String SkuCode;
    private BigDecimal price;

}
