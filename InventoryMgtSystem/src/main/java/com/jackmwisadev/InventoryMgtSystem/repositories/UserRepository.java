package com.jackmwisadev.InventoryMgtSystem.repositories;

import com.jackmwisadev.InventoryMgtSystem.models.Supplier;
import com.jackmwisadev.InventoryMgtSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    
}
