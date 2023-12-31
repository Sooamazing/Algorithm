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
<summary><a href="StringDate/DistinguishBetweenLongAndShortTermRentalICarRentalRecords.sql">자동차 대여 기록에서 장기/단기 대여 구분하기</a> - 23/11/17 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>조건에 따라 문자열 치환</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/ListOfCarsWithSpecificOptions.sql">특정 옵션이 포함된 자동차 리스트 구하기</a> - 23/11/17 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>특정 문자가 포함된 row 구하기<ul>
<li>LIKE 사용</li>
</ul>
</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary>(Hint*3) <a href="StringDate/RentalAmountByCarRentalRecord.sql">자동차 대여 기록 별 대여 금액 구하기</a> - 23/11/16 5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>해당하는 할인율에 맞춰 합계 구하기<ul>
<li>컬럼에 정의되지 않은 할인율 처리 - IFNULL</li>
<li>각 대여일 구하고, 해당하는 조건 선택한 테이블과 JOIN → 이때 INNER JOIN 시 모든 할인율이 카타시안 곱이 일어나기 때문에 OUTER JOIN 필요</li>
</ul>
</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>JPA에서는 서브쿼리 있을 때, 포함해서 1개를 날리는 건가? 아니면 서브쿼리  + 메인 쿼리로 날리는 건가?</li>
<li>CTE랑 서브쿼리랑 동작 및 성능 ?</li>
<li>union all 의 동작방식? <ul>
<li>CASE WHEN 사용시 컬럼 1개마다 한 번 실행됨으로 효율이 별로라서 UNION ALL이 더 빠르다고 함 → 정말인가? cache?</li>
</ul>
</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>db는  row를 최대한 다 거르고, select에서 해당하는 걸 선택하는 방식으로 생각해야 하는 것 같다.. row 별로 수행을 하는 거니까 rowNum? 해당 row에 원하는 값이 다 있으면 되는 게 핵심인 거겠지..? </li>
<li>영민님 도움으로 풀었다… 나중에.. 꼭… ㅠㅠ 뚝딱뚞딱 혼자 … 풀 수 있게 되길.. ㅠㅅ. ….ㅠㅠㅠ 디비 …. 아직 디비 마인드가 장착이 되지 않았다…….</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/UncancelledMedicalAppointments.sql">취소되지 않은 진료 예약 조회하기</a> - 23/11/16 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>NULL 값 제외, 여러 조건들로 출력하기</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>컬럼명이 다를 수 있다는 것을… 생각하고, 확인하기..!</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/NumberOfProductsByCategory.sql">카테고리 별 상품 개수 구하기</a> - 23/11/14 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>앞 두 글자로만 group해 count 및 order by 진행</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>LEFT는 왼쪽부터 SUBSTRNG 진행</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/ALong-TermAnimal2.sql">오랜 기간 보호한 동물(2)</a> - 23/11/13 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>날짜 계산 후 정렬해 상위 2개만 출력하기</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>날짜 계산할 때는 datediff 사용하기!</li>
<li>inner join을 해도 어차피 out에 있는 것만 남아서 상관 없음.</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/LucyAndElla.sql">루시와 엘라 찾기</a> - 23/11/13 0.2뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>이름 리스트와 같은 이름 가진 이 출력하기</li>
<li>IN ( ) 내에 이름 넣고 찾기</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary><a href="StringDate/AListOfCarsWithRentalRecords.sql">대여 기록이 존재하는 자동차 리스트 구하기</a> - 23/11/12 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>조건에 맞게 출력하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>&quot;%Y-%m&quot;으로 월 거를 수도 있음.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>적절한 서브쿼리와 조인</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="StringDate/OrderStatusCategorizedByCondition.sql">조건별로 분류하여 주문상태 출력하기</a> - 23/11/12 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>조건에 따라 컬럼 값을 해당 단어로 정제해서 출력하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>case - end 가 한 쌍이라 () 안 묶어도 됨.</li>
<li>when - then이 한쌍</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>IF 사용!</li>
</ul>
</li>
</ul>
</div>
</details>


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
<summary><a href="GROUPBY/AShoppingBasketOfMilkAndYogurt.sql">우유와 요거트가 담긴 장바구니</a> - 23/11/16 0.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>조건 모두가 포함하는 경우 찾기<ul>
<li>DISTINCT, IN 사용</li>
</ul>
</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="GROUPBY/APlaceOwnedByAHeavyUser.sql">헤비 유저가 소유한 장소</a> - 23/11/15 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>2개 이상인 ID가 가진 모든 것 출력<ul>
<li>같은 ID로 그룹화 후 2개 이상을 거르고, 해당 아이디에 해당하는 걸 전체 출력해야 하기 때문에 SUBQUERY 이용</li>
</ul>
</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>GROUP BY와 집계 함수의 사용 → 어떤 식으로 출력될지 , 집계 함수 대상이 요구사항과 일치하는지 확인</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>(Hint) <a href="GROUPBY/InformationOnTheMostExpensiveFoodsByFoodCategory.sql">식품분류별 가장 비싼 식품의 정보 조회하기</a> - 23/11/15 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>조건 리스트 내에 포함되어 있는(IN) 카테고리에서 가장 비싼 값(MAX) 찾기 → SUBQUERY로 MAX 및 해당 카테고리 거르기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>OR 대신 IN 사용</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>from 에서 join하지 않고 단순히 , 로 묶는 건 지양하기.</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary>(Hint) <a href="GROUPBY/TheNumberOfMonthlyRentalsForCarsWithAHighNumberOfRentals.sql">대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기</a> - 23/11/15 3.5뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>결과가 0이면 제외, 조건에 맞는 데이터에서 새로운 조건에 맞춰 반환<ul>
<li>SUBQUERY로 걸러주고, HAVING에서 COUNT 수로 걸러주기</li>
<li>SUBQUERY에서 특정 조건으로 걸러준 컬럼을 이용할 때, main에서도 해당 조건이 필요하면 다시 추가하기</li>
</ul>
</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>문제 파악을 잘하자! SUBQUERY에서 사용한 조건이어도 다시 사용해야 할 수 있다!</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>11/3 도전 실패, 11/15 풂!!! 야호~!</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="GROUPBY/AdoptionTime1.sql">입양 시각 구하기(1)</a> - 23/11/14 0.3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>특정 범위 내의 시간에서 &#39;시&#39; 별로 count하기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>where, having 동작이 같다 ?<ul>
<li>미리 거르는 거기 때문에 where 고려하는 게 낫다!</li>
<li>count &gt; 2 같이 집계 함수 비교에는 having 쓰는 게 맞음.</li>
</ul>
</li>
<li>HAVING h ?<ul>
<li>HOUR 같은 함수 말고 순수한 컬럼명을 적어야 함.</li>
</ul>
</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>HAVING에 정말 함수로 계산하는 건 안 되는 건가?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>범석님, 봉승님, 영민님, 정빈님이랑 같이 풀었다!~!~! 지원님도 다 풀어내셨다~!~! 짱</li>
<li>그래도 뭔가.. 반복해서 푸니까 생각이 하나 둘씩 나긴 한다!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>(Hint) <a href="GROUPBY/NumberOfMembersPurchasingGoodsByYearMonthAndGender.sql">년, 월, 성별 별 상품 구매 회원 수 구하기</a> - 23/11/13 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>여러 조건으로 그룹화(NULL 제거) 후 다른 컬럼 수 집계해 출력하기</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>DISTINCT</li>
<li>GROUP BY 했을 때의 결과를 잘 알아야 함.<ul>
<li>group by한 컬럼과 count할 컬럼이 다른 경우 중복 여부!</li>
</ul>
</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>범석님, 봉승님, 영민님, 정빈님, 총미님이랑~!~!~! 지원님은 나중에 같이 푼댔다~! 야호~!</li>
<li>distinct는 정말.. group by한 걸로 회원 수가 뽑힐 거라고 단단히 착각했지...</li>
</ul>
</li>
</ul>
</div>
</details>

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
<summary><a href="GROUPBY/theMostFavoriteRestaurantInformation.sql">즐겨찾기가 가장 많은 식당 정보 출력하기</a> - 23/11/6 2뽀</summary>
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
<summary><a href="GROUPBY/TotalOrderOfIceCreamDividedByIngredients.sql">성분으로 구분한 아이스크림 총 주문량</a> - 23/11/6 0.5뽀</summary>
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
<summary><a href="JOIN/PercentageOfMembersWhoPurchasedTheProduct.sql">상품을 구매한 회원 비율 구하기</a> - 23/11/17 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>(중복 없이 해당하는 조건 / 전체) 계산</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>변수 사용</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>영민님이랑 &gt;&lt; 와 그래도… distinct 내가… !! 해냈다!!!! </li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary><a href="JOIN/ListOfRestaurantsThatMeetTheCriteriaByGroup.sql">그룹별 조건에 맞는 식당 목록 출력하기</a> - 23/11/14 1뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>MAX COUNT인 속성에서 만족하는 인스턴스 전부 추출하기</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>Subquery에서 추출된 값이 1개인 경우  LIMIT 사용하고,  = 사용하기 (IN X)</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>(Hint*3) <a href="JOIN/RentalCostsForCarsAvailableForASpecificPeriodOfTime.sql">특정 기간동안 대여 가능한 자동차들의 대여비용 구하기</a> - 23/11/12 3뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>대여 기간 거르기: 11월 대여 제외<ul>
<li>start, end를 11/1, 11/30 부등호로 표현하려 했으나 실패 -&gt; start와 end 사이에 11월이 포함되기만 하면 제외</li>
</ul>
</li>
<li>할인된 금액 구하기: % 주의<ul>
<li>(100-discount)% -&gt; %를 빼 먹어서 5억 출력..</li>
</ul>
</li>
<li>Plan의 discount도 매핑 필요<ul>
<li>discount 매핑이 되지 않아서 90일 이상의 할인율로 결합 -&gt; &#39;30일 이상&#39; 매핑 추가</li>
</ul>
</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>JOIN ON의 ON에서 AND로 조건을 여러 개할 수 있음.</li>
<li>서브쿼리에서 정제 후 올라 오면 메인 FROM에서 다 조인하지 않고, 필요한 것만 JOIN하는 데에 의의가 있는 듯.</li>
<li>11월 대여 표현: END_DATE &gt;= &#39;2022-11-01&#39; AND START_DATE &lt; &#39;2022-12-01&#39;</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>GROUP BY 없이 HAVING 사용 시 동작 및 차이</li>
<li>discount 매핑이 되지 않았는데 왜 90일 이상의 할인율로 결합된 걸까? 맨 윗 값도 아니고 맨 아래로?</li>
<li>어떻게 쿼리를 작성하는 게 성능도 좋고 파악하기도 쉬울까.</li>
<li>GROUP BY보다 DISTINCT 사용이 더 좋은가? 왜?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>봉승님, 영민님, 지원님이랑&gt;&lt;~! 와 진짜… JOIN… 무시했는데 이렇게.. 오래 걸리다니~!</li>
<li>plan.DURATION_TYPE = &#39;30일 이상&#39; → 이것도.. 생각 못해서 서브쿼리로 생각하고 있던 걸 영민님이… 말해줬다 ㅎㅅㅎ…. ㅋㅋ….. 쉬운 방법을 꼭 먼저 생각해 보기!!!!! </li>
<li>질문 게시판 보면서 다른 사람 쿼리를 보는 건 안 하고 있었는데, 역시… 해야 하나 생각했다</li>
</ul>
</li>
</ul>
</div>
</details>


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
<summary><a href="Select/UsedTransactionCommentsThatMeetTheRequirements.sql">조건에 부합하는 중고거래 댓글 조회하기</a> - 23/11/16 0.4뽀</summary>
<div markdown="1">
<ul>
<li>문제 핵심<ul>
<li>특정 날짜 조건 찾기</li>
</ul>
</li>
</ul>
</div>
</details>

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

