# Write your MySQL query statement below
-- 26-05-24
-- https://leetcode.com/problems/find-users-with-high-token-usage/
-- MAX 비교는 값에 변화가 있는지 확인하기 위해 사용

SELECT user_id, COUNT(prompt) prompt_count, ROUND(AVG(tokens), 2) avg_tokens
FROM prompts
GROUP BY user_id
HAVING prompt_count >= 3
   AND MAX(tokens) > avg_tokens
ORDER BY avg_tokens DESC, user_id