desc Expense_Record;
desc Income_Record;
select * from Expense_Record;
select * from Income_Record;
drop database user_data;
create database user_data;
use user_data;
create table Expense_Record(
	id int auto_increment primary key,
    amount float(10) NOT NULL ,
    payee VARCHAR(50) NOT NULL,
    category VARCHAR(20) NOT NULL,
    payment_method VARCHAR(20) NOT NULL,
    payment_status VARCHAR(20) NOT NULL,
    payment_description VARCHAR(50) NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
create table Income_Record(
	id int auto_increment primary key,
    amount float(10) NOT NULL ,
    payer VARCHAR(50) NOT NULL,
    category VARCHAR(20) NOT NULL,
    payment_method VARCHAR(20) NOT NULL,
    payment_status VARCHAR(20) NOT NULL,
    payment_description VARCHAR(50) NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);