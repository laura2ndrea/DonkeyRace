
-- Seleccionar la base de datos
USE DonkeyRace;

-- Inserciones para la tabla Breeds
INSERT INTO Breeds (name) VALUES 
('Andalusian'),
('Catalonian'),
('Miniature Donkey'),
('Poitevin Donkey'),
('American Mammoth');

-- Inserciones para la tabla Owners
INSERT INTO Owners (name) VALUES 
('John Doe'),
('Jane Smith'),
('Robert Brown'),
('Emily Davis'),
('Alice Johnson');

-- Inserciones para la tabla Donkeys
INSERT INTO Donkeys (name, birthdate, id_breed, id_owner) VALUES 
('Speedy', '2015-06-15', 1, 1),
('Lightning', '2018-08-22', 2, 2),
('Thunder', '2016-12-05', 3, 3),
('Blaze', '2017-03-10', 4, 4),
('Storm', '2020-01-25', 5, 5);

-- Inserciones para la tabla Racing
INSERT INTO Racing (race_date, place, status) VALUES 
('2025-02-15 14:00:00', 'Zone 1', 'Scheduled'),
('2025-02-20 16:00:00', 'Zone 2', 'Scheduled'),
('2025-02-25 10:00:00', 'Zone 3', 'Scheduled'),
('2025-03-01 12:00:00', 'Zone 1', 'Scheduled'),
('2025-03-05 18:00:00', 'Zone 2', 'Scheduled');

-- Inserciones para la tabla Registrations
INSERT INTO Registrations (race_position, id_donkey, id_race) VALUES 
(0, 1, 1),
(0, 2, 1),
(0, 3, 2),
(0, 4, 2),
(0, 5, 3);

-- Inserciones para la tabla Spectators
INSERT INTO Spectators (name, identification, credit) VALUES 
('Carlos Gonzalez', 'ID123456', 100.00),
('Maria Rodriguez', 'ID654321', 200.00),
('Luis Perez', 'ID111222', 50.00),
('Ana Gomez', 'ID333444', 300.00),
('Sofia Martinez', 'ID555666', 150.00);

-- Inserciones para la tabla Bets
INSERT INTO Bets (amount, id_spectator, id_registration) VALUES 
(20.00, 1, 1),
(30.00, 2, 2),
(15.00, 3, 3),
(50.00, 4, 4),
(25.00, 5, 5);
