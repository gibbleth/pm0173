insert into tool_type(type_name, daily_charge_cents, weekday_charge, weekend_charge, vacation_charge)
    values
        ('Ladder', 199, true, true, false),
        ('Chainsaw', 149, true, false, true),
        ('Jackhammer', 299, true, false, false);

insert into inventory(tool_code, tool_type_id, brand)
    values
        ('CHNS', (select tool_type_id from tool_type where type_name='Chainsaw'), 'Stihl'),
        ('LADW', (select tool_type_id from tool_type where type_name='Ladder'), 'Werner'),
        ('JAKD', (select tool_type_id from tool_type where type_name='Jackhammer'), 'DeWalt'),
        ('JAKR', (select tool_type_id from tool_type where type_name='Jackhammer'), 'Ridgid'),
        ('UNKN', (select tool_type_id from tool_type where type_name='Jackhammer'), 'Unknown');

insert into inventory_unit(inventory_id, rented)
    values
        ((select inventory_id from inventory where tool_code='CHNS'), false),
        ((select inventory_id from inventory where tool_code='CHNS'), false),
        ((select inventory_id from inventory where tool_code='JAKD'), false),
        ((select inventory_id from inventory where tool_code='JAKR'), false),
        ((select inventory_id from inventory where tool_code='JAKR'), false),
        ((select inventory_id from inventory where tool_code='JAKR'), false),
        ((select inventory_id from inventory where tool_code='LADW'), false),
        ((select inventory_id from inventory where tool_code='LADW'), false);
