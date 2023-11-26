-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i/
-- Runtime Details 905ms Beats 41.99%of users with MySQL

# Write your MySQL query statement below
SELECT activity_date as day, COUNT(DISTINCT user_id) as active_users
FROM Activity
WHERE activity_date <= '2019-07-27' AND DATEDIFF('2019-07-27', activity_date) < 30
GROUP BY activity_date