-- https://school.programmers.co.kr/learn/courses/30/lessons/131113

-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,'%Y-%m-%d'),
       (
           CASE WHEN OUT_DATE <= '2022-05-01'
                    THEN '출고완료'
                WHEN OUT_DATE IS NULL
                    # WHEN OUT_DATE < '2022-05-01'
                    THEN '출고미정'
                ELSE '출고대기'
               END
           )as 출고여부
-- IF(OUT_DATE IS NULL, '출고미정', IF(OUT_DATE <= '2022-05-01', '출고완료', '출고대기')) AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID
