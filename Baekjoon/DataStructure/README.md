# 기록

## Backjoon.자료 구조 문제

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
<summary><a href="StackSequence.java">스택 수열</a> - 23/11/20 2뽀 - 34700KB 552ms</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/1874">문제 링크</a></li>
<li>공개한 1등 기록: 15980KB 184ms</li>
<li>문제 핵심<ul>
<li>스택에 push하는 순서는 오름차순일 때, 스택으로 주어진 수열을 만들 수 있는가. 있다면 push+, pop-하는 순서 출력, 못하면 NO</li>
</ul>
</li>
<li>해결 과정<ul>
<li>while 조건: stack이 빌 때까지로 설정</li>
<li>stack의 맨 위와 todoArr 값이 같으면 일단 stack에서 pop(&#39;-&#39;), todoIdx+1 진행 → 이후 stack이 비었는데, pq는 비지 않았다면, 바로 pq 다음 값 push하는 조건 추가</li>
<li>stack의 맨 위와 todoArr 값이 같지 않으면, 먼저pq에 남아 있는 값이 더 없는지 비교 후 없다면 NO로 초기화 후 break -&gt; 조건에 걸리지 않으면pop이 불가하니 push(&#39;+&#39;) 뿐.</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>1부터 n까지임을 이용, FIFO이기 때문에 해당 숫자까지의 수를 전부 stack에 넣어야만 해당 숫자를 pop할 수 있다는 점 이용해 입력 받은 즉시 하위 숫자를 stack에 넣으며 진행 가능. 
→ 입력 받은 숫자 이하만큼(number로 어디까지였는지 저장) stack 배열에 추가, stack top과 입력받은 숫자가 같으면 pop, 같지 않으면 불가로 NO 출력 후 return, 입력 완료 후에는 계속 pop 후 char 배열인 answer 바로 출력</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다! <ul>
<li>.</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>입력과 동시에 진행하는 방법을 열심히 생각해 보자!</li>
<li>Stack 사용하지 않고, Stack 문제 풀어내기!</li>
<li>재미있게 풀었다. 이런 것만 슉슉 나오면 얼마나 좋을까~.~ 시간은 쫌 걸렸지만, 그래도 재밌으니까~</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_1874-613eb1e053d04392b52d8bf24bf827bf?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

<details>
<summary>괄호 - 23/10/29 1.5뽀 - 14908KB 148ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14224KB 120ms </li>
<li>문제 핵심<ul>
<li>&quot;(&quot; 보다 &quot;)&quot; 많아지는 순간 OUT, 끝났을 때 닫히지 않은 &quot;(&quot;가 남아 있는 경우도 OUT</li>
<li>&quot;(&quot;는 +1, &quot;)&quot;는 -1, sum이 음수가 되면 NO, <ul>
<li>끝났을 때 0인 경우 YES, 그 외는 NO</li>
</ul>
</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>StringTokenizer &quot;&quot; 구분해 출력하려 했지만 실패 -&gt; String .split 사용, StringTokenizer는 구분자가 문자 1개 이상이어야 함.</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>str.toCharArray()로 char배열로 변환</li>
<li>“(”이 과반 이상인 경우도 OUT</li>
<li>replace(&quot;()&quot;, &quot;&quot;); 이용</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>StringTokenizer 구분자</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>처음에 flag로 조건을 나눌 수 있었다! flag가.. 진짜 유용한 발상이다.</li>
<li>쇠파이프 문제랑 비슷했다...! 하위 호환인거 같긴 하지만, 그땐 감도 못 잡았는데, 풀어내서 기뻤다^_^!!!</li>
</ul>
</li>
</ul>
</div>
</details>