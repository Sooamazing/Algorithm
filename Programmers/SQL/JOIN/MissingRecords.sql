-- 코드를 입력하세요
SELECT outs.ANIMAL_ID, outs.NAME
FROM ANIMAL_OUTS outs LEFT JOIN ANIMAL_INS ins ON outs.ANIMAL_ID = ins.ANIMAL_ID
WHERE ins.name IS NULL AND outs.name IS NOT NULL