-- 코드를 입력하세요
SELECT animal_id, name, to_char(datetime, 'yyyy-mm-dd') as 날짜
from animal_ins
order by animal_id;