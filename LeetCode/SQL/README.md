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
<summary>M - <a href="1193_MonthlyTransactionsI.sql">Monthly Transactions I</a> - 23/11/19 2뽀</summary>
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
<summary>M - <a href="570_ManagersWithAtLeast5DirectReports.sql">Managers with at Least 5 Direct Reports</a> - 23/11/18 1뽀</summary>
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