-- 26-05-31
-- https://leetcode.com/problems/find-consistently-improving-employees/submissions/2018013297/

select employee_id, name, right(q, 1) - left(q, 1) improvement_score
from (select employee_id, name, right(group_concat(rating order by review_date), 5) q
      from employees
               join performance_reviews using (employee_id)
      group by employee_id, name
      having length(q) = 5
         and left(q, 1) < substring(q, 3, 1)
         and substring(q, 3, 1) < right(q, 1)) _
order by improvement_score desc, name;