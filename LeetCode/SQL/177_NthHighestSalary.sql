-- 26-05-05 60min
-- https://leetcode.com/problems/nth-highest-salary
-- 함수 생성, rank / offset / subquery
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE M INT;
    SET M = N - 1;
    RETURN (
        # Write your MySQL query statement below.
        -- 26-05-05 60min
        -- Operand should contain 1 column(s)
        -- 오류: getNthHighestSalary가 INT 하나를 반환하기를 기대하고 있음.
        -- select id, salary
        -- from (select id, salary, RANK() OVER(order by salary) as `rank`
        -- from Employee) as salary_ranks
        -- where `rank` = N

        -- Subquery returns more than 1 row

        -- select salary
        -- from (select salary, RANK() OVER(order by salary) as `rank`
        -- from Employee) as salary_ranks
        -- where `rank` = N

        -- SELECT DISTINCT Salary
        -- FROM Employee
        -- ORDER BY Salary DESC
        -- LIMIT M, 1

-- SELECT salary FROM (
-- SELECT DISTINCT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
-- FROM Employee
-- ) ranked
-- WHERE ranked.rnk = N
-- LIMIT 1

        SELECT DISTINCT Salary
        FROM Employee e1
        WHERE N = (SELECT COUNT(DISTINCT salary)
                   FROM Employee e2
                   WHERE e1.salary <= e2.salary)
        ORDER BY e1.salary DESC);
END