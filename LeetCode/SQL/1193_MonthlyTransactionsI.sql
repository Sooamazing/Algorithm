--  https://leetcode.com/problems/monthly-transactions-i/submissions/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
# find for each month and country (GROUP BY),
# the number of transactions and their total amount, the number of approved transactions and their total amount. (CASE WHEN ?)

SELECT t.trans_date as month, t.country,
t.trans_count, IFNULL(ap.approved_count, 0) as approved_count,
t.trans_total_amount, IFNULL(ap.approved_total_amount, 0) as approved_total_amount
FROM (
    SELECT DATE_FORMAT(trans_date, '%Y-%m') as trans_date, country, COUNT(*) as trans_count, SUM(amount) as trans_total_amount
    FROM Transactions
    GROUP BY YEAR(trans_date), MONTH(trans_date), COUNTRY
    ) as t LEFT JOIN (
    SELECT COUNT(*) as approved_count, SUM(amount) as approved_total_amount, DATE_FORMAT(trans_date, '%Y-%m') as trans_date, country
    FROM Transactions
    WHERE state = "approved"
    GROUP BY YEAR(trans_date), MONTH(trans_date), COUNTRY
    ) as ap ON t.country = ap.country AND t.trans_date = ap.trans_date
GROUP BY t.trans_date, t.COUNTRY