create table rental (
    rental_id           bigint
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY (start with 1, increment by 1),
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