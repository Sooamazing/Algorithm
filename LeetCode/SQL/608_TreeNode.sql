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

-- not in 사용 시 NULL이 존재하면 전체 결과가 UNKNOWN이 되어 아무것도 반환하지 않음 -> COALESCE로 NULL을 ''로 바꿔주면 해결. 권장 X
select id,
       CASE
           WHEN p_id IS NULL THEN 'Root'
           WHEN id not in (SELECT COALESCE(p_id, '') from tree) THEN 'Leaf'
           ELSE 'Inner'
           END AS 'type'
FROM Tree

-- 아래도 가능
-- WHEN id NOT IN (SELECT DISTINCT p_id FROM Tree WHERE p_id IS NOT NULL) THEN 'Leaf'