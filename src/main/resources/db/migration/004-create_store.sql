create table store (
    store_id            bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    store_code          char(6),
    address_1           varchar(255),
    address_2           varchar(255),
    city                varchar(128),
    state_code          char(2),
    zip_code            char(10),
    phone               char(11)
);