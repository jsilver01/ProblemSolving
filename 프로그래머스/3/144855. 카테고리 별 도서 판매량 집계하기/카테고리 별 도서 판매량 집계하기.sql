-- 코드를 입력하세요
select a.category, sum(b.sales) as total_sales
from book a
left join book_sales b
on a.book_id = b.book_id
where b.SALES_DATE between to_date('2022-01-01', 'yyyy-mm-dd') and to_date('2022-01-31', 'yyyy-mm-dd')
group by a.category
order by a.category asc;