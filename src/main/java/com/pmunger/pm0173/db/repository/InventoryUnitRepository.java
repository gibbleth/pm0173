package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.InventoryUnit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InventoryUnitRepository extends CrudRepository<InventoryUnit, Long> {
    public List<InventoryUnit> findAllByInventoryIdAndRented(Long inventoryId, Boolean rented);
    public int countAllByInventoryIdAndRented(Long inventoryId, Boolean rented);
}
