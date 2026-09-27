-- 코드를 입력하세요
SELECT flavor
from (
    select flavor, sum(total_order) as total_order 
    from (
        select flavor, total_order
        from FIRST_HALF
        union all
        select flavor, total_order
        from JULY
        )
    group by flavor
    order by total_order desc
    )
where rownum <= 3;