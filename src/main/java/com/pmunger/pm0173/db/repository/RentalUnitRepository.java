package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.Rental;
import com.pmunger.pm0173.db.dao.RentalUnit;
import org.springframework.data.repository.CrudRepository;

public interface RentalUnitRepository extends CrudRepository<RentalUnit, Long> {
    int countAllByInventoryUnitId(Long inventoryUnitId);
}
