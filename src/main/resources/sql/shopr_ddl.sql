CREATE TABLE user (
  id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name              VARCHAR(255) NOT NULL,
  first_name        VARCHAR(255) NOT NULL
);


CREATE TABLE lp (

  id  INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  publisher VARCHAR(255),
  genre VARCHAR(255)


);