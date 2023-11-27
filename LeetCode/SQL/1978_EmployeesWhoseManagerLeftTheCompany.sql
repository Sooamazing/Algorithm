-- https://leetcode.com/problems/employees-whose-manager-left-the-company/
-- Runtime Details 582ms Beats 75.42%of users with MySQL

# Write your MySQL query statement below
# Find the IDs of the employees whose salary is strictly less than $30000 and whose manager left the company.
SELECT employee_id
FROM Employees
WHERE salary < 30000
    AND manager_id NOT IN (
        SELECT employee_id
        FROM Employees
    )
ORDER BY employee_id