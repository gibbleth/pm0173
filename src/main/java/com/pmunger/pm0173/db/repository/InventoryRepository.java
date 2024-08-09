package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.Customer;
import com.pmunger.pm0173.db.dao.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
}
