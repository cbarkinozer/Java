*Patika.dev sitesinde PostgreSql sql soruları cevaplarım.<br />*

**Ödev 1<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek Postgresql veri tabanı üzerinden gerçekleştiriniz.<br />
1_Film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.<br />
```sql
Select title,description from film;
```
2_Film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.<br />
```sql
Select * from film where length > 60 and length<75;
```
3_Film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.<br />
```sql
Select * from film where rental_rate= 0.99 and  replacement_cost= 12.99 or replacement_cost= 28.99; 
```
4_Customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?<br />
```sql
Select last_name from customer where first_name='Mary';
>>>Smith
```
5_Film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.<br />
```sql
Select * from film where length<=50 and rental_rate!=2.99 or rental_rate!=4.99; 
```
veya
```sql
Select * from film where length<=50 and not rental_rate=2.99 or not rental_rate=4.99; 
```

**Ödev 2<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_Film tablosunda bulunan tüm sütunlardaki verileri replacement cost değeri 12.99 dan büyük eşit ve 16.99 küçük olma koşuluyla sıralayınız ( BETWEEN - AND yapısını kullanınız.)<br />
```sql
SELECT * FROM film WHERE replacement_cost>=12.99 AND replacement_cost<16.99;
```
2_ Actor tablosunda bulunan first_name ve last_name sütunlardaki verileri first_name 'Penelope' veya 'Nick' veya 'Ed' değerleri olması koşuluyla sıralayınız. ( IN operatörünü kullanınız.)<br />
```sql
SELECT first_name,last_name FROM actor WHERE first_name IN('Penelope','Nick','Ed');
```
3_ Film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99, 2.99, 4.99 VE replacement_cost 12.99, 15.99, 28.99 olma koşullarıyla sıralayınız.<br />
(IN operatörünü kullanınız.)
```sql
SELECT * FROM film WHERE rental_rate IN (0.99,2.99,4.99) AND replacement_cost IN (12.99,15.99,28.99);
```


**Ödev 3<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_Country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.<br />
```sql
SELECT country FROM country WHERE country LIKE 'A%a';
```
2_ Country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.<br />
```sql
 SELECT country FROM country WHERE country LIKE '_____%n';
```
3_ Film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren verileri sıralayın.<br />
```sql
SELECT title FROM film WHERE title ILIKE '%t%t%t%t%';
```
4_Film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99
olan verileri sıralayınız.<br />
```sql
SELECT * FROM film WHERE title LIKE 'C%' AND length>90 AND rental_rate=2.99;
```

**Ödev 4<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_Film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.<br />
```sql
SELECT DISTINCT replacement_cost FROM film;
```
2_ Film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?.<br />
```sql
SELECT COUNT(DISTINCT replacement_cost) FROM film;
>>>21
```
3_ Film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?.<br />
```sql
SELECT title FROM film where rating='G' AND title LIKE 'T%';
>>>9
```
4_Country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?.<br />
```sql
SELECT COUNT(country) FROM country where country LIKE '_____';
>>>13
```
5_City tablosundaki şehir isimlerinin kaçtanesi 'R' veya r karakteri ile biter?.<br />
```sql
SELECT COUNT(city) FROM city where city ILIKE '%r';
>>>33
```

**Ödev 5<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız..<br />
```sql
SELECT title FROM film WHERE title LIKE '%n' ORDER BY length DESC LIMIT 5;
```
2_ film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci 5 filmi sıralayınız.<br />
```sql
SELECT title FROM film WHERE title LIKE '%n' ORDER BY length DESC OFFSET 5 LIMIT 5;
```
3_ customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız..<br />
```sql
SELECT * FROM customer WHERE store_id= 1 ORDER BY last_name DESC LIMIT 4;
```

**Ödev 6<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?<br />
```sql
SELECT AVG(rental_rate) FROM film;
>>>2.9800000000000000
```
2_ film tablosunda bulunan filmlerden kaçtanesi 'C' karekteri ile başlar?.<br />
```sql
SELECT COUNT(title) FROM film WHERE title LIKE 'C%';
>>>92
```
3_ film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?.<br />
```sql
SELECT MAX(length) FROM film WHERE rental_rate=0.99;
>>>184
```
4_ film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?.<br />
```sql
SELECT COUNT( DISTINCT replacement_cost )FROM film WHERE length > 150;
>>>21
```
**Ödev 7<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.<br />
```sql
SELECT rating FROM film GROUP BY rating ;
```
2_ film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.<br />
```sql
SELECT replacement_cost,COUNT(*) FROM film GROUP BY replacement_cost HAVING COUNT(*)>50 ;
```
3_ customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?.<br />
```sql

SELECT store_id,COUNT(customer) FROM customer GROUP BY store_id ;
```
4_ city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız <br/>
```sql
SELECT country_id,COUNT(city) FROM city GROUP BY country_id ORDER BY COUNT(*) DESC LIMIT 1;
```

