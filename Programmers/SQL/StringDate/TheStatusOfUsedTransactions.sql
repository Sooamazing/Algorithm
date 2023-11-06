-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE,
    case
        when STATUS = 'DONE'
            then '거래완료'
       when STATUS = 'RESERVED'
            then '예약중'
       when STATUS = 'SALE'
            then '판매중'
        else 'ETC'
        end as STATUS
# SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, replace(replace(replace(status, "DONE", "거래완료"), "SALE", "판매중"), "RESERVED", "예약중") AS STATUS
FROM USED_GOODS_BOARD
WHERE CREATED_DATE LIKE '2022-10-05%'
ORDER BY BOARD_ID DESC