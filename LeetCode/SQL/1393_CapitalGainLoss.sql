# Write your MySQL query statement below
-- 26-05-11 7min
-- https://leetcode.com/problems/capital-gainloss
SELECT stock_name, SUM(capital_money) as 'capital_gain_loss'
FROM (SELECT stock_name, IF(operation = 'Buy', SUM(price) * (-1), SUM(price)) as 'capital_money'
      FROM Stocks
      GROUP BY stock_name, operation) AS grouped
GROUP BY grouped.stock_name

-- 아래처럼도 가능.
# sum(
#     CASE WHEN operation='Buy' THEN price*-1
#     ELSE price END) AS capital_gain_loss

-- sum( if(operation = 'Buy' , -price, price) ) as capital_gain_loss