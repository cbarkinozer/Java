# Database  
## SQL Commands

![image](https://user-images.githubusercontent.com/43732258/154796297-0041aede-0b3d-435c-b35a-3db249e4ca21.png)  

SQL commands are mainly categorized into five categories: DDL, DQL, DML, DCL, TCL.  
### DDL (Data Definition Language) Commands  
Consists of the SQL commands that can be used to define the database schema.  
**CREATE**
Used to create the database or its objects (like table, index, function, views, store procedure, and triggers).  
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

**SELECT**  
Used to retrieve data from the database.  
```sql
SELECT * FROM COUNTRY;
Select * from CITY;
```
### DML (Data Manipulation Language) Commands
**INSERT**  
**UPDATE**  
**DELETE**  
**CALL**  
**EXPLAIN CALL**  
**LOCK**  
### DCL (Data Control Language) Commands  
**GRANT**  
**REVOKE**  
### TCL (Transaction Control Language) Commands
**COMMIT**  
**SAVEPOINT**  
**ROLLBACK**  
**SET TRANSACTION**  
**SET CONSTRAINT**  






You need to understand the working principles just by looking at the database.  
Database names should not exceed 30 characters.  


**References**:
https://www.geeksforgeeks.org/sql-ddl-dql-dml-dcl-tcl-commands/
