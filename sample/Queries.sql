create table movies(name String,genre String,lead_studio String, audience_score Number,profitability Number, rotten_tomato Number,worldwide_gross Number,year Number) type=csv, path ="sample\\movies.csv"

create table colors(id number, color string, value string) type='json' , path= 'colors.json';

create aggregation_function count("<your jar path>","<your className>","<your methodName>",number,[number]);
create aggregation_function avg("<your jar path>","<your className>","<your methodName>",number,[number]);

create type address(Country String, City String);

create table Faculties (id Number,name String, Address Address) type= json, path="sample\\Uni.json"

-------------------
-- 1.
fn()
{
    var cl = select * from colors where id > 3;
    print(cl);
}
------------------
-- 2.
fn()
{
    var cl = select count(*) cnt from colors where id <= 3;
    print(cl);
}
------------------
-- 3
fn()
{
    var cl = select count(*) cnt,avg(profitability) avg_ from movies where year in (2008,2010);
    print(cl);
}
------------------
-- 4
fn()
{
    var cl = select count(*) cnt,avg(profitability) avg_ from movies where year = 2008 or  year =2010;
    print(cl);
}
------------------
-- 5
fn()
{
    var cl = select name from Faculties where Address.Country like 'S';
    print(cl);
}
------------------
-- 6
fn()
{
    var cl = select colors.color from movies right join colors where movies.year = colors.id where movies.genre ='Drama';
    print(cl);
}
------------------
-- 7
fn()
{
    var in_q = select year from movies where year < 2008;
    var cl = select count(*) cnt,avg(profitability) avg_ from movies inner join in_q on in_q.year = movies.in_q;
    print(cl);
}
------------------
-- 8
fn()
{
    val cl = select year, avg(profitability) from movies where worldwide_gross >=43.04 group by year having avg(worldwide_gross)>100;
    print(cl);
}
------------------
------------------
-- 9
fn()
{
    val cl = select year, avg(profitability) avg_ from movies where worldwide_gross >=314.70  group by year having avg(worldwide_gross)>600;
    print (cl);
    var q = select  genre,sum(profitability) from movies inner join cl on cl.year = movies.year group by genre;
    print(q);
}
------------------
-- 10
fn()
{
    val cl = select year, avg(profitability) avg_ from movies where worldwide_gross >=314.70  group by year having avg(worldwide_gross)>600;
    print (cl);
    var q = select  genre,sum(profitability) from movies inner join cl on cl.year = movies.year where movies.name like 'The' group by genre;
    print(q);
}

