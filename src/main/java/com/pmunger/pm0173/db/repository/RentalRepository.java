package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.InventoryUnit;
import com.pmunger.pm0173.db.dao.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Long> {
}
