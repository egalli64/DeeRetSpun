DROP TABLE RED_RESTAURANTS;

DROP SEQUENCE RESTAURANTS_SEQ;

CREATE SEQUENCE RESTAURANTS_SEQ;

CREATE TABLE RED_RESTAURANTS 
(RESTAURANT_ID INTEGER PRIMARY KEY,
RESTAURANT_NAME VARCHAR2(30),
RESTAURANT_ADDRESS VARCHAR2(30),
SEATS INTEGER,
TYPE_KITCHEN VARCHAR2 (30),
RESTAURANT_FEEDBACK VARCHAR2(5),
PRICE_RANGE VARCHAR2(4));

INSERT INTO RED_RESTAURANTS
VALUES (001, 'Chinese home', 'Via Toscana 5', 30, 'Chinese', '*', '$$');

INSERT INTO RED_RESTAURANTS
VALUES (002, 'Sicily ndo cori', 'Via Sicilia 18', 50, 'Italian', '*****', '$$$');

INSERT INTO RED_RESTAURANTS
VALUES (003, 'Green Irish', 'Via Dublino 86', 18, 'Irish', '***', '$$');

INSERT INTO RED_RESTAURANTS
VALUES (004, 'Japanese sushi', 'Via Tokyo 36', 40, 'Japanese', '****', '$$$');

DROP TABLE RED_USERS;

DROP SEQUENCE USERS_SEQ;

CREATE SEQUENCE USERS_SEQ;

CREATE TABLE RED_USERS
(USER_ID INTEGER PRIMARY KEY,
FIRST_NAME VARCHAR2(30),
LAST_NAME VARCHAR2(30),
RELIABILITY VARCHAR2(5),
REVIEWS INTEGER);

INSERT INTO RED_USERS 
VALUES (001, 'Giuseppe', 'Adamo', '**', 1);

INSERT INTO RED_USERS 
VALUES (002, 'Lorenzo', 'Barsocchi', '***', 3);

INSERT INTO RED_USERS 
VALUES (003, 'Stefano', 'Farati', '***', 5);

INSERT INTO RED_USERS 
VALUES (004, 'Charles', 'Dorian', '****', 7);














