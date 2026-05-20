# Write your MySQL query statement below
-- 26-05-20 60min
-- https://leetcode.com/problems/find-products-with-valid-serial-numbers
-- REGEXP 는 대소문자 구분 x

SELECT product_id, product_name, description
FROM products
WHERE REGEXP_LIKE(description, '^(S|.+\\s+S)N\\d{4}-(\\d{4}|\\d{4}\\D+)$', 'c')
ORDER BY product_id