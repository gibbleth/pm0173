package com.pmunger.pm0173.db.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rentalId;
    LocalDate reservedDate;
    LocalDate rentedDate;
    LocalDate returnDate;
    LocalDate actualReturnDate;
    int rentalDays;
    BigDecimal preDiscountCharge;
    BigDecimal discountPercent;
    BigDecimal discountAmount;
    BigDecimal finalCharge;
    String contract;
}
