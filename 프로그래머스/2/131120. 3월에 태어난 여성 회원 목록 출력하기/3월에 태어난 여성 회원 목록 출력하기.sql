-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth,'yyyy-mm-dd')
from member_profile
where extract(month from date_of_birth)='3' and tlno is not null and gender='W'
order by member_id asc;