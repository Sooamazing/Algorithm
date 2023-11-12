-- https://school.programmers.co.kr/learn/courses/30/lessons/164671
-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/',file.BOARD_ID,'/',file.FILE_ID, file.FILE_NAME, file.FILE_EXT) as FILE_PATH
FROM USED_GOODS_BOARD board JOIN USED_GOODS_FILE file ON board.BOARD_ID = file.BOARD_ID
    # WHERE (board.BOARD_ID) IN (
    #     SELECT BOARD_ID
    #     FROM USED_GOODS_BOARD board
    #     ORDER BY board.VIEWS DESC
    #     # LIMIT 1
    # )
WHERE (board.VIEWS) IN (
    SELECT MAX(board.VIEWS) as m
    FROM USED_GOODS_BOARD board
    )
    # GROUP BY board.BOARD_ID
ORDER BY file.FILE_ID DESC


-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/',file.BOARD_ID,'/',file.FILE_ID, file.FILE_NAME, file.FILE_EXT) as FILE_PATH
FROM USED_GOODS_BOARD board JOIN USED_GOODS_FILE file ON board.BOARD_ID = file.BOARD_ID
WHERE (board.BOARD_ID) = (
    SELECT BOARD_ID
    FROM USED_GOODS_BOARD board
    ORDER BY board.VIEWS DESC
    LIMIT 1
    )
ORDER BY file.FILE_ID DESC