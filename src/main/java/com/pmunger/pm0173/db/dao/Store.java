package com.pmunger.pm0173.db.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long storeId;
    String storeCode;
    String address1;
    String address2;
    String city;
    String stateCode;
    String zipCode;
    String phone;
}
