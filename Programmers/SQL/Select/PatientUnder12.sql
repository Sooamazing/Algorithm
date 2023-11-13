--https://school.programmers.co.kr/learn/courses/30/lessons/132201

-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, "NONE") AS TLNO
FROM PATIENT
WHERE PATIENT.AGE<=12 AND PATIENT.GEND_CD='W'
GROUP BY AGE, PT_NAME
ORDER BY AGE DESC, PT_NAME