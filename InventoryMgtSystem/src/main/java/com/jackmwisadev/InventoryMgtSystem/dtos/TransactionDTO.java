package com.jackmwisadev.InventoryMgtSystem.dtos;

import com.jackmwisadev.InventoryMgtSystem.enums.TransactionStatus;
import com.jackmwisadev.InventoryMgtSystem.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
@Data
@Builder
public class TransactionDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType; // sale, returned,..

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus; // pending, completes,...

    private String description;
    private  String note;
    private final LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updateAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductDTO product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDTO user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private SupplierDTO supplier;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", totalProducts=" + totalProducts +
                ", totalPrice=" + totalPrice +
                ", transactionType=" + transactionType +
                ", transactionStatus=" + transactionStatus +
                ", description='" + description + '\'' +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}