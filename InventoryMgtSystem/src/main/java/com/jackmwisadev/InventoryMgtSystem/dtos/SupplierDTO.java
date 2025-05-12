package com.jackmwisadev.InventoryMgtSystem.dtos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "suppliers")
@Data
@Builder
public class SupplierDTO {
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