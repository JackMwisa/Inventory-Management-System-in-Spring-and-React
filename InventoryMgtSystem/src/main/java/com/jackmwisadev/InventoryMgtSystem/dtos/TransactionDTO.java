package com.jackmwisadev.InventoryMgtSystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jackmwisadev.InventoryMgtSystem.enums.TransactionStatus;
import com.jackmwisadev.InventoryMgtSystem.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {

    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;


    private TransactionType transactionType; // sale, returned,..


    private TransactionStatus transactionStatus; // pending, completes,...

    private String description;
    private  String note;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    private ProductDTO product;


    private UserDTO user;


    private SupplierDTO supplier;


}