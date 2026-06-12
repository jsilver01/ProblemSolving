-- 코드를 입력하세요
SELECT MCDP_CD, count(*) as "5월예약건수"
from appointment
where to_char(apnt_ymd,'yyyy-mm') = '2022-05'
group by MCDP_CD
order by "5월예약건수" , MCDP_CD;