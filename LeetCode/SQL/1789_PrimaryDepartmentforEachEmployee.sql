# Write your MySQL query statement below
-- 26-05-12 15min
-- https://leetcode.com/problems/primary-department-for-each-employee

-- COUNT 는 null이 아닌 값의 개수를 세고, SUM은 null을 0으로 간주하여 계산.

with e (employee_id, department_id) AS ((SELECT employee_id, department_id
                                         FROM Employee
                                         WHERE primary_flag = 'Y')

                                        UNION ALL

                                        (SELECT employee_id, department_id
                                         FROM Employee
                                         GROUP BY employee_id
                                         HAVING SUM(primary_flag = 'Y') = 0))

SELECT *
FROM e