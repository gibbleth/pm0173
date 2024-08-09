create table tool_type (
    tool_type_id        bigint
                        GENERATED ALWAYS AS IDENTITY
                        primary key,
    type_name           varchar(128),
    daily_charge_cents  bigint,
    weekday_charge      bool,
    weekend_charge      bool,
    vacation_charge     bool
);