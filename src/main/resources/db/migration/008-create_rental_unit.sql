create table rental_unit (
    rental_unit_id      bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    rental_id           bigint
                        constraint rental_fk references rental,
    inventory_unit_id   bigint
                        constraint inventory_unit_fk references inventory_unit
);