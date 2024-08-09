package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
