-- 코드를 입력하세요
SELECT b.AUTHOR_ID, b.AUTHOR_NAME, a.CATEGORY, sum(a.PRICE*c.SALES) as SALES
from book a
join author b
on a.author_id = b.author_id
join BOOK_SALES c
on a.book_id = c.book_id
where c.sales_date between DATE '2022-01-01' and DATE '2022-01-31'
group by b.author_id, b.author_name, a.category
order by b.author_id asc, a.category desc