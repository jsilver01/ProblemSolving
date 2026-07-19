-- 코드를 입력하세요
select car_id, to_char(round(avg(end_date - start_date + 1),1),'FM99990.0') as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
having round(avg(end_date - start_date + 1),1) >= 7
order by round(avg(end_date - start_date + 1),1) desc, car_id desc;