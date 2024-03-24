select * from roles;
select * from user_role
select * from users

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

DELETE FROM user_role
WHERE USER_ID = 3;

DELETE FROM users
WHERE id = 3;