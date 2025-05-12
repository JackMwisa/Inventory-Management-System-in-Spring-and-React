package com.jackmwisadev.InventoryMgtSystem.models;
import com.jackmwisadev.InventoryMgtSystem.enums.UserRole;
import jakarta.persistence.*;
//import jakarta.transaction.Transaction;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Column(unique = true)
    @NotBlank(message = "SKU is required")
    private String sku;

    @Positive(message = "Product price must be of positive value")
    private BigDecimal price;

    @Min(value = 0, message = "Stock value cannot be negative")
    private Integer stockQuantity;

    private  String description;
    private LocalDateTime expiryDate;
    private String imageUrl;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", description='" + description + '\'' +
                ", expiryDate=" + expiryDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", createdAt=" + createdAt +
                ", category=" + category +
                '}';
    }
}