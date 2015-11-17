###############################################################################
# This script define schema of conpartir project
###############################################################################
# At first we create a database and we start to use it
###############################################################################
#drop database if exists conpartir;
#create database if not exists conpartir;
use conpartir;
###############################################################################
# Next we create a table clients with parameters
# (name, surname, gender, age, email, password, fotoURL)
###############################################################################
DROP TABLE IF EXISTS clients;
create table clients(
client_id INT PRIMARY KEY auto_increment,
name varchar(15) not null,
surname varchar(15) not null,
gender enum('male','female') not null,
age int not null,
email varchar(30) not null,
pass varchar(16) not null,
fotoURL varchar(50)
)engine=innodb;
###############################################################################
# This table describes driver of car. A driver must insert name and year of car
###############################################################################
DROP TABLE IF EXISTS driver;
create table driver(
driver_id INT auto_increment,
client_id int references clients(client_id),
car_name varchar(15) not null,
car_year int not null,
primary key (driver_id, client_id)
)engine=innodb;
###############################################################################
# This table describes post.
###############################################################################
drop table if exists post;
create table post(
owner_id int,
client_id int references clients(client_id),
primary key (owner_id, client_id)
)engine=innodb;
###############################################################################