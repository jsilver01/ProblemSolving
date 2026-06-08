-- 코드를 입력하세요
SELECT product_code, sum(price*sales_amount) as sales
from product p, offline_sale o
where p.product_id = o.product_id
group by product_code
order by sales desc, product_code asc;