**Ödev 8<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım..<br />
```sql
CREATE TABLE employee(
id SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
birthday DATE,
email VARCHAR(100)
);
```
2_Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim<br />
```sql
insert into employee (id, name, birthday, email) values (1, 'Jeddy', '2016-11-29', 'jcarncross0@stumbleupon.com');
insert into employee (id, name, birthday, email) values (2, 'Charmane', '2018-04-16', 'cgallone1@friendfeed.com');
insert into employee (id, name, birthday, email) values (3, 'Meg', '1945-03-07', 'mcarluccio2@blogs.com');
insert into employee (id, name, birthday, email) values (4, 'Emmey', '1980-03-24', 'emaccaddie3@dell.com');
insert into employee (id, name, birthday, email) values (5, 'Kaia', '1958-07-18', 'klivesey4@pen.io');
insert into employee (id, name, birthday, email) values (6, 'Sonnie', '2004-01-09', 'seeles5@bravesites.com');
insert into employee (id, name, birthday, email) values (7, 'Abbot', '1913-10-14', 'aweeds6@yandex.ru');
insert into employee (id, name, birthday, email) values (8, 'Rahal', '1997-11-29', 'rgockeler7@vkontakte.ru');
insert into employee (id, name, birthday, email) values (9, 'Elle', '1940-07-25', null);
insert into employee (id, name, birthday, email) values (10, 'Leodora', '2003-06-14', null);
insert into employee (id, name, birthday, email) values (11, 'Udell', null, 'umacgibbona@time.com');
insert into employee (id, name, birthday, email) values (12, 'Leticia', null, 'lhostenb@feedburner.com');
insert into employee (id, name, birthday, email) values (13, 'Rolland', '2020-05-29', null);
insert into employee (id, name, birthday, email) values (14, 'Zora', '2009-03-04', null);
insert into employee (id, name, birthday, email) values (15, 'Andriana', '1954-02-21', 'atolchardee@purevolume.com');
insert into employee (id, name, birthday, email) values (16, 'Aubert', '1942-12-23', 'akamenaf@woothemes.com');
insert into employee (id, name, birthday, email) values (17, 'Mikol', null, 'mgrisedaleg@admin.ch');
insert into employee (id, name, birthday, email) values (18, 'Kirk', '1910-01-13', 'kmcilmorieh@sitemeter.com');
insert into employee (id, name, birthday, email) values (19, 'Margeaux', '1999-06-09', 'mwebeni@imdb.com');
insert into employee (id, name, birthday, email) values (20, 'Katerine', '2017-01-23', 'kmackettrickj@theatlantic.com');
insert into employee (id, name, birthday, email) values (21, 'Winnifred', '1917-02-01', 'wlambournek@t.co');
insert into employee (id, name, birthday, email) values (22, 'Rozanna', '1936-06-22', 'rstubbleyl@sourceforge.net');
insert into employee (id, name, birthday, email) values (23, 'Priscilla', null, 'pbyromm@ning.com');
insert into employee (id, name, birthday, email) values (24, 'Chucho', '1961-05-20', 'cshippeyn@multiply.com');
insert into employee (id, name, birthday, email) values (25, 'Sue', '1904-02-12', null);
insert into employee (id, name, birthday, email) values (26, 'Deborah', '1913-08-30', 'dvaseninp@macromedia.com');
insert into employee (id, name, birthday, email) values (27, 'Tarrah', '1941-05-05', 'tdipietroq@etsy.com');
insert into employee (id, name, birthday, email) values (28, 'Talbot', '2002-08-08', null);
insert into employee (id, name, birthday, email) values (29, 'Merna', '1970-05-03', null);
insert into employee (id, name, birthday, email) values (30, 'Elna', null, 'espeaket@hugedomains.com');
insert into employee (id, name, birthday, email) values (31, 'Deidre', '1988-05-19', 'dendleu@google.cn');
insert into employee (id, name, birthday, email) values (32, 'Emile', '2009-09-12', 'erosemanv@opensource.org');
insert into employee (id, name, birthday, email) values (33, 'Trefor', null, 'tlappinw@behance.net');
insert into employee (id, name, birthday, email) values (34, 'Donica', '1923-10-11', null);
insert into employee (id, name, birthday, email) values (35, 'Christin', '1932-09-01', 'cmattesseny@github.com');
insert into employee (id, name, birthday, email) values (36, 'Jamima', '1975-07-28', null);
insert into employee (id, name, birthday, email) values (37, 'Mozelle', null, 'mkittiman10@wp.com');
insert into employee (id, name, birthday, email) values (38, 'Heriberto', '1985-04-24', 'hwinscomb11@about.com');
insert into employee (id, name, birthday, email) values (39, 'Leyla', '1966-10-02', null);
insert into employee (id, name, birthday, email) values (40, 'Blondie', '1964-04-21', null);
insert into employee (id, name, birthday, email) values (41, 'Lana', null, 'llemaitre14@apache.org');
insert into employee (id, name, birthday, email) values (42, 'Devin', '1991-07-20', 'dkestell15@imdb.com');
insert into employee (id, name, birthday, email) values (43, 'Darda', '1942-08-11', 'dblandamere16@mayoclinic.com');
insert into employee (id, name, birthday, email) values (44, 'Guinna', '1954-04-02', 'gmcneil17@adobe.com');
insert into employee (id, name, birthday, email) values (45, 'Eda', null, null);
insert into employee (id, name, birthday, email) values (46, 'Marshal', '1990-11-10', 'mbradbeer19@reverbnation.com');
insert into employee (id, name, birthday, email) values (47, 'Halsey', '1963-09-23', 'hportinari1a@cisco.com');
insert into employee (id, name, birthday, email) values (48, 'Charlena', '1914-02-12', null);
insert into employee (id, name, birthday, email) values (49, 'Gerda', '1986-08-25', 'gabbate1c@barnesandnoble.com');
insert into employee (id, name, birthday, email) values (50, 'Paolina', '2011-05-09', 'pworral1d@icio.us');
```
3_ Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım..<br />
```sql
UPDATE employee
SET name = 'Mayak'
WHERE id = 1;

UPDATE employee
SET name = 'Kayak'
WHERE id = 2;

UPDATE employee
SET name = 'Dayak'
WHERE id = 3;

UPDATE employee
SET name = 'Bayak'
WHERE id = 4;

UPDATE employee
SET name = 'Sayak'
WHERE id = 5;
```
4_ Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.<br/>
```sql
DELETE FROM employee
WHERE id IN (6,7,8,9,10);
```

