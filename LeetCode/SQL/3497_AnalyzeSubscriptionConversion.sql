# Write your MySQL query statement below
-- 26-05-16 20min
-- SUM vs COUNT ?

SELECT user_id
     , ROUND(IF(activity_type = 'free_trial',
                SUM(IF(activity_type = 'free_trial', activity_duration, 0)) /
                SUM(activity_type = 'free_trial'), ''), 2) as trial_avg_duration
     , ROUND(SUM(IF(activity_type = 'paid', activity_duration, 0)) / SUM(activity_type = 'paid'),
             2)                                            as paid_avg_duration
FROM UserActivity
GROUP BY user_id
HAVING SUM(activity_type = 'paid') != 0
ORDER BY user_id