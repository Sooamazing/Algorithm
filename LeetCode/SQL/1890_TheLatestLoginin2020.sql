-- 26-05-06 20min
-- https://leetcode.com/problems/the-latest-login-in-2020/
-- max 집계 함수 select에 사용하기
# Write your MySQL query statement below
select user_id, max(time_stamp) as last_stamp
from Logins
where year(time_stamp) = 2020
group by user_id

-- select user_id, time_stamp as last_stamp
-- from Logins
-- where year(time_stamp) = 2020
-- group by user_id
-- having max(time_stamp) = time_stamp;