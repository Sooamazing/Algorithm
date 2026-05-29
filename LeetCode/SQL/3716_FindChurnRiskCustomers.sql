# Write your MySQL query statement below
-- 26-05-29
-- https://leetcode.com/problems/find-churn-risk-customers
-- hint
WITH query_cte AS (SELECT user_id,
                          event_date,
                          MAX(event_date) OVER (PARTITION BY user_id)           max_event_date,
                          event_type,
                          plan_name                                             current_plan,
                          monthly_amount,
                          MAX(monthly_amount) OVER (PARTITION BY user_id)       max_historical_amount,
                          DATEDIFF(MAX(event_date) OVER (PARTITION BY user_id),
                                   MIN(event_date) OVER (PARTITION BY user_id)) days_as_subscriber,
                          COUNT(CASE WHEN event_type = 'downgrade' THEN 1 ELSE NULL END)
                                OVER (PARTITION BY user_id)                     is_hv_downgrade,
                          MAX(CASE WHEN event_type = 'cancel' THEN event_date ELSE '1900-01-01' END)
                              OVER (PARTITION BY user_id)                       max_cancel_event_date
                   FROM subscription_events)
SELECT DISTINCT user_id,
                current_plan,
                monthly_amount current_monthly_amount,
                max_historical_amount,
                days_as_subscriber
FROM query_cte q
WHERE max_event_date != max_cancel_event_date
  AND is_hv_downgrade > 0
  AND days_as_subscriber > 59
  AND monthly_amount / CAST(max_historical_amount AS FLOAT) <= 0.5
ORDER BY days_as_subscriber DESC, user_id;