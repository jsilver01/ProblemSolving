-- 코드를 입력하세요
SELECT ub.title, ub.board_id, ur.reply_id, ur.writer_id, ur.contents, to_char(ur.created_date,'yyyy-mm-dd')
from used_goods_board ub, used_goods_reply ur
where to_char(ub.created_date,'yyyy-mm')='2022-10' and ub.board_id = ur.board_id
order by ur.created_date asc, ub.title asc;