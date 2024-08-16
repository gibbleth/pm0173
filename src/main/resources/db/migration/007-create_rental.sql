create table rental (
    rental_id           bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    store_id            bigint
                        constraint store_fk references store,
    reserved_date       date,
    rented_date         date,
    return_date         date,
    actual_return_date  date,
    rental_days         int,
    pre_discount_charge numeric(10,2),
    discount_percent    numeric(10,2),
    discount_amount     numeric(10,2),
    final_charge        numeric(10,2),
    contract            clob
);