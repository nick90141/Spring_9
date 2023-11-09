CREATE DATABASE IF NOT EXISTS spring_9;
USE spring_9;

CREATE TABLE IF NOT EXISTS User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL
);

INSERT INTO user (username, email) VALUES
('user1', 'email1'),
('user2', 'email2'),
('user3', 'email3'),
('user4', 'email4'),
('user5', 'email5');

INSERT INTO Product (name, price) VALUES
('name1', 100),
('name2', 200),
('name3', 300),
('name4', 400),
('name5', 500);

select*from user;
select*from Product;
