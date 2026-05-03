-- 26-05-03 5min
-- https://leetcode.com/problems/rank-scores
-- dense_rank 이용

# Write your MySQL query statement below
select score, dense_rank() over (order by score desc) as 'rank'
from Scores
order by score desc;