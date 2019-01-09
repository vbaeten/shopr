insert into article(id, title, price, supplierId, type) VALUES (1000, 'Rumours', 10, 'LP Studio', 'lp');
insert into lp(id, artist, LPMusicGenre) VALUES (1000, 'Fleetwood Mac', 2);

insert into article(id, title, price, supplierId, type) VALUES (1001, '1000 Forms of Fear', 12, 'LP Studio', 'lp');
insert into lp(id, artist, LPMusicGenre) VALUES (1001, 'Sia', 1);

insert into article(id, title, price, supplierId, type) VALUES (1002, 'All Killer No Filler', 8, 'LP Studio', 'lp');
insert into lp(id, artist, LPMusicGenre) VALUES (1002, 'Sum41', 2);

insert into article(id, title, price, supplierId, type) VALUES (1003, 'Box Car Racer', 10, 'LP Studio', 'lp');
insert into lp(id, artist, LPMusicGenre) VALUES (1003, 'Box Car Racer', 2);

insert into article(id, title, price, supplierId, type) VALUES (1004, 'Game1', 15, 'Game Studio', 'game');
insert into game(id, gameGenre, minimumAge, publisher) VALUES (1004, 2, 6, 'Dunno');

insert into article(id, title, price, supplierId, type) VALUES (1005, 'Game2', 17, 'Game Studio', 'game');
insert into game(id, gameGenre, minimumAge, publisher) VALUES (1005, 0, 12, 'Dunno');

insert into article(id, title, price, supplierId, type) VALUES (1006, 'Game3', 25, 'Game Studio', 'game');
insert into game(id, gameGenre, minimumAge, publisher) VALUES (1006, 1, 18, 'Dunno');

insert into article(id, title, price, supplierId, type) VALUES (1007, 'Game4', 10, 'Game Studio', 'game');
insert into game(id, gameGenre, minimumAge, publisher) VALUES (1007, 3, 16, 'Dunno');

insert into article(id, title, price, supplierId, type) VALUES (1008, 'BoekFictie1', 12, 'Book Studio', 'fiction');
insert into book(id, author, isbn, numberOfPages ) VALUES (1008, 'kweni', '978-90-1234-567-8', 586);
insert into bookfiction(id, bookGenre, summary) VALUES (1008, 2, 'eomqzioejzcfjeiuhpgciqzmjmfosfghaefjze iofergeqifjemqelsh');

insert into article(id, title, price, supplierId, type) VALUES (1009, 'BoekNONFictie1', 8, 'Book NON Studio', 'nonfiction');
insert into book(id, author, isbn, numberOfPages ) VALUES (1009, 'dunno', '978-90-1234-567-9', 256);
insert into booknonfiction(id, bookSubjectNF) VALUES (1009, 3);
