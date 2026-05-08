# Write your MySQL query statement below
-- 26-05-08 15min
-- https://leetcode.com/problems/tree-node/
-- case when - subquery

#NOT IN (...) fails if even one NULL exists inside the subquery results — it makes the #whole condition unknown.
#IN returns TRUE only if it finds an exact match.
select id,
       CASE
           WHEN p_id IS NULL THEN 'Root'
           WHEN id in (SELECT p_id from tree) THEN 'Inner'
           ELSE 'Leaf'
           END AS 'type'
FROM Tree