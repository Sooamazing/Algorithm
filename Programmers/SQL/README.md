# 기록
## SQL 문제 - MySQL 

<details>
<summary><a href="">문제 이름</a> - 날짜 0뽀</summary>
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
### [String, Date](StringDate)

<details>
<summary><a href="StringDate/AttachmentOfTheUsedTransactionBoardWithTheHighestNumberOfViews.sql">조회수가 가장 많은 중고거래 게시판의 첨부파일 조회하기</a> - 23/11/11 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>최대 조회수를 구하고, 해당하는 파일 명 concat으로 전부 추출하기 </li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>GROUP BY board.BOARD_ID 해서 가장 위 결과 1개만 추출됨.</li>
<li>IN/ANY/ALL 서브 쿼리에서는 LIMIT 사용 불가</li>
<li>LIMIT 1으로 한 개 행만 출력되면 = 으로 사용 가능</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>봉승님과 지원님과 함께~! 질문 게시판 보고 = 인식.. 이전에도 썼는데, IN 알게 되고 여기에만 꽂혀서 잊고 있었다... 새로 배운 걸 시험해 본다고 이전 방식을 잊지는 말아야지.</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/AverageCarRentalPeriod.sql">자동차 평균 대여 기간 구하기 </a>- 23/11/9 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>그룹 별 평균 기간 구하고, 조건 탐색</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>ROUND는 해당 자리까지만 보이게 반올림</li>
<li>GROUP BY가 SELECT 보다 먼저 실행 되지만, SELECT의 alias를 사용할 수 있음. (DBMS가 알아서 해줌. mysql 기준)</li>
<li>date - date = 그냥 20221010-20221001 = 9 integer 형으로 뺄셈됨 → DATEDIFF 사용</li>
<li>기간 구할 때는 +1 → 정빈님이 질문 게시판에 팁 알려줌!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="StringDate/AnimalWithAnElInItsName.sql.sql">이름에 el이 들어가는 동물 찾기 </a>- 23/11/7 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>문자열 포함 여부 확인하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>ike에 알파벳은 대소문자 구분 X</li>
<li>order by도 대소문자 구분 X</li>
</ul>
</li>
</ul>
</div>
</details>



<details>
<summary><a href="StringDate/UserInformation.sql">조건에 맞는 사용자 정보 조회하기 </a>- 23/11/5 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>문자를 적절히 더해 주소 나타내기</li>
<li>문자를 적절히 나눠 핸드폰 번호 나타내기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>CONCAT, SUBSTRING</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>정규 표현식</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>총미님, 정빈님, 지원님이랑 같이 했다! 즐겁다 ㅎㅅㅎ</li>
</ul>
</li>
</ul>
</div>
</details>



<details>
<summary><a href="StringDate/TheStatusOfUsedTransactions.sql">조건에 부합하는 중고거래 상태 조회하기</a> - 23/11/5 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>특정 문자를 다른 문자로 변환</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>case when </li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>replace</li>
</ul>
</li>
</ul>
</div>
</details>


### [Is Null](ISNULL)

