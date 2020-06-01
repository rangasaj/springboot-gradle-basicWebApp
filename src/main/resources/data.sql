
CREATE TABLE IF NOT EXISTS customer (id NUMERIC(20,0), customer_name VARCHAR(50), occupation VARCHAR(255));
-- IF NOT EXISTS (SELECT * FROM customer where id=1)
 --   INSERT INTO application_user (id,customer_name, occupation) values (1,'customer name 1','Occupation - human');


insert  into customer
    select * from (
        select 1,'customer name 1','Occupation - human'
    ) x where not exists(select * from customer where id=1);