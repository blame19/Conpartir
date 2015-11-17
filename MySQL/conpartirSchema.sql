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