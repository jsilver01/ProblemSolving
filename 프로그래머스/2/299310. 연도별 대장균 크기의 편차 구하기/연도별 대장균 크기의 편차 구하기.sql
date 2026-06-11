-- 코드를 작성해주세요
select Year(differentiation_date) as year, (select max(size_of_colony) from ecoli_data where year(differentiation_date) = year) - size_of_colony as year_dev, id
from ecoli_data
ORDER BY YEAR, YEAR_DEV;