create table clients(
client_id INT NOT NULL PRIMARY KEY,
name varchar(15) not null,
surname varchar(15) not null,
gender varchar(15) not null,
age int not null,
email varchar(30) not null,
pass varchar(16) not null,
fotoURL varchar(50)
);
create table driver(
driver_id INT NOT NULL,
client_id int references clients(client_id),
car_name varchar(15) not null,
car_year int not null,
primary key (driver_id, client_id)
);
create table post(
owner_id int,
client_id int references clients(client_id),
primary key (owner_id, client_id)
);