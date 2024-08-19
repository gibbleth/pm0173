create table inventory (
    inventory_id        bigint
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),
    tool_code           char(4),
    tool_type_id        bigint,
    brand               varchar(128),
    FOREIGN KEY (tool_type_id) references tool_type
);