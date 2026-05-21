# Write your MySQL query statement below
-- 26-05-21 40min
-- https://leetcode.com/problems/seasonal-sales-analysis/
-- GROUP BY, RANK, PARTITION BY, ORDER BY, LIMIT 이용하기

SELECT ranks.season, ranks.category, ranks.total_quantity, ranks.total_revenue
FROM (SELECT s.season
           , p.category
           , SUM(s.quantity)                                                                                      total_quantity
           , SUM(s.quantity * s.price)                                                                            total_revenue
           , RANK() OVER (PARTITION BY s.season ORDER BY SUM(s.quantity) DESC, SUM(s.quantity * s.price) DESC) as r
      FROM (SELECT *,
                   CASE
                       WHEN MONTH(sale_date) IN (12, 1, 2) THEN 'Winter'
                       WHEN MONTH(sale_date) IN (3, 4, 5) THEN 'Spring'
                       WHEN MONTH(sale_date) IN (6, 7, 8) THEN 'Summer'
                       WHEN MONTH(sale_date) IN (9, 10, 11) THEN 'Fall'
                       END
                       AS season
            FROM sales) s
               LEFT JOIN products p ON s.product_id = p.product_id
      GROUP BY s.season, p.category
      ORDER BY r
      LIMIT 4) ranks
ORDER BY ranks.season