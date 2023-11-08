-- 코드를 입력하세요
SELECT infos.REST_ID, infos.REST_NAME, infos.FOOD_TYPE, infos.FAVORITES, infos.ADDRESS, ROUND(AVG(reviews.REVIEW_SCORE),2) as SCORE
FROM REST_INFO infos JOIN REST_REVIEW reviews ON infos.REST_ID = reviews.REST_ID
WHERE (infos.REST_ID) IN (
    SELECT REST_ID
    FROM REST_INFO
    WHERE SUBSTRING(ADDRESS, 1, 2) = '서울'
)
GROUP BY infos.REST_ID
ORDER BY SCORE DESC, infos.FAVORITES DESC