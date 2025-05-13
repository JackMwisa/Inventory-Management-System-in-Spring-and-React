package com.jackmwisadev.InventoryMgtSystem.repositories;

import com.jackmwisadev.InventoryMgtSystem.models.Category;
import com.jackmwisadev.InventoryMgtSystem.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {



}
