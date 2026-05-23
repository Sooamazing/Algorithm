# Write your MySQL query statement below
-- 26-05-23 15min
-- https://leetcode.com/problems/market-analysis-i/
-- LEFT JOIN, u.user_id 사용해야 0인 경우도 포함됨

SELECT u.user_id                                   AS buyer_id,
       u.join_date,
       COALESCE(SUM(o.order_date LIKE '2019%'), 0) AS orders_in_2019
FROM Users u
         LEFT JOIN Orders o ON u.user_id = o.buyer_id
GROUP BY u.user_id
ORDER BY u.user_id