--Suppression des tables

drop table atcm_achats;

-- creation des table

create table atcm_achats (
atcm_achatid integer,
atcm_code varchar(25),
atcm_article varchar(25),
atcm_quantite integer
primary key (atcm_achatid)
);

-- ajout des contraintes


-- Jeux de donnees

insert into atcm_achats values (0,'ART001','TRANSISTOR',25);
insert into atcm_achats values (1,'ART002','DIODE',20);
insert into atcm_achats values (2,'ART003','CAPACITE',5);
insert into atcm_achats values (3,'ART004','RESISTANCE',50);

