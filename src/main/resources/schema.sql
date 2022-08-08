CREATE TABLE User (
userid INT primary key,
name VARCHAR(250) NOT NULL,
email VARCHAR(250),
role VARCHAR(250)
);

CREATE TABLE Book (
bookid INT primary key, 
book_name VARCHAR(250) NOT NULL
);

CREATE TABLE Counter_Party (
counterpartyid INT primary key , 
counter_party_name  VARCHAR(250) 
);

CREATE TABLE Security (
securityid INT primary key, 
isin VARCHAR(250), 
cusip VARCHAR(250), 
isuer VARCHAR(250), 
maturity_date DATE,
coupon FLOAT, 
se_type VARCHAR(250), 
facevalue INT, 
se_status VARCHAR(25))