create database jdbc_template ;
use jdbc_template;
create table dao(
    id int primary key  auto_increment,
    name varchar(100),
    height double,
    weight double,
    birthday date,
    price double
);

insert into dao(name, height, weight, birthday, price)  value (?,?,?,?,?);
update dao set name= ? , height=? ,weight=? ,birthday=?, price = ? where id = ?;