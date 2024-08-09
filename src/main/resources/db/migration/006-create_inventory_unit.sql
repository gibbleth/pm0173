create table inventory_unit (
    inventory_unit_id   bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    inventory_id        bigint
                        constraint inventory_fk references inventory,
    store_id            bigint
                        constraint store_fk references store
);