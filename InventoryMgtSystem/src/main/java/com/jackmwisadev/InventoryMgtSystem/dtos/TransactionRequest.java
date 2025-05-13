package com.jackmwisadev.InventoryMgtSystem.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    @Positive(message = "product id is required")
    private Long productId;

    @Positive(message = "quantity is required")
    private Integer quantity;

    private Long supplierId;

    private String description;

    private String note;
}
