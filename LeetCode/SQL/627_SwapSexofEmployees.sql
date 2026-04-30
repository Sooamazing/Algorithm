-- 26-04-29 5min
-- https://leetcode.com/problems/swap-sex-of-employees/description/
-- update set에도 case 사용 가능

update Salary
set sex = 
    case when sex = 'm' then 'f' else 'm' end;
