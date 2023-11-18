-- 코드를 입력하세요
#  자동차 종류가 '트럭'인 자동차의 대여 기록에 대해서 대여 기록 별로 대여 금액
SELECT s.HISTORY_ID, (
    FLOOR(total*(100-IFNULL(p.DISCOUNT_RATE, 0))/100)
    ) as FEE
FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
         RIGHT JOIN (
    SELECT h.HISTORY_ID, c.CAR_TYPE, (
        CASE WHEN
                         DATEDIFF(h.END_DATE, h.START_DATE)+1 >=90 THEN '90일 이상'
             WHEN
                         DATEDIFF(h.END_DATE, h.START_DATE)+1 >=30 THEN '30일 이상'
             WHEN
                         DATEDIFF(h.END_DATE, h.START_DATE)+1 >=7 THEN '7일 이상'
             ELSE ''
            END
        ) as d_t, (DATEDIFF(h.END_DATE, h.START_DATE)+1)*c.DAILY_FEE as total
    FROM CAR_RENTAL_COMPANY_CAR c
             JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY h
                  ON c.CAR_ID = h.CAR_ID
    WHERE c.CAR_TYPE = '트럭'
) as s ON p.CAR_TYPE = s.CAR_TYPE AND p.DURATION_TYPE = s.d_T
ORDER BY FEE DESC, s.HISTORY_ID DESC