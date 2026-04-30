# Write your MySQL query statement below
-- 26-04-30 15min
-- https://leetcode.com/problems/reformat-department-table

-- SELECT id
-- , if(month = 'Jan', revenue, null) as 'Jan_Revenue'
-- , if(month = 'Feb', revenue, null) as 'Feb_Revenue'
-- , if(month = 'Mar', revenue, null) as 'Mar_Revenue'
-- , if(month = 'Apr', revenue, null) as 'Apr_Revenue'
-- , if(month = 'May', revenue, null) as 'May_Revenue'
-- , if(month = 'Jun', revenue, null) as 'Jun_Revenue'
-- , if(month = 'Jul', revenue, null) as 'Jul_Revenue'
-- , if(month = 'Aug', revenue, null) as 'Aug_Revenue'
-- , if(month = 'Sep', revenue, null) as 'Sep_Revenue'
-- , if(month = 'Oct', revenue, null) as 'Oct_Revenue'
-- , if(month = 'Nov', revenue, null) as 'Nov_Revenue'
-- , if(month = 'Dec', revenue, null) as 'Dec_Revenue'
-- FROM Department d
-- group by id

select distinct d.id,
                d1.revenue  as Jan_Revenue,
                d2.revenue  as Feb_Revenue,
                d3.revenue  as Mar_Revenue,
                d4.revenue  as Apr_Revenue,
                d5.revenue  as May_Revenue,
                d6.revenue  as Jun_Revenue,
                d7.revenue  as Jul_Revenue,
                d8.revenue  as Aug_Revenue,
                d9.revenue  as Sep_Revenue,
                d10.revenue as Oct_Revenue,
                d11.revenue as Nov_Revenue,
                d12.revenue as Dec_Revenue
from department d
         left join department d1 on d.id = d1.id and d1.month = "Jan"
         left join department d2 on d.id = d2.id and d2.month = "Feb"
         left join department d3 on d.id = d3.id and d3.month = "Mar"
         left join department d4 on d.id = d4.id and d4.month = "Apr"
         left join department d5 on d.id = d5.id and d5.month = "May"
         left join department d6 on d.id = d6.id and d6.month = "Jun"
         left join department d7 on d.id = d7.id and d7.month = "Jul"
         left join department d8 on d.id = d8.id and d8.month = "Aug"
         left join department d9 on d.id = d9.id and d9.month = "Sep"
         left join department d10 on d.id = d10.id and d10.month = "Oct"
         left join department d11 on d.id = d11.id and d11.month = "Nov"
         left join department d12 on d.id = d12.id and d12.month = "Dec"