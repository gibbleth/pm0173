package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
    public Optional<Inventory> findByToolCode(String toolCode);
}