<details>
<summary><a href="ISNULL/MembersWithoutAgeInformation.sql">나이 정보가 없는 회원 수 구하기 </a> - 23/11/8 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>sum, count, null의 관계</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>count<ul>
<li>null 포함해서 count함</li>
<li>null인 경우 1 반환해 count도 가능</li>
</ul>
</li>
<li>sum<ul>
<li>sum( is null ) is null은 true/false 1/0 반환</li>
</ul>
</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>집계함수 등에서 null의 처리</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>과거의 정빈님에게 여러 방식으로 푸는 법을 열심히 배웠다!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="ISNULL/IDOfTheAnimalWithAName.sql">이름이 있는 동물의 아이디 </a> - 23/11/8 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>NAME이 비어있지 않은 곳 출력하기</li>
</ul>
</li>
</ul>
</div>
</details>

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
<summary><a href="GROUPBY/SalesByCategoryByAuthor.sql">저자 별 카테고리 별 매출액 집계하기</a> - 23/11/10 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>세 개의 테이블 JOIN 후 총액 구하기</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>영민님, 봉승님, 정빈님, 지원님 &gt;&lt;~! ㅎㅎㅎ 슥삭슥삭 풀었다~!~!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="GROUPBY/CountingBookSalesByCategory.sql">카테고리 별 도서 판매량 집계하기</a> - 23/11/7 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>카테고리 별 도서 판매량을 합산하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>.</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>봉승님 정빈님이랑 지원님 &gt;&lt; 이랑 같이~.~</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="GROUPBY/DistinguishWhetherCarRentalIsAvailableRentalInTheCarRentalRecord.sql">자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기</a> - 23/11/7 2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>case로 조건 분기, case 내에서 걸러주기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>subquery를 case when in( ) 사용하기</li>
<li>group by 후 select에서 group by 컬럼으로 이용하지 않으면 대표값으로 이용되는 점 주의!</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>between 포맷 통일되면 가능 ? dateformat은 가능</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="GROUPBY/theMostFavoriteRestaurantInformation.sql.sql.sql">즐겨찾기가 가장 많은 식당 정보 출력하기</a> - 23/11/6 2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>그룹 별 가장 많은 favorite 출력하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>WHERE IN 으로 서브 쿼리 사용법</li>
<li>집계함수를 사용한 컬럼과 groupby 이용된 컬럼이 아닌 걸 출력하면, 연계된 결과가 아닌 각각 별개의 값이 출력됨.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>where in, 서브쿼리 사용법</li>
<li>FAVORITES이 중복인 경우 걸러주는 건?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>집계함수와 매칭하는 게 어려웠음.</li>
</ul>
</li>
</ul>
</div>
</details>



<details>
<summary><a href="GROUPBY/TotalOrderOfIceCreamDividedByIngredients.sql.sql">성분으로 구분한 아이스크림 총 주문량</a> - 23/11/6 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>같은 성분 아이스크림 구하고 합계 구하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>inner join인 경우 where로 결합 가능</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="GROUPBY/CarsWithSpecificOptionsByCarType.sql">자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기</a> - 23/11/5 0.3뽀</summary>
<div markdown="1">
</div>
<ul>
<li>문제 핵심<ul>
<li>특정 문자 포함 여부 확인하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>LIKE</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>LIKE, CONCAT</li>
<li>문제 예시 파악 후 조건 줄이기</li>
</ul>
</li>
</ul>
</details>


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
<summary><a href="JOIN/TotalSalesOfFoodProductsInMay.sql">5월 식품들의 총매출 조회하기</a> - 23/11/10 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>개수*가격으로 총 금액 구하기</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="JOIN/IceCreamsWithLotsOfOrders.sql">주문량이 많은 아이스크림들 조회하기</a> - 23/11/9 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>공통 테이블로 만들고, 그룹화해서 통계 내기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>외래 키는 기본 키를 참조 → inner join으로 풀어도 됨.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>from에서 서브쿼리 시에는 항상 별칭이 필요한 걸까?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>정빈님 지원님이랑&gt;&lt;~!~! 다른 문제 하나는 cte가 나와서 뒤로 미뤘다...~!</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="JOIN/AnimalNeuteredInAShelter.sql">보호소에서 중성화한 동물</a> - 23/11/8 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>LIKE와 NOT LIKE로 조건 확인하기</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>정빈님과 지원님과 &gt;&lt;</li>
</ul>
</li>
</ul>
</div>
</details>

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
<summary><a href="Select/ListOfRestaurantsLocatedInSeoul.sql">서울에 위치한 식당 목록 출력하기</a> - 23/11/6 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>조건으로 한 번 걸러주기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>WHERE 사용할 때도 어디 컬럼인지 표기해야 함.</li>
<li>서브 쿼리 사용하지 않고, JOIN, WHERE로도 가능</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>WHERE (infos.REST_ID)</li>
<li>LIKE ‘서울%’</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>봉승님, 정빈님, 지원님이랑 함께 풀었다&gt;&lt; ㅎㅎㅎ </li>
</ul>
</li>
</ul>
</div>
</details>


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

