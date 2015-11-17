################################################################################
# This script is used to add or modify rows of database compartir
################################################################################
insert into clients(name, surname, gender, age, email, pass) values
('Mario', 'Rossi', 'male', 28, 'mario.rossi@gmail.com', 'rossi'),
('Giulia', 'Verdi', 'female', 24, 'giulia91@libero.it', 'giulia' );
################################################################################
insert into driver(driver_id, client_id, car_name, car_year)values
(1, 1, 'Audi A6', 2006);
################################################################################
insert into post(owner_id, client_id) values
(1, 2);
################################################################################