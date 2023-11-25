-- https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher/
-- Runtime Details 793ms Beats 96.89%of users with MySQL

# Write your MySQL query statement below

SELECT teacher_id, COUNT(DISTINCT subject_id) as cnt
FROM Teacher
GROUP BY teacher_id