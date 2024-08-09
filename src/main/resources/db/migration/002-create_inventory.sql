create table inventory (
    inventory_id        bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    tool_code           char(4),
    tool_type_id        bigint
                        constraint tool_type_fk references tool_type,
    brand               varchar(128)
);