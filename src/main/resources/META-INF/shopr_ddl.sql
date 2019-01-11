insert into article(articleId, title, price, supplierId, type) VALUES (1000, 'Rumours', 10, 'LP Studio', 'lp');
insert into lp(articleId, artist, LPMusicGenre) VALUES (1000, 'Fleetwood Mac', 2);

insert into article(articleId, title, price, supplierId, type) VALUES (1001, '1000 Forms of Fear', 12, 'LP Studio', 'lp');
insert into lp(articleId, artist, LPMusicGenre) VALUES (1001, 'Sia', 1);

insert into article(articleId, title, price, supplierId, type) VALUES (1002, 'All Killer No Filler', 8, 'LP Studio', 'lp');
insert into lp(articleId, artist, LPMusicGenre) VALUES (1002, 'Sum41', 2);

insert into article(articleId, title, price, supplierId, type) VALUES (1003, 'Box Car Racer', 10, 'LP Studio', 'lp');
insert into lp(articleId, artist, LPMusicGenre) VALUES (1003, 'Box Car Racer', 2);

insert into article(articleId, title, price, supplierId, type) VALUES (1004, 'Game1', 15, 'Game Studio', 'game');
insert into game(articleId, gameGenre, minimumAge, publisher) VALUES (1004, 2, 6, 'Dunno');

insert into article(articleId, title, price, supplierId, type) VALUES (1005, 'Game2', 17, 'Game Studio', 'game');
insert into game(articleId, gameGenre, minimumAge, publisher) VALUES (1005, 0, 12, 'Dunno');

insert into article(articleId, title, price, supplierId, type) VALUES (1006, 'Game3', 25, 'Game Studio', 'game');
insert into game(articleId, gameGenre, minimumAge, publisher) VALUES (1006, 1, 18, 'Dunno');

insert into article(articleId, title, price, supplierId, type) VALUES (1007, 'Game4', 10, 'Game Studio', 'game');
insert into game(articleId, gameGenre, minimumAge, publisher) VALUES (1007, 3, 16, 'Dunno');

insert into article(articleId, title, price, supplierId, type) VALUES (1008, 'War and Peace', 22, 'Penguin Books Ltd', 'fiction');
insert into book(articleId, author, isbn, numberOfPages ) VALUES (1008, 'Leo Tolstoy', '978-02-4126-554-3', 1440);
insert into bookfiction(articleId, bookGenre, summary) VALUES (1008, 3, 'At a glittering society party in St Petersburg in 1805, conversations are dominated by the prospect of war. Terror swiftly engulfs the country as Napoleon''s army marches on Russia, and the lives of three young people are changed forever. The stories of quixotic Pierre, cynical Andrey and impetuous Natasha interweave with a huge cast, from aristocrats and peasants to soldiers and Napoleon himself.');

insert into article(articleId, title, price, supplierId, type) VALUES (1009, 'The Vegetable Butcher', 20.36, 'Workman Publishing New York', 'nonfiction');
insert into book(articleId, author, isbn, numberOfPages ) VALUES (1009, 'Cara Mangini', '978-07-6118-052-4', 352);
insert into booknonfiction(articleId, bookSubjectNF) VALUES (1009, 2);
