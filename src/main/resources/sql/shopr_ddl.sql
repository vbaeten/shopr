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


)