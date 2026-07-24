-- 코드를 입력하세요
SELECT animal_id, name, sex_upon_intake
from animal_ins
where name = 'Lucy' 
or name = 'Ella'
or name = 'Rogan'
or name = 'Sabrina'
or name = 'Mitty'
or name ='Pickle'
order by animal_id asc;