-- https://leetcode.com/problems/confirmation-rate/
-- 1275ms Beats 51.97%of users with MySQL
# Write your MySQL query statement below

SELECT s.user_id, ROUND(
        IFNULL(
                    SUM(c.action = 'confirmed')/COUNT(c.action = 'confirmed'), -- COUNT(*)도 가능
                    0),
        2) as confirmation_rate
    # SELECT  s.user_id, ROUND(
#     COUNT(IF(c.action = 'confirmed', 1, NULL))/COUNT(*), -- 영민님 답안, NULL 대신 0 쓰면 전체 count와 다를 바 없어서 틀림.
#   2) as confirmation_rate
# SELECT  s.user_id, ROUND(
        #     COUNT(IF(c.action = 'confirmed', 1))/COUNT(*), -- 조건 미충족이 없으면 runtime error, IF의 문법임. CASE WHEN 은 ELSE 없어도 됨, 자동 NULL 반환
        #   2) as confirmation_rate
            # SELECT  s.user_id, SUM(c.action = 'confirmed') -- NULL 비교라서 안 됨.
  FROM Signups s LEFT JOIN Confirmations c ON s.user_id = c.user_id
  GROUP BY s.user_id

            # explain SELECT null, null from dual
