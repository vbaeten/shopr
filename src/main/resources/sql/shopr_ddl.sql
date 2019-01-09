insert into user(id, name , first_name, role ) values(10, 'Meyers', 'Koen', 'ADMIN');
insert into user(id, name , first_name, role ) values(13, 'Admin', 'Admin', 'ADMIN');
insert into user(id, name , first_name, role ) values(11, 'Meyers', 'Indy', 'USER');
insert into user(id, name , first_name, role ) values(12, 'Meyers', 'Odin', 'USER');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '1', 'records', '20', 'opus');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('game', '2', 'idgames', '60', 'quake');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('fictie', '3', 'vatican', '34', 'bijbel');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('nonFictie', '4', 'dsfsdf', '21', 'quantumMechanics');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('nonFictie', '5', 'microsoft', '213', '.net');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('game', '6', 'bungie', '70', 'halo');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('game', '7', 'sony interactive', '40', 'god of war');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '8', 'nuclear blast', '30', 'i love you at your darkest');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('nonFictie', '9', 'lavey', '8', 'the satanic bible');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '10', 'heart&skull', '20', 'good mourning');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '11', 'nuclear blast', '20', 'northern chaos gods');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '12', 'records', '21', 'infestissumam');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '13', 'epitaph', '23', 'phantom anthem');
INSERT INTO `shopr`.`artikel` (`type`, `id`, `leverancier`, `prijs`, `titel`) VALUES ('lp', '14', 'epitaph', '19', 'still searching');
INSERT INTO `shopr`.`game` (`enumGameGenre`, `minLeeftijd`, `uitgever`, `id`) VALUES ('FPS', '18', 'microsoft', '6');
INSERT INTO `shopr`.`game` (`enumGameGenre`, `minLeeftijd`, `uitgever`, `id`) VALUES ('RPG', '12', 'sony', '7');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('ROCK', 'alkaline trio', '10');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'immortal', '11');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'ghost', '12');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'august burns red', '13');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('ROCK', 'senses fail', '14');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('230', 'jesus', '99921-58-10-7', '3');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('500', 'hawkins', '9971-5-0210-0', '4');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('500', 'gates', '9971-5-0230-0', '5');
INSERT INTO `shopr`.`boek` (`aantalPaginas`, `auteur`, `isbn`, `id`) VALUES ('210', 'anton szandor lavey', '3452-4-3456-7', '9');
INSERT INTO `shopr`.`game` (`enumGameGenre`, `minLeeftijd`, `uitgever`, `id`) VALUES ('FPS', '18', 'activision', '2');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'ghost', '1');
INSERT INTO `shopr`.`fictie` (`genre`, `korteInhoud`, `id`) VALUES ('FANTASY', 'zombies', '3');
INSERT INTO `shopr`.`nonfictie` (`enumNonFictieGenre`, `id`) VALUES ('WETENSCHAP', '4');
INSERT INTO `shopr`.`lp` (`enumMuziekGenre`, `uitvoerder`, `id`) VALUES ('METAL', 'behemoth', '8');
INSERT INTO `shopr`.`nonfictie` (`enumNonFictieGenre`, `id`) VALUES ('RELIGIE', '9');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('2', 'boring', '1', '1', '10');
UPDATE `shopr`.`beoordeling` SET `onschrijving` = 'great', `score` = '5', `artikel_id` = '1' WHERE (`id` = '1');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('3', 'average', '3', '1');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('4', 'great ++', '5', '1');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('10', 'great ++++++++++', '5', '1');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('6', '--', '1', '2');
UPDATE `shopr`.`beoordeling` SET `onschrijving` = 'great', `score` = '5', `artikel_id` = '5' WHERE (`id` = '2');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('7', '-----', '3', '2');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('8', '---', '5', '2');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('10', 'fsdfsdfsdf', '1', '3');
UPDATE `shopr`.`beoordeling` SET `onschrijving` = 'great', `score` = '5', `artikel_id` = '9' WHERE (`id` = '3');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('11', 'sdfsdfsdfsdfsdfd', '3', '3');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('12', '-dsfsdfsdfsdfsdf', '5', '3');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('13', 'fsdfsdfsdf', '1', '9');
UPDATE `shopr`.`beoordeling` SET `onschrijving` = 'great', `score` = '5', `artikel_id` = '9' WHERE (`id` = '3');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('14', 'sdfsdfsdfsdfsdfd', '4', '9');
INSERT INTO `shopr`.`beoordeling` (`id`, `onschrijving`, `score`, `artikel_id`) VALUES ('15', '-dsfsdfsdfsdfsdf', '1', '9');

UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '2');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '3');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '4');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '6');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '7');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '8');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '10');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '11');
UPDATE `shopr`.`beoordeling` SET `user_id` = '11' WHERE (`id` = '12');
INSERT INTO `shopr`.`beoordeling` (`user_id`) VALUES ('');

UPDATE `shopr`.`beoordeling` SET `user_id` = '12' WHERE (`id` = '13');
UPDATE `shopr`.`beoordeling` SET `user_id` = '12' WHERE (`id` = '14');
UPDATE `shopr`.`beoordeling` SET `user_id` = '12' WHERE (`id` = '15');
INSERT INTO `shopr`.`beoordeling` (`user_id`) VALUES ('');










