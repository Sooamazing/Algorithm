# LeetCode - SQL


<details>
<summary><a href="">문제 이름</a> - 날짜 0뽀</summary>
<div markdown="1">
<ul>
<li><a href="https://leetcode.com/studyplan/top-sql-50/">- [문제 링크]()</a></li>
<li>- 문제 핵심</li>
<li>- 새로 알게된 것</li>
<li>- 궁금한 / 보충이 필요한 부분</li>
<li>- 하고 싶은 말</li>
<li><a href="">- [노션 링크]()</a></li>
</ul>
</div>
</details>

-----

<details>
<summary>E - <a href="1211_QueriesQualityAndPercentage.sql">Queries Quality and Percentage_1211</a> - 23/11/22 0.5뽀</summary>
<div markdown="1">
<ul>
<li><a href="https://leetcode.com/problems/queries-quality-and-percentage/">문제 링크</a></li>
<li>문제 핵심<ul>
<li>평균 구하기<ul>
<li>SUM에서 조건문으로 1, 0 반환해서 해당하는 조건 계산하기</li>
</ul>
</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>AVG 사용하기!!!!!!!! </li>
<li>AVG 동작 과정?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>배운 걸 잘 활용하자! 다음에 AVG 활용해야지!</li>
<li>와! 영민님 정빈님이랑 같이 풀었다! ㅎㅅㅎ 좋았다! 야호!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/Queries-Quality-and-Percentage_1211-50151ce588cb40308375362494853db5?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>


<details>
<summary>E - <a href="1633_PercentageOfUsersAttendedAContest.sql">Percentage of Users Attended a Contest_1633</a> - 23/11/21 2뽀</summary>
<div markdown="1">
<ul>
<li><a href="https://leetcode.com/problems/percentage-of-users-attended-a-contest/?envType=study-plan-v2&amp;envId=top-sql-50">문제 링크</a></li>
<li>문제 핵심<ul>
<li>평균 구하기 - total 구하는 테이블과 분자 구하는 테이블이 다른 상황<ul>
<li>LEFT JOIN으로 u.user_id 별 같은 것만 붙이고, 나머지 null로 전체와 등록한 것 세기 → NULL로 붙지 않아 실패</li>
<li>total 값 한 개니까 카타시안 곱으로 JOIN해 total 구하고 count로 세기 → 정답</li>
</ul>
</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>COUNT(DISTINCT u.user_id)도 모든 u.user_id가 아님, group by를 contest로 했기 때문에</li>
<li>SELECT 절에서 subquery 사용해 total 구해서 계산해도 됨.</li>
<li>마찬가지로 FROM에서 JOIN, 이때 메인 쿼리에서 Users를 다시 JOIN할 필요 없음!!</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>왜 LEFT JOIN 시 각 users_id에 register가 null로 붙는 게 안 되지? 이러고 싶으면 어떻게 해야 하지? 안 된 이유랑 되게 할 방법</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>조건에 맞는 집계 함수 사용하고, total 구하는 게 생각보다 정말 어렵다…</li>
<li>혼자서도 열심히! 풀었다! 정리도 해냈다!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/Percentage-of-Users-Attended-a-Contest_1633-9a1fbd37da524b4685951e6b22b5cd90?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>



