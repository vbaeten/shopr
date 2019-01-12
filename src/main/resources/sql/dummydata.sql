insert into article(articleId, title, price, supplierId, type) VALUES (1000, 'Rumours', 10, 'LP Studio', 'lp');
insert into lp(articleId, artist, LPMusicGenre) VALUES (1000, 'Fleetwood Mac', 2);

insert into article(articleId, title, price, supplierId, type) VALUES (1001, 'All Killer No Filler', 8, 'LP Studio', 'lp');
insert into lp(articleId, artist, LPMusicGenre) VALUES (1001, 'Sum41', 2);

insert into article(articleId, title, price, supplierId, type) VALUES (1002, 'Duck Hunt', 12.99, 'Gamewalhalla', 'game');
insert into game(articleId, gameGenre, minimumAge, publisher) VALUES (1002, 2, 6, 'Nintendo');

insert into article(articleId, title, price, supplierId, type) VALUES (1003, 'The Sims', 10.99, 'Gamesync', 'game');
insert into game(articleId, gameGenre, minimumAge, publisher) VALUES (1003, 0, 7, 'Electronic Arts');

insert into article(articleId, title, price, supplierId, type) VALUES (1004, 'War and Peace', 22, 'Penguin Books Ltd', 'fiction');
insert into book(articleId, author, isbn, numberOfPages ) VALUES (1004, 'Leo Tolstoy', '978-02-4126-554-3', 1440);
insert into bookfiction(articleId, bookGenre, summary) VALUES (1004, 3, 'Summary');

insert into article(articleId, title, price, supplierId, type) VALUES (1005, 'The clan of the cave bear', 16.16, 'Crown Publishing Group', 'fiction');
insert into book(articleId, author, isbn, numberOfPages ) VALUES (1005, 'Jean M. Auel', '978-05-5338-167-2', 468);
insert into bookfiction(articleId, bookGenre, summary) VALUES (1005, 5, 'Summary');

insert into article(articleId, title, price, supplierId, type) VALUES (1006, 'The Vegetable Butcher', 20.36, 'Workman Publishing New York', 'nonfiction');
insert into book(articleId, author, isbn, numberOfPages ) VALUES (1006, 'Cara Mangini', '978-07-6118-052-4', 352);
insert into booknonfiction(articleId, bookSubjectNF) VALUES (1006, 2);

insert into article(articleId, title, price, supplierId, type) VALUES (1007, 'Long walk to freedom', 16.99, 'Little, Brown & Company', 'nonfiction');
insert into book(articleId, author, isbn, numberOfPages ) VALUES (1007, 'Nelson Mandela', '978-03-1654-818-2', 656);
insert into booknonfiction(articleId, bookSubjectNF) VALUES (1007, 4);
