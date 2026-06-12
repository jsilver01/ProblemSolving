-- 코드를 작성해주세요
select fish_info.id, re.fish_name, fish_info.length
from (
    select fish_info.fish_type, max(fish_info.length) as length, fish_name_info.fish_name as fish_name
    from fish_info , fish_name_info
    where fish_info.fish_type=fish_name_info.fish_type
    group by fish_type
) as re, fish_info
where fish_info.length=re.length and re.fish_type=fish_info.fish_type
order by fish_info.id;