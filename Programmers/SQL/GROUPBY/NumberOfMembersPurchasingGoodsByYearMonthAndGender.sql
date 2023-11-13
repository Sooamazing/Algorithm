-- https://school.programmers.co.kr/learn/courses/30/lessons/131532
-- 코드를 입력하세요
# 년, 월, 성별 별로 상품을 구매한 회원수를 집계
SELECT YEAR(sale.SALES_DATE) as YEAR, MONTH(sale.SALES_DATE) as MONTH, users.GENDER, COUNT(DISTINCT users.USER_ID) as USERS
    # SELECT COUNT(*)
      FROM USER_INFO users JOIN ONLINE_SALE sale ON users.USER_ID = sale.USER_ID
      WHERE users.GENDER IS NOT NULL
      GROUP BY YEAR, MONTH, GENDER
      ORDER BY YEAR, MONTH, GENDER