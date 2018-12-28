CREATE TABLE user (
  id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name              VARCHAR(255) NOT NULL,
  first_name        VARCHAR(255) NOT NULL
);

INSERT INTO  user (id, first_name, name) VALUES (1001, 'John', 'Doe');
INSERT INTO  user (id, first_name, name) VALUES (1002, 'Joe', 'Buck');
INSERT INTO  user (id, first_name, name) VALUES (1003, 'Nancy', 'Doe');



INSERT INTO fiction (id, price, publisher, title, author, isbn, nb_pages, genre, summary) VALUES (1001, 19.99, 'Apres', 'Java EE for beginners', 'Jason Burn', '123456', 555, 4, 'Summary');
INSERT INTO fiction (id, price, publisher, title, author, isbn, nb_pages, genre, summary) VALUES (1002, 14.99, 'ORailly', 'Intro to Java EE', 'Micheal Jackson', '123457', 350, 3, 'Short Summary');
INSERT INTO fiction (id, price, publisher, title, author, isbn, nb_pages, genre, summary) VALUES (1003, 12.99, 'Apres', 'Java EE for Dummies', 'Jimi Hendrix', '123458', 128, 2, 'Looong Summary');
INSERT INTO fiction (id, price, publisher, title, author, isbn, nb_pages, genre, summary) VALUES (1004, 9.99, 'Packt', 'Pro Java EE', 'Sponge Bob', '123459', 485, 1, 'Summary ___________');
INSERT INTO fiction (id, price, publisher, title, author, isbn, nb_pages, genre, summary) VALUES (1005, 19.99, 'Apres', 'Practical Java EE', 'Jason Burn', '123460', 988, 4, 'Summary ---------');

INSERT INTO nonfiction (id, price, publisher, title, author, isbn, nb_pages, subject) VALUES (1001, 59.99, 'Apres', 'Roman Empire', 'Darth Vador', '123466', 1268, 0);
INSERT INTO nonfiction (id, price, publisher, title, author, isbn, nb_pages, subject) VALUES (1002, 39.99, 'Pakt', 'Cooking Recipes', 'Dark Maul', '123467', 350, 1);
INSERT INTO nonfiction (id, price, publisher, title, author, isbn, nb_pages, subject) VALUES (1003, 89.99, 'Other', 'Math for experts', 'Palpatine', '123468', 1856, 2);
INSERT INTO nonfiction (id, price, publisher, title, author, isbn, nb_pages, subject) VALUES (1004, 49.99, 'Something', 'Math for beginners', 'Palpatine', '123469', 555, 2);

INSERT INTO lp (id, price, publisher, title, interpreter, genre) VALUES (1001, 16.99, 'Something', 'Micheal Jackson', 'Thriller', 1);
INSERT INTO lp (id, price, publisher, title, interpreter, genre)VALUES (1002, 17.99, 'Something', 'Beethoven', '9 Symphony', 0);

INSERT INTO game (id, price, publisher, title, editor, genre ,pegi_rating) VALUES (1002, 29.99, 'Sony', 'God of war', 'Santa Monica', 1, 18);
INSERT INTO game (id, price, publisher, title, editor, genre ,pegi_rating) VALUES (1003, 19.99, 'Sony', 'The Witcher 3', 'CD Project', 1, 18);
INSERT INTO game (id, price, publisher, title, editor, genre ,pegi_rating) VALUES (1004, 34.99, 'Blizzard', 'World of Warcraft', 'Blizzard', 0, 13);
INSERT INTO game (id, price, publisher, title, editor, genre ,pegi_rating) VALUES (1005, 29.99, 'Nintendo', 'The Legend of Zelda: Breath of the Wild', 'Nintendo', 1, 13);
INSERT INTO game (id, price, publisher, title, editor, genre ,pegi_rating) VALUES (1006, 19.99, 'Blizzard', 'Overwatch', 'Blizzard', 2, 13);
INSERT INTO game (id, price, publisher, title, editor, genre ,pegi_rating) VALUES (1007, 39.99, 'Nintendo', 'Mario Kart 8', 'Nintendo', 4, 7);
