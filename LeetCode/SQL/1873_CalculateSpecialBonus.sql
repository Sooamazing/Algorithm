# Write your MySQL query statement below
-- 26-05-14 5min
-- https://leetcode.com/problems/calculate-special-bonus/description/
  
select employee_id, IF(employee_id %2 !=0 and name not like 'M%',salary, 0) as 'bonus'
from Employees
order by employee_id
