create table order_Header
(
   id INT PRIMARY KEY ,
   description varchar(255) not null,
   user_name varchar(255) not null
);

create table order_Item
(
   id INT PRIMARY KEY ,
   order_Header_Id int,
   product_Id INT ,
   product_Name varchar(255) not null,
   product_Price INT,
   order_Qty int,
   foreign key (order_Header_Id) references order_Header(id)
);
