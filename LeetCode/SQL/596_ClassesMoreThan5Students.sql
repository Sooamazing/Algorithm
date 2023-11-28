-- https://leetcode.com/problems/classes-more-than-5-students/
-- Runtime Details 497ms Beats 79.05%of users with MySQL

# Write your MySQL query statement below

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(*)>=5