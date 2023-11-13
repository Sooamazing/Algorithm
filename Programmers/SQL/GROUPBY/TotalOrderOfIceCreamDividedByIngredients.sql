-- 코드를 입력하세요
SELECT info.INGREDIENT_TYPE, sum(half.TOTAL_ORDER) as TOTAL_ORDER
FROM FIRST_HALF half JOIN ICECREAM_INFO info ON half.FLAVOR = info.FLAVOR
GROUP BY info.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER


-- 코드를 입력하세요
SELECT info.INGREDIENT_TYPE, sum(half.TOTAL_ORDER) as TOTAL_ORDER
FROM FIRST_HALF half, ICECREAM_INFO info
WHERE half.FLAVOR = info.FLAVOR
GROUP BY info.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER