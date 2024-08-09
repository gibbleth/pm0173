package com.pmunger.pm0173.db.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ToolType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long toolTypeId;
    String typeName;
    Long dailyChargeCents;
    boolean weekdayCharge;
    boolean weekendCharge;
    boolean vacationCharge;
}
