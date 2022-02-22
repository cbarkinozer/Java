# Database  
## SQL Commands

![image](https://user-images.githubusercontent.com/43732258/154796297-0041aede-0b3d-435c-b35a-3db249e4ca21.png)  

SQL commands are mainly categorized into five categories: DDL, DQL, DML, DCL, TCL.  
### DDL (Data Definition Language) Commands  
Consists of the SQL commands that can be used to define the database schema.  
**CREATE**
Used to create the database or its objects (like table, index, function, views, store procedure, and triggers).  
Note: 
Database names should not exceed 30 characters.  
Design your database in such a way that you can understand its working principles just by looking at the database.  
```sql
Create table COUNTRY(ID BIGINT, NAME VARCHAR(50));

CREATE TABLE CITY(ID BIGINT,
 NAME VARCHAR(50) NOT NULL,
 PLATE VARCHAR(2) NOT NULL,
COUNTRY_ID BIGINT NOT NULL,
PRIMARY KEY(ID));
```
**DROP**  
Used to delete an existing table in a database. 
```sql
DROP TABLE COUNTRY;
```
**ALTER**  
Used to add, delete, or modify columns in an existing table.  
```sql
ALTER TABLE Customers
ADD Email varchar(255);

ALTER TABLE Customers
DROP COLUMN Email;

ALTER TABLE CITY MODIFY COLUMN PLATE TYPE BIGINT USING PLATE::BIGINT;--POSTGRESQL

ALTER TABLE CITY MODFIY COLUMN PLATE NUMER(19); --ORACLE

```
**TRUNCATE**  
Used to remove all records from a table, but not the table itself.  
```sql
TRUNCATE TABLE CITY;
```
**COMMENT**  
Used to add comments to the data dictionary.
```sql
--Comment
```
**RENAME**  
Used to rename an object existing in the database.  
```sql
ALTER TABLE CITY RENAME CTY_CITY; 
```
### DQL (Data Query Language) Commands 
Used for performing queries on the data within schema objects.  
**SELECT**  
Used to retrieve data from the database.  
```sql
SELECT * FROM COUNTRY;
Select * from CITY;
```
### DML (Data Manipulation Language) Commands
Used to manipulate data present in the database.  
**INSERT**  
Used to insert data into a table.  
```sql
INSERT INTO CITY (NAME,PLATE,COUNTRY)
VALUES ('Adana',01,'Turkey');
````
**UPDATE**  
Used to update existing data within a table.  
```sql
UPDATE CITY
SET COUNTRY='TR'
WHERE PLATE=01;
````
**DELETE**  
Used to delete records from a database table.  
```sql
DELETE FROM CITY
WHERE PLATE=01;
````
**LOCK**
Used to control table concurrency.  
```sql
LOCK [TABLE] [ONLY] table_name [IN lock_mode MODE] [NOWAIT];
LOCK TABLE CITY IN SHARE ROW EXCLUSIVE MODE;
````
**CALL**  
Used to call a PL/SQL or JAVA subprogram.  
```sql
VARIABLE x VARCHAR2(25);
CALL warehouse_type(456, 'Warehouse 456', 2236).ret_name()
   INTO :x;
PRINT x;
X --456
````
**EXPLAIN CALL**  
 Provides a description of how the SQL queries are executed by the databases  
```sql
EXPLAIN (Select * from CITY); 
````

### DCL (Data Control Language) Commands  

**GRANT**  
```sql
````
**REVOKE**  
```sql
````
### TCL (Transaction Control Language) Commands
**COMMIT**  
```sql
````
**SAVEPOINT**  
```sql
````
**ROLLBACK**  
```sql
````
**SET TRANSACTION**  
```sql
````
**SET CONSTRAINT**  
```sql
````


 


**References**:
https://www.geeksforgeeks.org/sql-ddl-dql-dml-dcl-tcl-commands/
