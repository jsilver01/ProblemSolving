-- 코드를 입력하세요
SELECT board_id, writer_id, title, price, 
case status 
when 'SALE' then '판매중'
when 'RESERVED' then '예약중'
when 'DONE' then '거래완료' 
end as status
from used_goods_board
where CREATED_DATE = to_date('2022-10-05', 'yyyy-mm-dd')
order by board_id desc;