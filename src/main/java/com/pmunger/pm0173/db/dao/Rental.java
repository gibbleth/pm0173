package com.pmunger.pm0173.db.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rentalId;
    Long customerId;
    Long storeId;
    LocalDate reservedDate;
    LocalDate rentedDate;
    LocalDate returnDate;
    LocalDate actualReturnDate;
    String contract;
}
