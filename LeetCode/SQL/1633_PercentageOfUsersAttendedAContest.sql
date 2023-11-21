-- https://leetcode.com/problems/percentage-of-users-attended-a-contest/?envType=study-plan-v2&envId=top-sql-50
-- Runtime Details 1400ms Beats 99.51%of users with MySQL


# Write your MySQL query statement below
#  the percentage of the users registered in each contest rounded to two decimals.

SELECT r.contest_id, ROUND(COUNT(*)*100/t.total, 2) as percentage
FROM Users u
  JOIN Register r ON u.user_id = r.user_id
  JOIN (
  SELECT COUNT(*) as total
  FROM Users u
  # GROUP BY u.user_id -- u.user_id SELECT 후 이게 없으면 user_id 맨 첫 줄 하나만 출력됨 -> 근데 GROUP BY 하면 각 1개씩만 출력됨...
  ) as t
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id