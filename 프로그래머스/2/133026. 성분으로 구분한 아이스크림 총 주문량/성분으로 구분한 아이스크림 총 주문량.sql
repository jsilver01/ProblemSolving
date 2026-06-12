-- 코드를 입력하세요
SELECT icecream_info.ingredient_type, sum(total_order) as total_order
from first_half, icecream_info
where first_half.flavor = icecream_info.flavor
group by icecream_info.ingredient_type;