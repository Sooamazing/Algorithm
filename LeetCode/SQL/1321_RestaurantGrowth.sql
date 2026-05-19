# Write your MySQL query statement below
-- 26-05-19 20min
-- https://leetcode.com/problems/restaurant-growth/
-- SUM OVER, ROWS PRECEDING 윈도우 함수 이용
-- ROW_NUMBER 이용 시 시작 날짜 선택 가능

-- SELECT visited_on, SUM(amount) OVER(ORDER BY visited_on BETWEEN NOW() AND DATE_ADD(NOW(), INTERVAL 6 DAY)) as amount
-- FROM Customer
-- GROUP BY visited_on
-- ORDER BY visited_on

WITH temp AS (SELECT visited_on,
                     SUM(amount) amount
              FROM Customer
              GROUP BY visited_on)

SELECT visited_on,
       SUM(amount) OVER (ORDER BY visited_on ROWS 6 PRECEDING)           amount,
       ROUND(AVG(amount) OVER (ORDER BY visited_on ROWS 6 PRECEDING), 2) average_amount
FROM temp
ORDER BY visited_on
Limit 100 OFFSET 6