package com.jackmwisadev.InventoryMgtSystem.models;
import com.jackmwisadev.InventoryMgtSystem.enums.UserRole;
import jakarta.persistence.*;
//import jakarta.transaction.Transaction;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "suppliers")
@Data
@Builder
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "contactInfo is required")
    private String contactInfo;

    @NotBlank(message = "Address is required")
    private String address;


}