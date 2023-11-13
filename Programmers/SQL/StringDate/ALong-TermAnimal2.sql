-- https://school.programmers.co.kr/learn/courses/30/lessons/59411
-- 코드를 입력하세요
SELECT outs.ANIMAL_ID, outs.NAME
FROM ANIMAL_INS ins RIGHT JOIN ANIMAL_OUTS outs ON ins.ANIMAL_ID = outs.ANIMAL_ID
ORDER BY (outs.DATETIME - ins.DATETIME) DESC
    LIMIT 2