# 기록
## Backjoon.DivideAndConquer 문제 

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
<summary>(Hint) <a href="Multiplication.java">곱셈</a> - 23/11/21 3뽀 - 14180KB 128ms</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/1629">문제 링크</a></li>
<li>공개한 1등 기록: 14100KB 116ms</li>
<li>문제 핵심<ul>
<li>빠르게 거듭 제곱하기, 범위를 넘어갈 때 처리하는 방법, 분할 정복으로 시간복잡도O(logN)까지 줄이기→ 지수 + 모듈러 법칙 이용</li>
</ul>
</li>
<li>해결 과정<ul>
<li>A = (A * A) % C → 역시나 시간 초과</li>
<li>분할 정복 힌트 확인 → 분할 정복 정의 보고 구현해 봤으나 나눗셈 계산에서 틀림.</li>
<li><a href="https://www.acmicpc.net/board/view/127872">질문 게시판</a> 확인 → 우선 최하단 (1)까지 내려간 후 올라오면서 나누는 수가 홀수/짝수인 경우로 나눠서 각 return 값을 2번 곱할지, 거기에 *A%C도 해 줄지 조건 분기로 구하기.</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>BigInteger 타입 → A.modPow(B, C)으로 사용 가능</li>
<li>재귀 대신 while 이용 </li>
<li>dp 배열 사용</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>getBinary(b), getRemainder(a, c), getAnswer(c) 각각 사용하는 건 어떻게 하는 거지?</li>
<li>모듈러 연산, 지수 이용하는 법</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>분할 정복 조건 설정과 %C 연산을 해 줘야 하는 곳 결정하는 게 어려움.</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_1629-43af865c489241b38979f0fbf7212b09?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>