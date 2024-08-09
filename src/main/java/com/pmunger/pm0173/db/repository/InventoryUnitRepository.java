package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.Inventory;
import com.pmunger.pm0173.db.dao.InventoryUnit;
import org.springframework.data.repository.CrudRepository;

public interface InventoryUnitRepository extends CrudRepository<InventoryUnit, Long> {
}
