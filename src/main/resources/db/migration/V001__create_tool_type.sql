create table tool_type (
    tool_type_id        bigint
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),
    type_name           varchar(128),
    daily_charge_cents  bigint,
    weekday_charge      boolean,
    weekend_charge      boolean,
    vacation_charge     boolean
);