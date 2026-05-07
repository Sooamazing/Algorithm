# Write your MySQL query statement below
-- 26-05-07 20min
-- https://leetcode.com/problems/department-top-three-salaries/
-- dense_rank, subquery

SELECT d.name as Department, e.name as Employee, e.salary as Salary
FROM (select id,
             name,
             salary,
             departmentId,
             rank() over (partition by departmentId order by salary desc) as salary_rank
      from Employee) e
         left join Department d on e.departmentId = d.id
where e.salary_rank in (1, 2, 3);