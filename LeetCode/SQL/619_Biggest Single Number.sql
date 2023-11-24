-- https://leetcode.com/problems/biggest-single-number/
-- Runtime Details 5489ms Beats 5.01%of users with MySQL

# Write your MySQL query statement below

SELECT num
FROM MyNumbers m1
GROUP BY m1.num
HAVING COUNT(m1.num) <= 1
UNION ALL
SELECT null as num
FROM MyNumbers m2
ORDER BY num DESC
    LIMIT 1