INSERT INTO item(id, title, price)
  VALUES (1, 'Paranoid', 20.00);
INSERT INTO item(id, title, price)
  VALUES (2, 'The Richest Man In Babylon', 18.00);
INSERT INTO item(id, title, price)
  VALUES (3, 'Journey In Satchidananda', 25.00);
INSERT INTO item(id, title, price)
  VALUES (4, 'League of Legends', 0.00);
INSERT INTO item(id, title, price)
  VALUES (5, 'Minecraft', 23.95);
INSERT INTO item(id, title, price)
  VALUES (6, 'Artifact', 17.95);
INSERT INTO item(id, title, price)
  VALUES (7, 'The Kite Runner', 11.95);
INSERT INTO item(id, title, price)
  VALUES (8, 'The Help', 9.95);
INSERT INTO item(id, title, price)
  VALUES (9, 'The Oxford History of Ancient Egypt', 12.99);
INSERT INTO item(id, title, price)
  VALUES (10, 'Cooking Basics for Dummies', 14.99);

INSERT INTO lp(id, artist, lp_genre)
  VALUES (1, 'Black Sabbath', 'ROCK');
INSERT INTO lp(id, artist, lp_genre)
  VALUES (2, 'Thievery Corporation', 'ELECTRONIC');
INSERT INTO lp(id, artist, lp_genre)
  VALUES (3, 'Alice Coltrane', 'JAZZ');

INSERT INTO game(id, publisher, min_age, game_genre)
  VALUES (4, 'Riot Games', 12, 'MOBA');
INSERT INTO game(id, publisher, min_age, game_genre)
  VALUES (5, 'Mojang', 42, 'SANDBOX');
INSERT INTO game(id, publisher, min_age, game_genre)
  VALUES (6, 'Valve', 12, 'RTS');

INSERT INTO book(id, author, isbn, pages)
  VALUES (7, 'Khaled Hosseini', 9781594480003, 371);
INSERT INTO book(id, author, isbn, pages)
  VALUES (8, 'Kathryn Stockett', 9780399155345, 465);
INSERT INTO book(id, author, isbn, pages)
  VALUES (9, 'Ian Shaw', 9780198150343, 554);
INSERT INTO book(id, author, isbn, pages)
  VALUES (10, 'Bryan Miller', 9780764572067, 436);

INSERT INTO fiction(id, book_genre, summary)
  VALUES (7, 'THRILLER',
          'A sweeping story of family, love, and friendship told against the devastating backdrop of the history of Afghanistan over the last thirty years, The Kite Runner is an unusual and powerful novel that has become a beloved, one-of-a-kind classic.');
INSERT INTO fiction(id, book_genre, summary)
  VALUES (8, 'ROMANCE',
          'Twenty-two-year-old Skeeter has just returned home after graduating from Ole Miss. She may have a degree, but it is 1962, Mississippi, and her mother will not be happy till Skeeter has a ring on her finger.');

INSERT INTO non_fiction(id, topic)
  VALUES (9, 'HISTORY');
INSERT INTO non_fiction(id, topic)
  VALUES (10, 'COOKBOOK');