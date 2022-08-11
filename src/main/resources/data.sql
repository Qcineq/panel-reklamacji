insert into roles(name) values('ROLE_SELLER');
insert into roles(name) values('ROLE_TECHNICIAN');

insert into users(username, password, enabled) values('seller', 'seller', 1);

insert into users_roles(user_id, roles_id) values (1, 1);
insert into users_roles(user_id, roles_id) values (1, 2);