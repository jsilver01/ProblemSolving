-- 코드를 입력하세요
SELECT a.animal_id, a.name
FROM animal_ins a
JOIN animal_outs b
on b.animal_id = a.animal_id
where b.datetime <= a.datetime 
order by a.datetime asc;