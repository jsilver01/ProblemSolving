SELECT
    ri.rest_id,
    ri.rest_name,
    ri.food_type,
    ri.favorites,
    ri.address,
    ROUND(AVG(rr.review_score),2) AS SCORE
FROM rest_info ri
JOIN rest_review rr
    ON ri.rest_id = rr.rest_id
WHERE SUBSTR(ri.address,1,2) = '서울'
GROUP BY
    ri.rest_id,
    ri.rest_name,
    ri.food_type,
    ri.favorites,
    ri.address
ORDER BY
    SCORE DESC,
    ri.favorites DESC;