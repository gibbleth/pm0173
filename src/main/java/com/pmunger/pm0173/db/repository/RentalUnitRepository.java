package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.RentalUnit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentalUnitRepository extends CrudRepository<RentalUnit, Long> {
    List<RentalUnit> findAllByRentalId(Long rentalId);
}
