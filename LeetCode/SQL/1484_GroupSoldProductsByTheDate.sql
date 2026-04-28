# 26-04-28 15min
# https://leetcode.com/problems/group-sold-products-by-the-date/?envType=study-plan-v2&envId=top-sql-50
# group_concat: 이용 시 distinct를 이용하여 중복 제거, order by를 이용하여 정렬 가능, ', '로 구분하여 문자열로 반환

# Write your MySQL query statement below
select sell_date,
       count(DISTINCT product)                         as num_sold,
       group_concat(distinct product order by product) as products
from Activities
group by sell_date
order by sell_date, products