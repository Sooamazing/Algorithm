# Write your MySQL query statement below
-- 26-05-18 30min
-- https://leetcode.com/problems/find-invalid-ip-addresses/

SELECT ip, COUNT(ip) AS invalid_count
FROM (SELECT ip
           , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 1), '.', -1)   AS first_idx
           , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 2), '.', -1)   AS second_idx
           , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 3), '.', -1)   AS third_idx
           , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 4), '.', -1)   AS fourth_idx
           , CHAR_LENGTH(ip) - CHAR_LENGTH(REPLACE(ip, '.', '')) + 1 AS split_count
      FROM logs l) AS all_logs
WHERE !(first_idx <= 255 AND second_idx <= 255 AND third_idx <= 255 AND fourth_idx <= 255
    AND first_idx not like '0%' AND second_idx not like '0%' AND third_idx not like '0%' AND
        fourth_idx not like '0%'
    AND split_count = 4)
GROUP BY ip
ORDER BY invalid_count DESC, ip DESC


-- SELECT ip, SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 1), '.', -1) AS first_idx
--     , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 2), '.', -1) AS second_idx
--     , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 3), '.', -1) AS third_idx
--     , SUBSTRING_INDEX(SUBSTRING_INDEX(ip, '.', 4), '.', -1) AS fourth_idx
--     , CHAR_LENGTH(ip) - CHAR_LENGTH(REPLACE(ip, '.', '')) + 1 AS split_count
--     FROM logs l