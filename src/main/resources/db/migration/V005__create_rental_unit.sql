create table rental_unit (
    rental_unit_id      bigint
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY (start with 1, increment by 1),
    rental_id           bigint,
    inventory_unit_id   bigint,
    charge_days         int,
    non_charge_days     int,
    daily_rental_cents  int,
    FOREIGN KEY (rental_id) references rental,
    FOREIGN KEY (inventory_unit_id) references inventory_unit
);