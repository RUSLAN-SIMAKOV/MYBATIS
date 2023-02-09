CREATE SCHEMA IF NOT EXISTS USERS;
CREATE TABLE IF NOT EXISTS USERS(id BIGINT AUTO_INCREMENT, name VARCHAR(50) NOT NULL);
set @a=scope_identity();
select @a := scope_identity();

INSERT INTO USERS(id, name) VALUES (1, 'Ramesh');
INSERT INTO USERS(id, name) VALUES (2, 'Khilan');
INSERT INTO USERS(id, name) VALUES (3, 'kaushik');
INSERT INTO USERS(id, name) VALUES (4, 'Chaitali');
INSERT INTO USERS(id, name) VALUES (5, 'Hardik');
INSERT INTO USERS(id, name) VALUES (6, 'Komal');
INSERT INTO USERS(id, name) VALUES (7, 'Muffy');