-- 코드를 입력하세요
SELECT user.USER_ID, user.NICKNAME, sum(board.PRICE) as TOTAL_SALES
FROM USED_GOODS_BOARD board JOIN USED_GOODS_USER user ON board.WRITER_ID = user.USER_ID
WHERE board.STATUS = 'DONE'
GROUP BY board.WRITER_ID
HAVING sum(board.PRICE)>=7000000
ORDER BY TOTAL_SALES