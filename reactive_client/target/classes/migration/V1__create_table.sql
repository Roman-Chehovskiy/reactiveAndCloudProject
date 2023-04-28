create table users
(
    id       serial primary key,
    username varchar(15),
    password varchar(100)
);

create table content
(
    id      serial primary key,
    id_user int,
    content varchar(30),
    foreign key (id_user) references users (id)
);

insert into users(id, username, password)
values (1, 'user', '{bcrypt}$2y$10$cAAPGHEKhlx6qkp7vziRruAK1LKCbHZsu/5Wq4auZPWgnRzMURK4a');

insert into content (id, id_user, content)
values (1, 1, 'test1'),
       (2, 1, 'test2'),
       (3, 1, 'test3');