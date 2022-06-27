-- DROP TABLE IF EXISTS public.person;

CREATE TABLE IF NOT EXISTS public.person
(
    id integer NOT NULL,
    name character varying COLLATE pg_catalog."default",
    age integer,
    CONSTRAINT person_pkey PRIMARY KEY (id)
)

select * from person

insert into person (id, name, age) values (3, 'Alex', 30)
insert into person (id, name, age) values (4, 'Aleksey', 28)
insert into person (id, name, age) values (5, 'Marina', 31)
insert into person (id, name, age) values (6, 'Angelina', 25)
insert into person (id, name, age) values (7, 'Angelina', 23)
insert into person (id, name, age) values (8, 'Oleg', 27)
insert into person (id, name, age) values (9, 'Petr', 24)
insert into person (id, name, age) values (10, 'Roman', 25)
insert into person (id, name, age) values (2, 'Alex', 30)
insert into person (id, name, age) values (2, 'Alex', 30)

delete from person where id = 7
delete from person where name = 'Angelina'

select age from person
select age, id, name from person
update person set age = 33 where id = 15
update person set name = 'Mustafa' where id = 17
-- шаблон SELECT
--select column names
--from tableName
--join tableName2 on condition
--where condition
--group by field
--having condition
--order by field
--limit number

select name, age
from person

where age > 30 and name = 'Marina'
where age between 25 and 30
order by age  -- сортировка по колонке age
;

select p.id, p.name
from person as p
join city as c on p.city_id = c.id;

