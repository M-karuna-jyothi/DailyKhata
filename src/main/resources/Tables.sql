use development;
create table user_table
( id integer not null auto_increment,
  user_name varchar(50) not null,
  phone_number integer not null,
  email varchar(50),
  address varchar(100),
  primary key(id)
);

create table available_stocks
(  id integer not null auto_increment,
   batch_id integer not null,
   flavour_id integer not null,
   available_quantity integer not null,
   sold_quantity integer not null,
   intransit_quantity integer not null,
   primary key(id)
);

create table batch_information
( id integer not null auto_increment,
  company_id integer not null,
  quantity integer not null,
  unloaded_at timestamp not null,
  invoice_price double not null,
  received_by integer not null,
  primary key(id)
);


create table company_information
( id integer not null auto_increment,
  name varchar(50) not null,
  phone_number integer,
  address varchar(100),
  primary key(id)
);

create table flavour_information
( id integer not null auto_increment,
  company_id integer not null,
  brand varchar(50) not null,
  flavour varchar(50) not null,
  primary key(id)
);


create table stock_version
( id integer not null auto_increment,
  stock_id integer not null,
  attribute varchar(50) not null,
  old_version varchar(50) not null,
  new_version varchar(50) not null,
  created_on timestamp not null,
  updated_on timestamp not null,
  updated_by integer not null,
  location_id integer not null,
  primary key(id)
);


create table intransit_information
( id integer not null auto_increment,
  user_id integer not null,
  stock_id integer not null,
  quantity integer not null,
  primary key(id)
);

create table location
( id integer not null auto_increment,
  location_details varchar(100),
  primary key(id)
);
