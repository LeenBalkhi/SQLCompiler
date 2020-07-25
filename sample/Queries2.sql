create table songs(initials String,track_id String, artist_name String, title String, loudness Number, tempo Number, time_signature Number, key Number,mode Number,duration Number, year Number) type = csv, path= "sample\\songs.csv"

create type region( String name);
create type country( Double id,  String name, region region);
create type city( Double id,  String name, country country);

create table clubs (id Number,name String, city city) type=json, path="sample\\clubs.json";
create table countries(id Number, name String, code String, post_code String, region String) type=json , path= "sample\\countries.json";

create aggregation function count("Agg\\src\\CommonAggregations.jar","CommonAggregations","count",number,[number]);
create aggregation function avg("Agg\\src\\CommonAggregations.jar","CommonAggregations","avg",number,[number]);
create aggregation function max("Agg\\src\\CommonAggregations.jar","CommonAggregations","max",number,[number]);
create aggregation function stdev("Agg\\src\\CommonAggregations.jar","CommonAggregations","stdev",number,[number]);

-------------------
-- 1.
fn()
{
    var c = select * from countries where id <= 2;
    print(c);
}
-------------------
-- 2.
fn()
{
    var c = select * from countries where code like 'E';
    print(c);
}
-------------------
-- 3.
fn()
{
    var c = select max(id) as id from countries where region like 'Asia' or city.country.region like 'Africa';
    print(c);
}
-------------------
-- 4.
fn()
{
    var c = select max(id) from clubs where city.country.region in ('Asia','Africa');
    print(c);
}
 -------------------
-- 5.
fn()
{
    var c = select max(time_signature) as max_time , avg(duration) as average from songs where year < 2000 and year != 0;
    print(c);
}
----------------------

-- 6
fn()
{
    var cl = select count(*), avg(duration) from songs inner join countries on songs.key = countries.id;
    print(cl);
}
------------------
-- 7
fn()
{
    var in_q = select time_signature from songs where key < 5;
    var cl = select count(*) cnt,avg(profitability) avg_ from clubs inner join in_q on in_q.time_signature = clubs.id;
    print(cl);
}
------------------
-- 7
fn()
{
    var cl = select count(*) cnt,avg(profitability) avg_ from clubs inner join (select time_signature from songs where key < 5) in_q on in_q.time_signature = clubs.id;print(cl);
    print(cl);
}
------------------
-- 8
fn()
{
    var cl = select initials, year, count(duration) from songs where loudness < -5 group by initials, year having count(duration)>3;
    print(cl); 
}
------------------
------------------
-- 9
fn()
{
    var cl = select initials, year, count(duration) from songs where loudness < -5 group by initials, year having count(duration)>3;
    print (cl);
    var q = select  key,max(time_signature),stddev(tempo) from songs inner join cl on cl.year = movies.year and cl.initials = songs.initials group by key;
    print(q);
}
------------------
-- 10
fn()
{
    var cl = select initials, year, count(duration) from songs where loudness < -5 group by initials, year having count(duration)>3;
    print (cl);
    var q = select  year,sum(profitability) from songs inner join cl on cl.initials = cl.initial and cl.year = songs.year where songs.title like 'The' group by year;
    print(q);
}

