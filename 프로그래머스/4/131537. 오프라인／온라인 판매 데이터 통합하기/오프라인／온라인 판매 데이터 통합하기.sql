-- 코드를 입력하세요
SELECT to_char(sales_date,'yyyy-mm-dd') as sales_date, product_id, user_id, sales_amount
from ONLINE_SALE
where to_char(sales_date,'yyyy-mm')='2022-03'

Union all

select to_char(sales_date,'yyyy-mm-dd') as sales_date, product_id, null as user_id,  sales_amount
from offline_sale
where to_char(sales_date,'yyyy-mm')='2022-03'

order by sales_date asc, product_id asc, user_id asc;