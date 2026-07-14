-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(datetime, 'HH24')) AS hour, count(*) as count
from animal_outs
where TO_NUMBER(TO_CHAR(datetime, 'HH24')) >= 9
and TO_NUMBER(TO_CHAR(datetime, 'HH24')) <= 19
group by hour
order by hour;

