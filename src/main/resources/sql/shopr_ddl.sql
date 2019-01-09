CREATE TABLE user (
  id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name              VARCHAR(255) NOT NULL,
  first_name        VARCHAR(255) NOT NULL
);

INSERT INTO  user (id, first_name, name) VALUES (1000, 'John', 'Doe');
INSERT INTO  user (id, first_name, name) VALUES (2000, 'Joe', 'Buck');
INSERT INTO  user (id, first_name, name) VALUES (3000, 'Nancy', 'Doe');


INSERT INTO product (id, title, publisher, price, product_type) VALUES (1001, 'Thriller Book', 'Best Thrillers', 39.99, 'fiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1002, 'Fantasy Book', 'Best Fantasies', 9.99, 'fiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1003, 'Detective Book', 'Best Detective', 19.99, 'fiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1004, 'Romance Book', 'Best Romance', 5.99, 'fiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1005, 'Sci-Fi Book', 'Best Sci-Fi', 59.99, 'fiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1006, 'History Book', 'Best History', 79.99, 'nonFiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1007, 'Cooking Book', 'Best Cooking', 69.99, 'nonFiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1008, 'Science Book', 'Best Science', 99.99, 'nonFiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1009, 'Sport Book', 'Best Sport', 29.99, 'nonFiction');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1010, 'Classic LP', 'Best Classic', 45.99, 'lp');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1011, 'POP LP', 'Best Classic', 45.99, 'lp');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1012, 'ROCK LP', 'Best ROCK', 41.99, 'lp');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1013, 'DANCE LP', 'Best DANCE', 42.99, 'lp');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1014, 'RnB LP', 'Best RnB', 46.99, 'lp');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1015, 'HIPHOP LP', 'Best HIPHOP', 47.99, 'lp');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1016, 'God of war', 'Santa Monica', 29.99, 'game');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1017, 'The Witcher 3', 'CD Project', 19.99, 'game');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1018, 'World of Warcraft', 'Blizzard', 35.99, 'game');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1019, 'The Legend of Zelda: Breath of the Wild', 'Nintendo', 29.99, 'game');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1020, 'Overwatch', 'Blizzard', 19.99, 'game');
INSERT INTO product (id, title, publisher, price, product_type) VALUES (1021, 'Mario Kart 8', 'Nintendo', 25.99, 'game');


INSERT INTO book (id, author, isbn, nb_pages) VALUES (1001, 'Adeel Burke', '1233', 333);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1003, 'Aadil Knight', '1235', 521);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1004, 'Harlee Burnett', '1236', 221);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1005, 'Drew Brock', '1225', 652);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1006, 'Freddy Cohen', '1472', 789);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1007, 'Micheal Felix', '1287', 120);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1008, 'Cari Martins', '1278', 952);
INSERT INTO book (id, author, isbn, nb_pages) VALUES (1009, 'Jim Warner', '1472', 450);


INSERT INTO fiction (id, genre, summary) VALUES (1001, 0 ,'Thriller Summary');
INSERT INTO fiction (id, genre, summary) VALUES (1002, 1,'Fantasy Summary');
INSERT INTO fiction (id, genre, summary) VALUES (1003, 2,'Detective Summary');
INSERT INTO fiction (id, genre, summary) VALUES (1004, 3,'Romance Summary');
INSERT INTO fiction (id, genre, summary) VALUES (1005, 4,'Sci-Fi Summary');

INSERT INTO nonfiction (id, nonFictionGenre) VALUES (1006, 'HISTORY');
INSERT INTO nonfiction (id, nonFictionGenre) VALUES (1007, 'COOKING');
INSERT INTO nonfiction (id, nonFictionGenre) VALUES (1008, 'SCIENCE');
INSERT INTO nonfiction (id, nonFictionGenre) VALUES (1009, 'SPORT');

INSERT INTO lp (id, interpreter, genre) VALUES (1010, 'Mikey Gill', 'CLASSIC');
INSERT INTO lp (id, interpreter, genre)VALUES (1011, 'Leyton Rawlings', 'POP');
INSERT INTO lp (id, interpreter, genre)VALUES (1012, 'Kerry Gibbs', 'ROCK');
INSERT INTO lp (id, interpreter, genre)VALUES (1013, 'Zayaan Lutz', 'DANCE');
INSERT INTO lp (id, interpreter, genre)VALUES (1014, 'Harlow Hope', 'RnB');
INSERT INTO lp (id, interpreter, genre)VALUES (1015, 'Ava Mathis', 'HIPHOP');


INSERT INTO game (id, editor, genre ,pegi_rating) VALUES (1016, 'Sony', 1, 18);
INSERT INTO game (id, editor, genre ,pegi_rating) VALUES (1017, 'Sony', 1, 18);
INSERT INTO game (id, editor, genre ,pegi_rating) VALUES (1018, 'Blizzard', 0, 13);
INSERT INTO game (id, editor, genre ,pegi_rating) VALUES (1019, 'Nintendo', 1, 13);
INSERT INTO game (id, editor, genre ,pegi_rating) VALUES (1020, 'Blizzard', 2, 13);
INSERT INTO game (id, editor, genre ,pegi_rating) VALUES (1021, 'Nintendo', 4, 7);
