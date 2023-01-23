-- DDL is written for a MySQL database 
create schema hrf_jns_demo;

use hrf_jns_demo;

-- Quick & dirty table with the order information. State abbreviations will be restricted on the front with a dropdown for this project, but in a real project would likely be handled with another database table 
-- or the implementation of something like an open source address retrieval package in the front end. ZIP is give 10 chars in case the user wants to enter extended form, e.g. '85252-1234'.
-- In a real project I would normalize this into several tables - state, customer, ordr, etc - but this is a low key quick demo project.

-- Since 'order' is a reserved keyword, the table is called orderrec as in 'order received' in order to prevent confusion and still adhere to the spirit of the instruction to save it as an 'order'. 
create table orderrec (ordr_id int not null auto_increment, first_name varchar(255) not null, last_name varchar(255) not null, grade varchar(2) not null, address_1 varchar(255) not null, address_2 varchar(255),
 city varchar(255) not null, state varchar(2) not null, zip varchar(10)not null, primary key (ordr_id));