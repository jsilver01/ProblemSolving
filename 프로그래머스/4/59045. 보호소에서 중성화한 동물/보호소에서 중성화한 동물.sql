-- 코드를 입력하세요
SELECT a.animal_id, a.animal_type, a.name
from animal_ins a
join animal_outs b
on b.animal_id = a.animal_id
where b.sex_upon_outcome != a.SEX_UPON_INTAKE
order by animal_id 