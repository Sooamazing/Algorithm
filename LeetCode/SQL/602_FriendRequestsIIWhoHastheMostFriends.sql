# Write your MySQL query statement below
-- 26-05-04 15min
-- https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends
-- union all vs union: 중복 제거 여부


-- select *
-- from RequestAccepted r left join RequestAccepted a on r.requester_id = a.accepter_id

with all_ids as
         (select requester_id as id
          from RequestAccepted

          union all

          select accepter_id as id
          from RequestAccepted)

select id, count(*) as num
from all_ids
group by id
order by num desc
limit 1;