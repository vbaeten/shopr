CREATE TABLE user (
  id         INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL
);

CREATE TABLE article (
  id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title       VARCHAR(255) NOT NULL,
  price       LONG NOT NULL
);



