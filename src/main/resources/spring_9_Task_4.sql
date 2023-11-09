create database MyEntity;

use MyEntity;

CREATE TABLE MyEntity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    someData VARCHAR(100),
    anotherData VARCHAR(100)
);

INSERT INTO MyEntity (someData, anotherData) VALUES 
('Data1', 'AnotherData1'),
('Data2', 'AnotherData2');

