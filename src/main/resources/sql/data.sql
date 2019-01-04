
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (1,"12345",49.99,"WoW", "game");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (2,"12346",59.99,"WoW2", "game");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (3,"12347",44.99,"GTA", "game");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (4,"12348",99.99,"Super Mario", "game");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (5,"12349",49.99,"Need For Speed", "game");

INSERT INTO game(id, gameGenre, minimum_leeftijd, uitgever) VALUES (1,"RPG",12,"Blizzard");
INSERT INTO game(id, gameGenre, minimum_leeftijd, uitgever) VALUES (2,"MMORPG",14,"Blizzard1");
INSERT INTO game(id, gameGenre, minimum_leeftijd, uitgever) VALUES (3,"FPS",18,"Rockstar");
INSERT INTO game(id, gameGenre, minimum_leeftijd, uitgever) VALUES (4,"RTS",10,"Nintendo");
INSERT INTO game(id, gameGenre, minimum_leeftijd, uitgever) VALUES (5,"RACE",16,"Playstation");


INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (11,"123456",9.99,"Klassieke Toppers", "lp");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (12,"123457",12.99,"Top 50 Pop", "lp");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (13,"123458",8.99,"Top 20 Rock", "lp");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (14,"123459",10.99,"Top 50 Dance", "lp");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (15,"123460",19.99,"R&B Top 100", "lp");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (16,"123461",13.99,"Hiphop Top 50", "lp");

INSERT INTO lp(id, lpGenre, uitvoerder) VALUES (11,"KLASSIEK", "uitv1");
INSERT INTO lp(id, lpGenre, uitvoerder) VALUES (12,"POP", "uitv2");
INSERT INTO lp(id, lpGenre, uitvoerder) VALUES (13,"ROCK", "uitv3");
INSERT INTO lp(id, lpGenre, uitvoerder) VALUES (14,"DANCE", "uitv4");
INSERT INTO lp(id, lpGenre, uitvoerder) VALUES (15,"RNB", "uitv5");
INSERT INTO lp(id, lpGenre, uitvoerder) VALUES (16,"HIPHOP", "uitv6");


INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (101,"1234561",12.99,"Beste Thriller", "fictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (102,"1234562",8.99,"Beste Fantasy", "fictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (103,"1234563",9.99,"Beste Detective", "fictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (104,"1234564",7.99,"Beste Romance", "fictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (105,"1234563",11.99,"Beste Sci-fi", "fictie");

INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (101,100,"Markske","514-15-5444-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (102,105,"Jommeke","514-15-1586-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (103,150,"Jeromeke","514-15-3218-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (104,125,"Tommeke","514-15-8941-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (105,200,"Janneke","514-15-3546-356-5");

INSERT INTO fictie(id, fictieGenre, korte_inhoud) VALUES (101,"THRILLER","korte inhoud1 blablablablablabla");
INSERT INTO fictie(id, fictieGenre, korte_inhoud) VALUES (102,"FANTASY","korte inhoud2 blablablablablabla");
INSERT INTO fictie(id, fictieGenre, korte_inhoud) VALUES (103,"DETECTIVE","korte inhoud3 blablablablablabla");
INSERT INTO fictie(id, fictieGenre, korte_inhoud) VALUES (104,"ROMANCE","korte inhoud4 blablablablablabla");
INSERT INTO fictie(id, fictieGenre, korte_inhoud) VALUES (105,"SCIFI","korte inhoud5 blablablablablabla");


INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (1001,"12345671",19.99,"Beste Geschiedenis", "nonFictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (1002,"12345672",7.99,"Beste Kookboek", "nonFictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (1003,"12345672",14.99,"Beste Wetenschap", "nonFictie");
INSERT INTO artikel(id, ID_leverancier, prijs, titel, TYPE) VALUES (1004,"12345671",12.99,"Beste Sport", "nonFictie");

INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (1001,550,"Markske","514-15-8465-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (1002,50,"Jommeke","514-15-1561-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (1003,250,"Jeromeke","514-15-6515-356-5");
INSERT INTO boek(id, aantal_paginas, auteur, isbn) VALUES (1004,125,"Tommeke","514-15-8974-356-5");

INSERT INTO non_fictie(id, nonFictieOnderwerp) VALUES (1001,"GESCHIEDENIS");
INSERT INTO non_fictie(id, nonFictieOnderwerp) VALUES (1002,"KOOKBOEK");
INSERT INTO non_fictie(id, nonFictieOnderwerp) VALUES (1003,"WETENSCHAP");
INSERT INTO non_fictie(id, nonFictieOnderwerp) VALUES (1004,"SPORT");

