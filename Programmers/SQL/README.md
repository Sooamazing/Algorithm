# 기록
## SQL 문제 - MySQL 

<details>
<summary>문제 이름 - 날짜 0뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심</li>
<li>새로 알게된 것</li>
<li>궁금한 / 보충이 필요한 부분</li>
<li>하고 싶은 말</li>
</ul>
</div>
</details>

-----
### [Group By](GROUPBY)
<details>
<summary> (Hint) 가격대 별 상품 개수 구하기 - 23/11/1 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>계산해서 group by 하기!</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>SELECT 절에서 계산한 값으로 column 생성</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>FLOOR 사용법</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>오늘도~! 정빈님이 풀자고 한 덕에 후다닥~ 한 30분 내에 3문제 다 푼 것 같다~ !!! 야호야호~!~!</li>
<li>계산.. 해야 한다니.. 이제 ... 더 열심히 생각해야 한다... 더 적절한 계산...</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary> 동명 동물 수 찾기 - 23/11/1 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>NULL 제외한 값 조회하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>IS NOT NULL 사용!</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>WHERE에 쓰는 것과 HAVING에 쓰는 것의 차이점.</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary> 고양이와 개는 몇 마리 있을까 - 23/11/1 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>group by, count 사용 </li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>count(*) 사용과 group by로 묶은 컬럼으로 넣어 사용하는 것과 결과가 같음.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>count() 대상 정확히 알기</li>
</ul>
</li>
</ul>
</div>
</details>

### [Join](JOIN)

<details>
<summary> (Hint) 조건에 맞는 도서와 저자 리스트 출력하기 - 23/10/31 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>INNER JOIN과 조건 설정</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>DATA_FORMAT</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary> (Hint) 상품 별 오프라인 매출 구하기 - 23/10/31 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>GROUP BY와 SUM 이용하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>SUM(COLUMN) → COLUMN 대신 컬럼 계산식으로 넣을 수 있음.</li>
<li>ORDER BY 기준 두 개</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>집계 함수!</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>새벽에 우다다 두 문제 풀어서 세 문제 풀었다!!!</li>
<li>오랜만에 보니 재밌고, 집계 함수는 역시.. 뭔가 까다롭다는 것...</li>
</ul>
</li>
</ul>
</div>
</details>

### [Select](Select)
<details>
<summary>12세 이하인 여자 환자 목록 출력하기 - 23/10/31 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>여러 컬럼으로 정렬 기준 정하고, 비어있는 값에 대체값 넣기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>GROUP BY, ORDER BY(기본 오름차순) DESC, IFNULL</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>지금은 딱히 없음</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>오랜만에 푸니까 진짜 다 까먹었지만 열심히 검색해서 채워 넣어야지~!</li>
</ul>
</li>
</ul>
</div>
</details>