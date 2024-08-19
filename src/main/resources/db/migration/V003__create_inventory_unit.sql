create table inventory_unit (
    inventory_unit_id   bigint
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),
    inventory_id        bigint,
    rented              boolean,
    foreign key (inventory_id) references inventory
);