<details>
<summary>M - <a href="1934_ConfirmationRate.sql">Confirmation Rate_1934</a> - 23/11/20 0.5뽀</summary>
<div markdown="1">
<ul>
<li><a href="https://leetcode.com/problems/confirmation-rate/">문제 링크</a></li>
<li>문제 핵심<ul>
<li>GROUP BY 조건 외의 조건으로 집계 함수 사용 및 그 안에서 NULL 처리<ul>
<li>NULL인 id 값이 있기 때문에 기준 테이블에 left join</li>
<li>SUM(조건문) 으로 조건에 맞는 행 count, null인 경우 sum도 null이기 때문에 ifnull로 처리</li>
<li>전체 count는 COUNT(조건문), null은 전체 null이라 count(*)도 같음</li>
</ul>
</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>avg (해당하는 조건이면 1, 아니면 0 반환) (IF / CASE WHEN 사용)→ COUNT(해당하는 조건 세기) / 전체 개수</li>
<li>CASE WHEN 은 ELSE 없어도 됨, 자동 NULL 반환 </li>
<li>IF 문법: 조건 미충족이 없으면 runtime error </li>
<li>SUM 대신 COUNT(IF 조건문) 사용 시 조건문 미충족일 때 NULL 대신 0 쓰면 전체 count와 다를 바 없어서 틀림.</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>NULL에 관해서<ul>
<li>NULL만 SUM하면 NULL 출력 → IS NULL로 비교하지 않으면 무조건 NULL 출력됨.!?</li>
<li>SELECT null from user ; → user 개수만큼 null 컬럼에 null - null - null - .. 출력</li>
<li>select null from dual ; → null 한 개가 null 컬럼에 출력</li>
<li>CASE WHEN에서 ELSE 안 하면 조건 다를 때 NULL 반환?</li>
</ul>
</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>영민님이랑! 와 근데 어제랑 같은데도 … SUM, COUNT NULL 처리 직접 생각해 보려니 헷갈렸다 ㅎㅎ… 역시 계속 반복해서 사용해 봐야 한다~!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/Confirmation-Rate_1934-a63bd4988d684df48a7ec257060f4415?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>


<details>
<summary>M - <a href="1193_MonthlyTransactionsI.sql">Monthly Transactions I_1193</a> - 23/11/19 2뽀</summary>
<div markdown="1">
<ul>
<li><a href="https://leetcode.com/problems/monthly-transactions-i/?envType=study-plan-v2&amp;envId=top-sql-50">문제 링크</a></li>
<li>문제 핵심<ul>
<li>GROUP 후 GROUP BY한 조건이 아닌 다른 컬럼으로 걸러 집계 함수 사용하기<ul>
<li>COUNT, SUM 내에서 거를 수 있지 않을까? (state = &quot;approved&quot;)  → 틀림</li>
<li>무수한 틀림 끝, 결국 그룹 별 approved한 결과를 가진 table과 total을 가진 table을 total 쪽으로 outer join해 합쳐서 결과 출력</li>
</ul>
</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>결과가 없는 것과 JOIN해 0으로 출력해 주기 위해서는 있는 쪽으로 OUTER JOIN 후 메인 쿼리에서 IFNULL 처리하기</li>
<li>SUM(IF(state=&#39;approved&#39;,amount,0)) → 다른 컬럼이어도 amount를 반환하면 해당 row에 해당하는 amount고, group 별로 sum에 더해짐.</li>
<li>COUNT 대신 SUM(state = &#39;approved&#39;) 혹은 COUNT(iF(state = &#39;approved&#39;, 1, NULL)) 해도 동일</li>
</ul>
</li>
<li>궁금한 / 보충이 필요한 부분<ul>
<li>SUM(state = &#39;approved&#39;) → true / false 로 1 / 0 반환? -> O </li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>이게.. medium…? 처음에 IF로 접근한 게 정말 맞았다… 확실히… 배웠다 이제… IF와 집계 함수…</li>
<li>ROW 별로 진행된다는 점 다시 강조..!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/Monthly-Transactions-I_1193-1bffb969156e44cd852ff7e53e34778c?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>

<details>
<summary>M - <a href="570_ManagersWithAtLeast5DirectReports.sql">Managers with at Least 5 Direct Reports_570</a> - 23/11/18 1뽀</summary>
<div markdown="1">
<ul>
<li><a href="https://leetcode.com/problems/managers-with-at-least-5-direct-reports/solutions/4177373/solved-in-5-different-ways-top-2023/?envType=study-plan-v2&envId=top-sql-50">- [문제 링크]()</a></li>
<li>문제 핵심<ul>
<li>해당 테이블 내의 다른 컬럼 참조하기</li>
<li>SUBQUERY로 해당하는 내용 거르고, IN으로 같은 내용 찾기</li>
</ul>
</li>
<li>새로 알게된 것<ul>
<li>SUBQUERY도 가능하지만, SELF JOIN으로도 할 수 있음! </li>
<li><a href="https://hannanana.notion.site/Managers-with-at-Least-5-Direct-Reports_570-bfb1563bca8344828d868f5bcb6bc0ac?pvs=4">노션 링크</a></li>
</ul>
</li>
</ul>
</div>
</details>