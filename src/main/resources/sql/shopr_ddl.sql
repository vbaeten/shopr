INSERT INTO  shopr.user (id, first_name, name) VALUES (1000, 'John', 'Doe');
INSERT INTO  shopr.user (id, first_name, name) VALUES (2000, 'Joe', 'Buck');
INSERT INTO  shopr.user (id, first_name, name) VALUES (3000, 'Nancy', 'Doe');


INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1001, 'Thriller Book', 'Best Thrillers', 39.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1002, 'Fantasy Book', 'Best Fantasies', 9.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1003, 'Detective Book', 'Best Detective', 19.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1004, 'Romance Book', 'Best Romance', 5.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1005, 'Sci-Fi Book', 'Best Sci-Fi', 59.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1006, 'History Book', 'Best History', 79.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1007, 'Cooking Book', 'Best Cooking', 69.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1008, 'Science Book', 'Best Science', 99.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1009, 'Sport Book', 'Best Sport', 29.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1010, 'Classic LP', 'Best Classic', 45.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1011, 'POP LP', 'Best Classic', 45.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1012, 'ROCK LP', 'Best ROCK', 41.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1013, 'DANCE LP', 'Best DANCE', 42.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1014, 'RnB LP', 'Best RnB', 46.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1015, 'HIPHOP LP', 'Best HIPHOP', 47.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1016, 'God of war', 'Santa Monica', 29.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1017, 'The Witcher 3', 'CD Project', 19.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1018, 'World of Warcraft', 'Blizzard', 35.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1019, 'The Legend of Zelda: Breath of the Wild', 'Nintendo', 29.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1020, 'Overwatch', 'Blizzard', 19.99);
INSERT INTO shopr.artikel (id, Titel, leverancier, price) VALUES (1021, 'Mario Kart 8', 'Nintendo', 25.99);


INSERT INTO shopr.game (id, Uitgever, Genre,MinimumAge) VALUES (1016, 'Sony', 'fantasy',3);
INSERT INTO shopr.game (id, Uitgever, Genre,MinimumAge) VALUES (1017, 'Sony', 'action', 4);
INSERT INTO shopr.game (id, Uitgever, Genre,MinimumAge) VALUES (1018, 'Blizzard', 'action',4);
INSERT INTO shopr.game (id, Uitgever, Genre,MinimumAge) VALUES (1019, 'Nintendo', 'horror',5);
INSERT INTO shopr.game (id, Uitgever, Genre,MinimumAge) VALUES (1020, 'Blizzard', 'sports',4);
INSERT INTO shopr.game (id, Uitgever, Genre,MinimumAge) VALUES (1021, 'Nintendo', 'fantasy',4);

INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1001, 'Adeel Burke', '1233', 333);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1003, 'Aadil Knight', '1235', 521);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1004, 'Harlee Burnett', '1236', 221);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1005, 'Drew Brock', '1225', 652);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1006, 'Freddy Cohen', '1472', 789);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1007, 'Micheal Felix', '1287', 120);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1008, 'Cari Martins', '1278', 952);
INSERT INTO shopr.boek (id, Auteur, ISBN, NumberOfPages) VALUES (1009, 'Jim Warner', '1472', 450);


INSERT INTO shopr.boeknonfiction (id, Boekgenrenonfictie) VALUES (1006, 'GESCHIEDENIS');
INSERT INTO shopr.boeknonfiction (id, Boekgenrenonfictie) VALUES (1007, 'KOOKBOEK');
INSERT INTO shopr.boeknonfiction (id, Boekgenrenonfictie) VALUES (1008, 'WETENSCHAP');
INSERT INTO shopr.boeknonfiction (id, Boekgenrenonfictie) VALUES (1009, 'SPORT');

INSERT INTO shopr.boekfiction (id, Boekgenrefictie, Inhoud) VALUES (1001, 'FANTASY' ,'Thriller Summary');
INSERT INTO shopr.boekfiction (id, Boekgenrefictie, Inhoud) VALUES (1002, 'FANTASY','Fantasy Summary');
INSERT INTO shopr.boekfiction (id, Boekgenrefictie, Inhoud) VALUES (1003,'FANTASY','Detective Summary');
INSERT INTO shopr.boekfiction (id, Boekgenrefictie, Inhoud) VALUES (1004, 'FANTASY','Romance Summary');
INSERT INTO shopr.boekfiction (id, Boekgenrefictie, Inhoud) VALUES (1005, 'FANTASY','Sci-Fi Summary');

INSERT INTO shopr.lp (id, UitvoerderTitel, genre) VALUES (1010, 'Mikey Gill', 'CLASSIC');
INSERT INTO shopr.lp (id, UitvoerderTitel, genre)VALUES (1011, 'Leyton Rawlings', 'POP');
INSERT INTO shopr.lp (id, UitvoerderTitel, genre)VALUES (1012, 'Kerry Gibbs', 'ROCK');
INSERT INTO shopr.lp (id, UitvoerderTitel, genre)VALUES (1013, 'Zayaan Lutz', 'DANCE');
INSERT INTO shopr.lp (id, UitvoerderTitel, genre)VALUES (1014, 'Harlow Hope', 'RnB');
INSERT INTO shopr.lp (id, UitvoerderTitel, genre)VALUES (1015, 'Ava Mathis', 'HIPHOP');