# 기록
## SQL 문제 - MySQL 

<details>
<summary><a href="">문제 이름 - 날짜 0뽀</a></summary>
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

### [Is Null](ISNULL)

<details>
<summary><a href="ISNULL/ProcessingNULL.sql">NULL 처리하기 </a> - 23/11/3 0.1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>NULL 처리하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>IFNULL 사용법</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분</li>
<li>하고 싶은 말</li>
</ul>
</div>
</details>

### [Group By](GROUPBY)

<details>
<summary><a href="GROUPBY/TheTotalNumberOfAppointmentsPerDepartment.sql">진료과별 총 예약 횟수 출력하기</a> - 23/11/4 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>월로 조회 후 진료과코드로 묶어 count하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>별칭에 “” 안 붙여도 됨.</li>
<li>ORDER BY 에 별칭 사용 가능</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="GROUPBY/TotalTransactionAmountMeetsTheCondition.sql"> 조건에 맞는 사용자와 총 거래금액 조회하기</a> - 23/11/2 0.5뽀 </summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>다른 컬럼명으로 JOIN하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>숫자 단위를 잘 보자! </li>
</ul>
</li>
</ul>
</div>
</details>



<details>
<summary> <a href="GROUPBY/FindProductsByPriceRange.sql"> (Hint) 가격대 별 상품 개수 구하기</a>
 - 23/11/1 0.3뽀</summary>
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
<summary><a href="GROUPBY/FindTheSameNameAnimals.sql"> 동명 동물 수 찾기 </a> - 23/11/1 0.3뽀</summary>
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
<summary> <a href="GROUPBY/HowManyCatsAndDogs.sql">고양이와 개는 몇 마리 있을까</a> - 23/11/1 0.3뽀</summary>
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
<summary><a href="JOIN/Long-termAnimal1.sql">오랜 기간 보호한 동물(1)</a> - 23/11/4 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>nullable로 조건 찾기, left join</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="JOIN/ThereWasButThereWasNot.sql">있었는데요 없었습니다</a> - 23/11/3 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>join한 테이블로 날짜 비교</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>datetime 비교하는 법</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>LEFT JOIN, INNER JOIN 기준</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="JOIN/MissingRecords.sql">없어진 기록 찾기 </a> - 23/11/2 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>LEFT JOIN, Nullable 확인 및 조회할 컬럼 설정</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>문제 표의 null 허용 여부를 잘 보고 비교할 컬럼을 선택해야 함.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>.</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>총미님도 같이 풀었다! ㅎㅅㅎ 짱짱~! 계속 같이 풀고 싶다!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="JOIN/PrintBooksAndAuthorList.sql"> (Hint) 조건에 맞는 도서와 저자 리스트 출력하기</a> - 23/10/31 0.5뽀 </summary>
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
<summary><a href="JOIN/GetSumByProduct.sql">(Hint) 상품 별 오프라인 매출 구하기</a> - 23/10/31 0.5뽀 </summary>
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
<li>SUM이 빠지면 무슨 값이 나오는 거지?</li>
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
<summary><a href="Select/ConsolidateOfflineAndOnlineSalesData.sql">오프라인/온라인 판매 데이터 통합하기</a> - 23/11/4 2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>테이블 합치고, 없는 값 null 처리</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>union 시 order by만 하나, 다른 where 등은 각각 처리.</li>
<li>union 은 중복 제거, union all은 중복 포함</li>
<li>궁금한 / 보충이 필요한 부분</li>
<li>full outer join은 이건 언제 쓰지?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>정빈님이 union 알려주셨다!!!! union, union all의 차이점과 order by는 맨 마지막 한 번만 쓴다고 공부한 게 어렴풋 기억나서 재미있었다.</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="">상위 n개 레코드</a> - 23/11/03 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>LIMIT, 서브 쿼리.</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>LIMIT 이용법</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>LIMIT 맨 아래에 보고 싶은 거 거르기<ul>
<li>order by와 함께 사용 시 top만 확인 가능</li>
</ul>
</li>
<li>서브 쿼리로 min 선택해서 min값과 같은 datetime 선택<ul>
<li>min 선택 시 해당 컬럼의 data 값 한 개만 들고 옴.</li>
</ul>
</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>정빈님과 총미님과 풀었다~~! 서브 쿼리를 좀 더 연습해야겠다.</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="Select/MemberListBornInMarch.sql"> 3월에 태어난 여성 회원 목록 출력하기</a> - 23/11/02 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>날짜 추출하는 법</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>MONTH()로 추출 가능</li>
<li>LIKE로 추출 가능</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>DATE_FORMAT 이용법</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="Select/GetRepurchasedGoodsAndMember.sql"> 재구매가 일어난 상품과 회원 리스트 구하기</a> - 23/11/2 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>GROUP BY 로 두 컬럼을 묶어서 집계 함수 사용하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>GROUP BY 로 두 컬럼을 묶고, count(*) 하면 묶인 걸 기준으로 중복 확인 가능!</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>COUNT(*), COUNT(USER_ID), COUNT(PRODUCT_ID) → 왜 이렇게 가능하고, COUNT(USER_ID, PRODUCT_ID ) 이건 왜 안 되지?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>이거 맞나? 싶은데 풀려서 신기했다..!</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="Select/PatientUnder12.sql">12세 이하인 여자 환자 목록 출력하기 </a> - 23/10/31 0.5뽀</summary>
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

