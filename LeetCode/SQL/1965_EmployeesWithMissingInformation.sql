# Write your MySQL query statement below
-- 26-05-13 10min
-- https://leetcode.com/problems/employees-with-missing-information/
select a.employee_id
from (select e.employee_id
      from Employees e
      UNION ALL
      select s.employee_id
      from Salaries s) a
where a.employee_id not in (select e.employee_id
                            from Employees e
                                     join Salaries s on e.employee_id = s.employee_id)
group by a.employee_id
order by a.employee_id