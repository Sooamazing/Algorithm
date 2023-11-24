# 기록
## Backjoon.투 포인터 문제

<details>
<summary><a href="">문제 이름</a> - 날짜 0뽀 - 성능</summary>
<div markdown="1">
<ul>
<li>- [문제 링크]() </li>
<li>- 공개한 1등 기록: </li>
<li>- 추정 시간 복잡도: </li>
<li>- 문제 핵심</li>
<li>- 해결 과정</li>
<li>- 다른 코드 감상 및 배울 점</li>
<li>- 궁금하다! 더 공부하고 싶다!</li>
<li>- 하고 싶은 말</li>
<li>- [노션 링크]() - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

-----

<details>
<summary><a href="Solution.java">용액_2467</a> - 23/11/24 1.5뽀 - 29116KB 364ms - 56등 ^_^..!</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/2467">문제 링크</a></li>
<li>공개한 1등 기록: 17088KB 196ms</li>
<li>문제 핵심<ul>
<li>투 포인터 이용해 조건에 맞는 수에 가까워질 때까지 찾기</li>
</ul>
</li>
<li>해결 과정<ul>
<li>0과 가까운 수 → abs 이용해서 비교, 가장 가까운 수면 저장해서 비교</li>
<li>특성값(합) &lt; 0 면 무조건 left ++, 특성값(합) &gt; 0 면 무조건 right-- (음수 양수 혼합, 모두 음수, 모두 양수일 때도 동일)</li>
<li>이진 탐색 → l, r 하나씩 위치 조정 필요해서 투포인터구나!</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>어차피 0 포함 0과 가까우면 저장해 주니, 0일 때 break하지 않고, 그냥 끝까지 진행</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>이분 탐색으로 하는 법..!</li>
<li>이분 탐색과 투포인터 구분?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>두 용액이랑 똑같다 했더니… 정말…이었고, 심지어 두 용액이 더 어려운 문제였던 게 웃기다 ㅎㅎ…… 정렬하는지 아닌지의 차이긴 하지만…</li>
<li>역시 투포인터 문제를 더 풀어봐야 할 듯. 아직 이진 탐색과 구분하는 법도 어렵다.</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_2467-a3f8f90f3dfa4859989b642e7a85f8d8?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

<details>
<summary>(Hint*3) <a href="Budget.java">예산</a> - 23/11/18 3뽀 - 15228KB 164ms</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/2512">문제 링크</a></li>
<li>공개한 1등 기록: 14264KB 136ms</li>
<li>문제 핵심<ul>
<li>근접한 것 중 가장 큰 값 찾기</li>
</ul>
</li>
<li>해결 과정<ul>
<li>투 포인터 이용</li>
<li>투포인터에서 r, l, m 중 어떤 걸 언제 출력해야 할지 감이 잡히지 않음. → 결국 정답 게시판 참고해 풂</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>left&lt;=right 동안 r 대신 l-1 출력도 가능</li>
<li>left &gt; right면 max 결과에 저장, sum &gt; M일 때, max에 max 저장, sum ≤ M 이면 mid 저장,  mid - 1 / +1</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>mid - 1 / +1 → 그냥 mid만 할 때랑 이렇게 -1, +1할 때는 어떤 상황 차이?</li>
</ul>
</li>
<li>하고 싶은 말 <ul>
<li>이분 탐색… 어렵다…ㅠㅅ ㅠ…</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_2512-4008c960a1b5443db7c34d240d31020e?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

<details>
<summary>(Hint) 두 용액 - 23/10/20 3.5뽀 - 28672KB 400ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 15932KB 184ms</li>
<li>문제 핵심<ul>
<li>투 포인터, 두 수의 합이 음수인지 양수인지에 따라 leftPtr, rightPtr의 이동 결정하기</li>
<li>0에 가까운 수를 출력하는 거라 Math.abs 이용</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>이분 탐색으로 mid 이용했지만 틀렸습니다!<ul>
<li>원래 푼 방식인 한 번 이분 탐색 도는 걸로는 최소를 장담할 수 없음.</li>
<li>힌트 확인 후 음수, 양수인지 비교해 투 포인터로 풂.</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>출력시 printf 사용!</li>
<li>2_000_000_000 - 숫자 리터럴, 정수 상수 표현.</li>
<li>while (s != e), Math.abs(sN) &gt;= Math.abs(eN), 조건문 비교 참고. </li>
<li>sum==0일 때 break 추가.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>left, right 포인터의 조건 설정!</li>
<li>결국 루프를 하나 다 돌면서 이분 탐색이라 상위권은 투포인터로 푼 건지? 시간 복잡도는 N*logN ? <ul>
<li><a href="https://yanoo.tistory.com/97">이분 탐색으로 푼 코드</a>  참고</li>
<li>루프를 줄이는 방법은 없나? 꼭 다 돌아야 하나?</li>
</ul>
</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>힌트를 조금만 보고 풀어보려 노력했지만, 이분 탐색이라는 굴레에 갇혀버려서... 투포인터는 전혀 떠올리지 못했다... 카테고리에 집착하지 말고 풀 수 있는 대로 ... 생각하자!</li>
<li>솔직히 오늘 좀 풀기 싫었고, 힌트도 봤지만, 얽매이지 말자는 걸 배웠다!</li>
</ul>
</li>
</ul>
</div>
</details>