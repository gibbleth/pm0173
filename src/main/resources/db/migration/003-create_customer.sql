create table customer (
    customer_id         bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    customer_name       varchar(255),
    address_1           varchar(255),
    address_2           varchar(255),
    city                varchar(128),
    state_code          char(2),
    zip_code            char(10),
    phone               char(11)
);