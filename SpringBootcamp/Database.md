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
Used to deal with the rights, permissions, and other controls of the database system.  
**GRANT**  
Used to give users access privileges to the database.  
```sql
GRANT privilege_name
ON object_name
TO {user_name |PUBLIC |role_name}
[WITH GRANT OPTION];

GRANT SELECT ON employee TO user_admin;
````
**REVOKE**  
Used to withdraw the user’s access privileges given by using the GRANT command.  
```sql
REVOKE privilege_name
ON object_name
FROM {user_name |PUBLIC |role_name};

REVOKE SELECT ON employee FROM user1;
````
### TCL (Transaction Control Language) Commands
**COMMIT**  
Used to commit a transaction manually.  
```sql
COMMIT;
````
**ROLLBACK**  
Used to rollback a transaction in case of any error occurs.  
```sql
ROLLBACK TO SAVEPOINT_NAME;
````
**SAVEPOINT**  
Sets a savepoint within a transaction.  
```sql
SAVEPOINT SAVEPOINT_NAME;
````
**SET TRANSACTION** 
Specify the characteristics for the transaction.  
```sql
SET TRANSACTION READ ONLY;
````
**SET CONSTRAINT**  
The SET CONSTRAINT statement defines, for the current transaction, whether a deferrable constraint is checked after each DML statement or when the transaction is finally committed.  
```sql
SET CONSTRAINT {constraint_name[, ...] | ALL} {DEFERRED | IMMEDIATE};

SET CONSTRAINT ALL IMMEDIATE;
````
**Cross-Origin Resource Sharing (CORS)**  
**Richardson Maturity Model**  
**TestRestTemplate**  
**MessageBroker**  
**Kafka vs RabbitMQ**  
Kafka is ideal for big data use cases that require the best throughput, while RabbitMQ is ideal for low latency message delivery, guarantees on a per-message basis, and complex routing.  

**References**:
https://www.geeksforgeeks.org/sql-ddl-dql-dml-dcl-tcl-commands/
