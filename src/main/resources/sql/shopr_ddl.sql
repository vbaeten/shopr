CREATE TABLE user (
  id         INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL
);

CREATE TABLE article (
  id INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title      VARCHAR(255) NOT NULL,
  price      DOUBLE,
  supplier   VARCHAR(50)  NOT NULL
);

CREATE TABLE book
(
  id INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  author VARCHAR(100) NOT NULL,
  isbn   varchar(255) NOT NULL,
  pages  INT
);

CREATE TABLE lp
(
  id INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  artist VARCHAR(100),
  genre  VARCHAR(100)
);
CREATE TABLE game
(
  id INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  publisher  varchar(100),
  min_age    int,
  genre      varchar(50)
);

CREATE TABLE non_fiction
(
  id INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  genre varchar(50)
);

CREATE TABLE fiction
(
  id       INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  genre    varchar(50),
  synopsis varchar(255)

);



