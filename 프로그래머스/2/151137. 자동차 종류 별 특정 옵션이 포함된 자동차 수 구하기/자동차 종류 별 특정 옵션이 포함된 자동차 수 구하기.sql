-- 코드를 입력하세요
SELECT car_type, count(*) as cars
from car_rental_company_car
where instr(options,'통풍시트') > 0 or instr(options,'열선시트') > 0 or instr(options,'가죽시트') > 0 
group by car_type
order by car_type;