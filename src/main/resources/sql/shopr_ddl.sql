CREATE TABLE user (
  id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name              VARCHAR(255) NOT NULL,
  first_name        VARCHAR(255) NOT NULL
);


CREATE TABLE item(

  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  title VARCHAR(255),
  price LONG
);

CREATE TABLE lp (

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  publisher VARCHAR(255),
  genre ENUM('Classical', 'Rock', 'R&B', 'Dance', 'Hip-Hop', 'Pop')


);


CREATE TABLE games(

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  publisher VARCHAR(255),
  genre ENUM('MMORPG', 'RTS', 'RPG', 'RACE', 'FPS'),
  minAge INT


);

CREATE TABLE book(

    id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(255),
    isbn LONG,
    totalPages INT

  );


CREATE TABLE fiction(

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  bookGenre ENUM('Thriller','Romance','Sci-Fi','Detective','Fantasy'),
  preview VARCHAR(255)

);

CREATE TABLE nonFiction(

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subject ENUM('Sports','Science','History','Cooking')
);