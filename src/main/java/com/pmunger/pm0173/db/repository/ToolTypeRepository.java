package com.pmunger.pm0173.db.repository;

import com.pmunger.pm0173.db.dao.ToolType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ToolTypeRepository extends CrudRepository<ToolType, Long> {
    public Optional<ToolType> getByTypeName(String typeName);
}
