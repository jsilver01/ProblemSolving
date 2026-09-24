-- 코드를 입력하세요
select *
from (
SELECT a.name, a.datetime
from animal_ins a
where a.animal_id not in (select animal_id from animal_outs)
order by a.datetime)
where rownum <= 3;