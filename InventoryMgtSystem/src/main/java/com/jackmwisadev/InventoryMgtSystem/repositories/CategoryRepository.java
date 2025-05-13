package com.jackmwisadev.InventoryMgtSystem.repositories;

import com.jackmwisadev.InventoryMgtSystem.models.Category;
import com.jackmwisadev.InventoryMgtSystem.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

   // List<Category> findByNameContainingOrDescriptionContaining(String name, String description);
    
}