**Ödev 9<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_City tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.<br />
```sql
SELECT city.city,country.country FROM country INNER JOIN city ON city.country_id=country.country_id;
```
2_ Customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
INNER JOIN sorgusunu yazınız.<br />
```sql
SELECT customer.first_name, customer.last_name,payment_id FROM payment
INNER JOIN customer ON customer.customer_id=payment.customer_id;
```
3_ Customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
INNER JOIN sorgusunu yazınız.<br />
```sql
SELECT customer.first_name, customer.last_name,rental.rental_id FROM customer
INNER JOIN rental ON rental.customer_id=customer.customer_id;
```

**Ödev 10<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız..<br />
```sql
SELECT city,country FROM country
LEFT JOIN city ON city.country_id=country.country_id;
```
2_ customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
RIGHT JOIN sorgusunu yazınız.<br />
```sql
SELECT customer.first_name,customer.last_name,payment.payment_id FROM customer
RIGHT JOIN payment ON payment.customer_id=customer.customer_id;
```
3_ customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
FULL JOIN sorgusunu yazınız.<br />
```sql
SELECT customer.first_name,customer.last_name,payment.payment_id FROM customer
FULL JOIN payment ON payment.customer_id=customer.customer_id;
```
**Ödev 11<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım..<br />
```sql
SELECT customer.first_name,actor.first_name FROM customer FULL JOIN actor ON actor.first_name=customer.first_name;
```
2_ actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.<br />
```sql
SELECT customer.first_name,actor.first_name FROM customer INNER JOIN actor ON actor.first_name=customer.first_name;
```
3_ actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım..<br />
```sql
SELECT customer.first_name,actor.first_name FROM customer LEFT JOIN actor ON actor.first_name=customer.first_name;
```
4_ İlk 3 sorguyu tekrar eden veriler için de yapalım.<br />
```sql
(SELECT customer.first_name FROM customer)UNION(SELECT actor.first_name FROM actor);
(SELECT customer.first_name FROM customer)INTERSECT ALL(SELECT actor.first_name FROM actor);
(SELECT customer.first_name FROM customer)EXCEPT ALL(SELECT actor.first_name FROM actor);
```
**Ödev 12<br />**
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.<br />

1_film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?.<br />
```sql
SELECT title FROM film WHERE length>(
SELECT AVG(length) FROM film
);
```
2_ film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?<br />
```sql
SELECT COUNT(title) FROM film WHERE rental_rate=(
SELECT MAX(rental_rate) FROM film
);
>>>336
```
3_ film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.<br />
```sql
(SELECT film.title FROM film WHERE rental_rate=(SELECT MIN(rental_rate)FROM film))
UNION
(SELECT film.title FROM film WHERE rental_rate=(SELECT MIN(replacement_cost)FROM film));
```
4_ payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.<br />
```sql
?
```

