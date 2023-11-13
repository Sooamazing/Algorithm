-- https://school.programmers.co.kr/learn/courses/30/lessons/157341

-- 코드를 입력하세요
SELECT DISTINCT rental.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR rental JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY history ON rental.CAR_ID = history.CAR_ID
WHERE rental.CAR_TYPE ='세단' AND history.START_DATE LIKE '2022-10%'
ORDER BY CAR_ID DESC

-- 코드를 입력하세요 - 영민님
SELECT CAR_ID
from CAR_RENTAL_COMPANY_CAR
where
        CAR_TYPE = '세단'
  and
        CAR_ID in (select CAR_ID
                   from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                   where date_format(START_DATE, "%Y-%m") = '2022-10'
    )
order by CAR_ID desc;