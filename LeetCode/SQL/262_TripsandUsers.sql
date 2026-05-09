# Write your MySQL query statement below
-- 26-05-09 25min
-- https://leetcode.com/problems/trips-and-users
-- 혼자!

-- client, driver not banned
SELECT alls.request_at                                                    as 'Day',
       ROUND(COALESCE(cancelled.cancelled_count, 0) / alls.alls_count, 2) as 'Cancellation Rate'
FROM (SELECT t.request_at, count(*) as alls_count
      FROM Trips t
               left join Users u_c ON t.client_id = u_c.users_id
               left join Users u_t ON t.driver_id = u_t.users_id
      where u_c.banned = 'No'
        and u_t.banned = 'No'
        and t.request_at between "2013-10-01" and "2013-10-03"
      group by t.request_at) AS alls
         LEFT JOIN (SELECT t.request_at, count(*) as cancelled_count
                    FROM Trips t
                             left join Users u_c ON t.client_id = u_c.users_id
                             left join Users u_t ON t.driver_id = u_t.users_id
                    where u_c.banned = 'No'
                      and u_t.banned = 'No'
                      and t.status not in ('completed')
                      and t.request_at between "2013-10-01" and "2013-10-03"
                    group by t.request_at) AS cancelled ON alls.request_at = cancelled.request_at
group by alls.request_at