-- 26-05-02 10min
-- https://leetcode.com/problems/find-valid-emails
-- 정규표현식으로 검사하기

# Write your MySQL query statement below
select user_id, email
from Users
where email regexp '^[0-9a-zA-Z_]+@[A-Za-z]+\\.com$'
order by user_id;