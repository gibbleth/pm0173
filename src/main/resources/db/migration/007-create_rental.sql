create table rental (
    rental_id           bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    customer_id         bigint
                        constraint customer_fk references customer,
    store_id            bigint
                        constraint store_fk references store,
    reserved_date       date,
    rented_date         date,
    return_date         date,
    actual_return_date  date,
    contract            clob
);