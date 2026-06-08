-- -- 코드를 입력하세요
SELECT animal_id, name
from animal_outs o
WHERE NOT EXISTS (
    SELECT 1
    FROM animal_ins i
    WHERE i.animal_id = o.animal_id
)
order by animal_id;
