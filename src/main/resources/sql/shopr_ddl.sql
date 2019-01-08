CREATE TABLE user (
  id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name              VARCHAR(255) NOT NULL,
  first_name        VARCHAR(255) NOT NULL
);

CREATE TABLE item_review(

  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  description VARCHAR(1000),
  score smallint,
  item_id INT

);

CREATE TABLE orders(

  id int not null auto_increment primary key,
  orderline_id int,
  user_id int

);

CREATE TABLE order_line(

  id int not null auto_increment primary key,
  order_id int,
  quantity int

);


CREATE TABLE item(

  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  title VARCHAR(255),
  price LONG,
  type VARCHAR(255)
);

CREATE TABLE lp (

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  publisher VARCHAR(255),
  genre VARCHAR(255)


);




CREATE TABLE games(

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  publisher VARCHAR(255),
  genre VARCHAR(255),
  minAge SMALLINT


);

CREATE TABLE book(

    id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(255),
    isbn LONG,
    totalPages INT

  );


CREATE TABLE fiction(

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  bookGenre VARCHAR(255),
  preview VARCHAR(255)

);

CREATE TABLE nonFiction(

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subject VARCHAR(255)
);