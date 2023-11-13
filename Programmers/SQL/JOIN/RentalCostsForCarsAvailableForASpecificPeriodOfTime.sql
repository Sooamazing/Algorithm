-- https://school.programmers.co.kr/learn/courses/30/lessons/157339

-- 코드를 입력하세요
SELECT rental.CAR_ID, rental.CAR_TYPE, TRUNCATE((rental.DAILY_FEE*30*(100-plan.DISCOUNT_RATE)/100),0) as FEE
FROM CAR_RENTAL_COMPANY_CAR rental
         JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY history
              ON rental.CAR_ID = history.CAR_ID
         JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN plan
              ON rental.CAR_TYPE = plan.CAR_TYPE
WHERE rental.CAR_TYPE IN ('세단', 'SUV')
  AND rental.CAR_ID NOT IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY history
    # WHERE START_DATE >= '2022-11-01' OR END_DATE <= '2022-11-30'
WHERE '2022-11' BETWEEN DATE_FORMAT(START_DATE,'%Y-%m') AND DATE_FORMAT(END_DATE,'%Y-%m')
    )
  AND plan.DURATION_TYPE = '30일 이상'
GROUP BY rental.CAR_ID, rental.CAR_TYPE
HAVING 500000 <= FEE AND FEE < 2000000
ORDER BY FEE DESC, rental.CAR_TYPE, rental.CAR_ID DESC

-- 코드를 입력하세요 - 봉승님
SELECT distinct
    c.CAR_ID,
    p.CAR_TYPE,
    FLOOR(c.DAILY_FEE * (1-(p.discount_rate/100)) * 30) AS FEE
FROM CAR_RENTAL_COMPANY_CAR as c
         JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY as r
              ON c.CAR_ID = r.CAR_ID
         join CAR_RENTAL_COMPANY_DISCOUNT_PLAN as p
              on c.CAR_TYPE = p.CAR_TYPE
                  AND p.DURATION_TYPE LIKE '30일 이상'
WHERE c.CAR_TYPE IN ('세단','SUV')
    # 날짜 비교 문
    AND c.CAR_ID NOT IN (
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS h
            WHERE '2022-11' BETWEEN DATE_FORMAT(START_DATE,'%Y-%m') AND DATE_FORMAT(END_DATE,'%Y-%m')
        )
    AND (c.DAILY_FEE * (1-(p.discount_rate/100)) * 30) >= 500000
    AND (c.DAILY_FEE * (1-(p.discount_rate/100)) * 30) < 2000000
order by FEE desc, p.CAR_TYPE ASC, c.CAR_ID desc

