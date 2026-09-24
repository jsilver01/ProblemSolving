-- 코드를 입력하세요
SELECT a.name, a.datetime
from animal_ins a
where not exists (select 1 from animal_outs b where b.animal_id = a.animal_id)
order by a.datetime
fetch first 3 row only;