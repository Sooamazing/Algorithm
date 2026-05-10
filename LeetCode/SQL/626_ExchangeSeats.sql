# Write your MySQL query statement below
-- 26-05-10 10min
-- SELECT 문은 스칼라 서브쿼리로 사용될 때 (SELECT ...) 처럼 괄호로 감싸야 함.
-- 스칼라 서브쿼리: 단일 값 (행 1 개, 열 1 개) 을 반환하는 서브쿼리
--     DBMS 가 어디까지가 서브쿼리인지 경계 를 인식해야 하기 때문. 괄호가 없으면 문법 파싱이 불가능.
-- 그냥 스칼라 서브쿼리 두 개 안 쓰고, id만 바꿔서 출력 후 ORDER BY 하는 방법도 있음.
SELECT id,
       COALESCE(IF(id % 2 = 0, (SELECT student FROM Seat where id = s.id - 1),
                   (SELECT student FROM Seat where id = s.id + 1)), student) as student
FROM Seat s
ORDER BY id;