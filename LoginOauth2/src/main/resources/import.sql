INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$im/cAH50/9vJepApECQsHuRyl6hb5H.9dKqWQErxFF1PSgEP2x3Ua');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$im/cAH50/9vJepApECQsHuRyl6hb5H.9dKqWQErxFF1PSgEP2x3Ua');


INSERT INTO tb_role (authority) VALUES ('ROLE_OPERADOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_product (name) VALUES ('TV');
INSERT INTO tb_product (name) VALUES ('Computer');


select * from tb_role;
select * from tb_user;
select * from tb_user_role;