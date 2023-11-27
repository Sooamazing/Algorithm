# 기록
## Backjoon.Graph 문제


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

--------

<details>
<summary>(Hint) <a href="LetsGoOnATrip.java">여행 가자_1976</a> - 23/11/27(, 24) 4뽀 - 18280KB 188ms</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/1976">문제 링크</a></li>
<li>공개한 1등 기록: 14280KB 128ms</li>
<li>문제 핵심<ul>
<li>계획한 도시를 방문할 수 있는지 → 끊어져 있는지 확인 → union-find 이용</li>
<li>union-find로 root 구한 후 방문하고자 하는 도시의 root가 다르면 방문 불가 처리 (union-find 구현을 몰라 hint 확인)</li>
</ul>
</li>
<li>해결 과정<ul>
<li>이중 for문에서 j = i+1 설정 시 돌리면 한 번 더 root가 바뀌면 반영되지 않음 -&gt; union &amp; find에서 i, j 둘 다 같을 때 빼고 graph 전부 돌려줌.</li>
<li>런타임 에러 (ArrayIndexOutOfBounds), 이유 → union[i] = i; M이 아니라 N으로 초기화</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>입력 받을 때부터 갈 수 있는 곳이면 union 진행</li>
<li>plan 받을 때, 굳이 prev = next를 하지 않고, 그냥 prev를 for 바깥에서 한 번 하기만 해도 됨. 어차피 plan의 모두가 일치해야 해서.</li>
<li>find에서 어차피 x를 반환하기 때문에 root 배열 초기화를 -1로 해도 상관 X</li>
<li>한 번만 이어져 있으면 돼서 dfs 사용해도 됨. plan 0번째 dfs 이후 다음부터 for 돌면서 visited되지 않았으면 NO 출력</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>왜 그래프 전체를 돌려야 최종 부모 노드 반영되는지, 어떻게 전체 돌리는 걸로 반영할 수 있는지</li>
<li>rank[] 배열 이용해서 union 대소 비교?</li>
<li>union(x, y)에서 x,y순서를 정해 놓으면 union 내에서 대소 비교없이 바로 저장, 순서 바뀌면 대소 비교해서 저장?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>union find로 풀어야 한다는 것만 생각하고 … 정말… 복붙했는데, 나중엔 내가 꼭… 짜 보면 좋겠다!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_1976-9292e849064a42ff99360e18fe102dcc?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>