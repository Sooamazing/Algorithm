-- https://leetcode.com/problems/consecutive-numbers/
-- Runtime Details 982ms Beats 48.24%of users with MySQL
# Write your MySQL query statement below

SELECT DISTINCT a.num as ConsecutiveNums
FROM Logs a JOIN Logs b ON a.id = b.id +1
            JOIN Logs c ON b.id = c.id +1
    AND a.num = b.num
    AND b.num = c.num