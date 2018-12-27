CREATE TABLE user (
  id         INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL
);

CREATE TABLE article (
  id    INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  price DOUBLE       NOT NULL,
  supplier VARCHAR(50) NOT NULL
);

CREATE TABLE book
(
  author VARCHAR(100) NOT NULL,
  isbn varchar(255) NOT NULL,
  pages INT
);

CREATE TABLE lp
(
  artist VARCHAR(100),
  genre VARCHAR(100)
);
CREATE TABLE game
(
  publisher varchar(100) NOT NULL,
  min_age int NOT NULL,
  genre varchar(50) NOT NULL
);



