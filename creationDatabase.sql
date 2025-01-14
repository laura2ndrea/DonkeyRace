DROP DATABASE IF EXISTS DonkeyRace; 

CREATE DATABASE IF NOT EXISTS DonkeyRace; 

USE DonkeyRace; 

CREATE TABLE IF NOT EXISTS Breeds (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL UNIQUE
); 

CREATE TABLE IF NOT EXISTS Owners (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL UNIQUE
); 

CREATE TABLE IF NOT EXISTS Donkeys (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	birthdate DATE NOT NULL,
	id_breed INT,
	id_owner INT,
	FOREIGN KEY (id_breed) REFERENCES Breeds(id),
	FOREIGN KEY (id_owner) REFERENCES Owners(id)
);

CREATE TABLE IF NOT EXISTS Racing (
	id INT AUTO_INCREMENT PRIMARY KEY,
	race_date DATETIME NOT NULL,
	place ENUM('Zone 1', 'Zone 2', 'Zone 3'),
	status ENUM('Scheduled', 'Finished', 'Canceled')
);

CREATE TABLE IF NOT EXISTS Registrations (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	race_position INT DEFAULT 0, 
	id_donkey INT, 
	id_race INT, 
	FOREIGN KEY (id_donkey) REFERENCES Donkeys(id),
	FOREIGN KEY (id_race) REFERENCES Racing(id)
);

CREATE TABLE IF NOT EXISTS Spectators (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	name VARCHAR(250) NOT NULL, 
	identification VARCHAR(250) NOT NULL UNIQUE, 
	credit DECIMAL(10, 2) DEFAULT 0
);

CREATE TABLE IF NOT EXISTS Bets (
	id INT AUTO_INCREMENT PRIMARY KEY,
	amount DECIMAL(10, 2), 
	id_spectator INT, 
	id_registration INT,
	FOREIGN KEY (id_spectator) REFERENCES Spectators(id), 
	FOREIGN KEY (id_registration) REFERENCES Registrations(id) 
); 
