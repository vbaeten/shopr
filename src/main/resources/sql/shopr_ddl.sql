-- CREATE TABLE user (
--   id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   name              VARCHAR(255) NOT NULL,
--   first_name        VARCHAR(255) NOT NULL
-- );
insert into user(id, name , first_name ) values(10, 'Koen', 'Meyers');
insert into user(id, name , first_name ) values(11, 'Indy', 'Meyers');
insert into user(id, name , first_name ) values(12, 'Odin', 'Meyers');

INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '1', 'records', '20', 'opus');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('game', '2', 'idgames', '60', 'quake');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('fictie', '3', 'vatican', '34', 'bijbel');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('nonFictie', '4', 'dsfsdf', '21', 'quantumMechanics');

INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('230', 'jesus', '99921-58-10-7', '3');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('500', 'hawkins', '9971-5-0210-0', '4');


INSERT INTO `shopr`.`game` (`enumGameGenre`, `minLeeftijd`, `uitgever`, `id`) VALUES ('FPS', '18', 'activision', '2');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'ghost', '1');
INSERT INTO `shopr`.`fictie` (`genre`, `korteInhoud`, `id`) VALUES ('FANTASY', 'zombies', '3');
INSERT INTO `shopr`.`nonfictie` (`enumNonFictieGenre`, `id`) VALUES ('WETENSCHAP', '4');

