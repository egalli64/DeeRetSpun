DROP TABLE RED_RESTAURANTS;

CREATE TABLE RED_RESTAURANTS 
(RESTOURANT_ID INTEGER PRIMARY KEY,
RESTOURANT_NAME VARCHAR2(30),
RESTOURANT_ADDRESS VARCHAR2(30),
SEATS INTEGER,
TYPE_KITCHEN VARCHAR2 (30),
FEEDBACK INTEGER,
PRICE_RANGE VARCHAR2(4));

INSERT INTO RED_RESTAURANTS
VALUES (001, 'Chinese home', 'Via Toscana 5', 30, 'Chinese', 1, '$$');
INSERT INTO RED_RESTAURANTS
VALUES (002, 'Sicily ndo cori', 'Via Sicilia 18', 50, 'Italian', 5, '$$$');
INSERT INTO RED_RESTAURANTS
VALUES (003, 'Green Irish', 'Via Dublino 86', 18, 'Irish', 4, '$$');
INSERT INTO RED_RESTAURANTS
VALUES (004, 'Japanese sushi', 'Via Tokyo 36', 40, 'Japanese', 3, '$$$');

