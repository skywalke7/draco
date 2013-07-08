/* script to create database tables */
CREATE TABLE GROUPS(
group_id integer(4) auto_increment primary key,
group_name varchar(50) not null,
group_description varchar(500) not null,
group_web varchar(150) not null
);
CREATE TABLE ALBUMS(
album_id int auto_increment primary key,
album_name varchar(50) not null,
album_date date default null,
group_web varchar(150) not null,
group_id int not null,
CONSTRAINT FK_GROUP FOREIGN KEY(group_id) REFERENCES GROUPS(group_id)
);

/* script to insertion */

INSERT INTO GROUPS VALUES(NULL,'Muse','Muse are an alternative rock band from Teignmouth, England, United Kingdom. The band consists of Matthew Bellamy on lead vocals, piano, keyboard and guitar, Chris Wolstenholme on backing vocals and bass guitar, and Dominic Howard on drums and percussion.','www.muse.com');
INSERT INTO GROUPS VALUES(NULL,'Daft Punk','Daft Punk is a multi Grammy Award-winning electronic music duo formed in 1994 in Paris, France, and consisting of French musicians Thomas Bangalter (born 3 January 1975) and Guy-Manuel de Homem-Christo (born 8 February 1974). The band is considered one of the most successful electronic music collaborations of all time, both in album sales and in critical acclaim. ','www.daftpunk.com');
INSERT INTO GROUPS VALUES(NULL,'Salon Victoria','La historia de Salón Victoria esta llena de logros y triunfos. La banda se formó en 1996 en la Ciudad de México. Salón Victoria se ha vuelto una de las bandas más importantes del género de Ska latino. El Salón Victoria ha grabado oficialmente tres CD´s: “Locos y Rucas en Retro” (Opción Sónica, 1999), “Popis Hits los Golpes de Yeye” (Opción Sónica, 2001) y “Secundario del 73” (Sony Music, 2003). ','www.salonvictoria.com');
INSERT INTO GROUPS VALUES(NULL,'Panteon rococo','Panteón Rococó is a mexican Latin-ska band formed in Mexico City, Mexico in 1995. Despite flourishing black markets, they sold thousands of records. While being stars in Mexico, they’ve been touring Europe the last three years in a row, especially Germany, where their European Label Übersee Records is located.','www.panteonrococo.com');
INSERT INTO ALBUMS VALUES(NULL,'The 2nd law','2012-01-27','www.muse.com',1);
INSERT INTO ALBUMS VALUES(NULL,'Discovery','2000-07-09','www.daftpunk.com',2);
INSERT INTO ALBUMS VALUES(NULL,'Secundaria del 73','1988-05-20','www.salonvictoria.com',3);
INSERT INTO ALBUMS VALUES(NULL,'Compañeros musicales','1988-04-12','www.panteonrococo.com',4);


