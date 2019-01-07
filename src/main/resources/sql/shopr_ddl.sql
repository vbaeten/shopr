-- CREATE TABLE user (
--   id                INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   name              VARCHAR(255) NOT NULL,
--   first_name        VARCHAR(255) NOT NULL
-- );
insert into user(id, name , first_name, role ) values(10, 'Meyers', 'Koen', 'ADMIN');
insert into user(id, name , first_name, role ) values(11, 'Meyers', 'Indy', 'USER');
insert into user(id, name , first_name, role ) values(12, 'Meyers', 'Odin', 'USER');

INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '1', 'records', '20', 'opus');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('game', '2', 'idgames', '60', 'quake');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('fictie', '3', 'vatican', '34', 'bijbel');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('nonFictie', '4', 'dsfsdf', '21', 'quantumMechanics');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('nonFictie', '5', 'microsoft', '213', '.net');

INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('230', 'jesus', '99921-58-10-7', '3');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('500', 'hawkins', '9971-5-0210-0', '4');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('500', 'gates', '9971-5-0230-0', '5');


INSERT INTO `shopr`.`game` (`enumGameGenre`, `minLeeftijd`, `uitgever`, `id`) VALUES ('FPS', '18', 'activision', '2');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'ghost', '1');
INSERT INTO `shopr`.`fictie` (`genre`, `korteInhoud`, `id`) VALUES ('FANTASY', 'zombies', '3');
INSERT INTO `shopr`.`nonfictie` (`enumNonFictieGenre`, `id`) VALUES ('WETENSCHAP', '4');

INSERT INTO `shopr`.`reviews` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('2', 'boring', '1', '1');
UPDATE `shopr`.`reviews` SET `onschrijving` = 'great', `score` = '5', `artikel_id` = '1' WHERE (`id` = '1');
INSERT INTO `shopr`.`reviews` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('3', 'average', '3', '1');
INSERT INTO `shopr`.`reviews` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('4', 'great ++', '5', '1');




