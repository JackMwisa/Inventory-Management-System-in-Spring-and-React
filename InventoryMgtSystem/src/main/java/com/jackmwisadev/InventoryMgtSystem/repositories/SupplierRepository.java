package com.jackmwisadev.InventoryMgtSystem.repositories;

import com.jackmwisadev.InventoryMgtSystem.models.Category;
import com.jackmwisadev.InventoryMgtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    //List<Supplier> findByNameContainingOrDescriptionContaining(String name, String description);
    
}
