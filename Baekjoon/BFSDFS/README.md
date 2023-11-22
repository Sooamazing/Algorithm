# 기록
## BFS, DFS 문제


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

------------



<details>
<summary><a href="">쉬운 최단거리</a> - 23/11/22 1뽀 - 53648KB 652ms</summary>
<div markdown="1">
</div>
<ul>
<li><a href="https://www.acmicpc.net/problem/14940">문제 링크</a></li>
<li>공개한 1등 기록: 31152KB 440ms</li>
<li>문제 핵심<ul>
<li>최단 거리는 BFS 사용, 목적지에서의 거리 출력는 visited 처리로 처리</li>
</ul>
</li>
<li>해결 과정<ul>
<li>순차적으로 가야 하기 때문에, 갔던 곳을 visited해야 재방문하지 않고, 시작점은 0 처리</li>
<li>원래 갈 수 있는 땅인 부분 중에서 도달할 수 없는 위치는 sb로 출력 시 -1 처리</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>입력 시 시작을 0, 갈 수 있는 곳이면 -1로 저장하고, result 배열 내의 값을 아예 별개로 queue에 depth 자리를 할당해 0부터 시작해서 이전 depth 값 +1로 처리 → 어차피 해야 할 로직이고, que에 넣을 때 depth 한 자리 더 넣는 건 문제가 되지 않고, sb에 넣을 때가 아니라 result 자체를 바꿔줬다는 점에서 좀 더 나은 듯.</li>
<li>String s = br.readLine(); map[i][j] = s.charAt(j * 2) - &#39;0&#39;; → StringTokenizer 대신 Stirng 그대로 이용</li>
<li>Point 객체 사용!!! → Point[] arr = new Point[]; arr[i] = new Point(x, y);</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>reader.skip(1), writer, switch 문 이용, 상수 이용(Integer.MIN_VALUE + 2 같이 이용 → 왜 이렇게 했을까?) </li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>우왕!!! 스터디에서 프로그래머스 말고! 이걸로 하는데! 아주! 좋다!!! 진짜 오랜만에 후딱 자신감 있게 풀었지~!~!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_14940-361ef44885844a269ae9259ea2739733?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</details>


<details>
<summary><a href="NumberOfConnectionElements.java">연결 요소의 개수</a> - 23/11/16 1.5뽀 - 113712KB 520ms</summary></summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/11724">문제 링크</a></li>
<li>공개한 1등 기록: 14088KB 120ms</li>
<li>문제 핵심<ul>
<li>연결된 곳을 다 탐색하고, 연결되지 않은 곳의 개수 찾기</li>
</ul>
</li>
<li>해결 과정<ul>
<li>연결 요소의 개수란 결국 이어지지 않은 걸 구해야 하기 때문에, bfs로 풂. - queue 연습 위해 bfs 선택</li>
<li>i → j 갈 수 있으면 true인 2차원 배열, 노드 별 visited 확인하는 배열로 bfs 진행</li>
<li>bfs 한 번 할 때마다 1 반환해 cnt에 더하고, cnt는 떨어진 연결 요소의 개수</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>union find 구현</li>
<li>간선의 두 노드가 이미 같은 그룹이면 skip - 간선의 두 노드가 다른 그룹이며 합치고, 두 그룹이 합쳐져서 하나의 그룹이 되었기에 전체 그룹의 개수는 1감소</li>
<li>List < List < Integer> &gt; 이용</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li><a href="https://gmlwjd9405.github.io/2018/08/31/algorithm-union-find.html">[알고리즘] Union-Find 알고리즘</a></li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>역시 그래프에 취약하다.. 좀 더 공부해야만…</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_11724-17716061f6f9466ea118c0a193c83511?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

<details>
<summary>(Hint*5) 벽 부수고 이동하기 - 23/11/3 7뽀 - 224548KB 1512ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 117336KB 412ms</li>
<li>문제 핵심<ul>
<li>부쉈을 때와 안 부쉈을 때를 나눠서 방문 처리하기.</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>힌트 완전 참고 -&gt; 3차원 배열 개념</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>조건을 섬세하게 나눠서 2차원 배열도 가능</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>조건 나누는 법 공부하기!</li>
<li>3차원 배열 공부하기..!</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>도전을 했다는 점이 가상하다...</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>바닥 장식 - 23/11/2 1.5뽀 - 14256KB 124ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14212KB 120ms</li>
<li>문제 핵심<ul>
<li>이전 값과 같은 값 찾아서 처리하기!</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>같은 값 찾아주기 -&gt;  if-for 로 해결</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>아예 다음 값과 바로 비교해서 조건 분기할 수 있음</li>
<li>boolean 이용해 같은 값인지 판별</li>
<li>이중 for문 하나에 if로만 넣어서 구하기</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>좀 더 효율적으로 비교하는 방식이 있을까?</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>그래도 조건 비교하는 거 생각해서 바로 만들기는 했다..!</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary> 나이트의 이동 - 23/11/2 3뽀 - 85092KB 392ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 65580KB 260ms</li>
<li>문제 핵심<ul>
<li>기본 bfs와 차이는 dxdy 좌표 설정하는 방법</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>idx 에러<ul>
<li>입력 시 idx → 2부터 N+2까지..!</li>
<li>idx error가 방지 위해 N+4 크기 설정</li>
<li>idx error 발생해 한 케이스씩 돌려 보니 que 초기화 문제인 걸 발견 → 지역 변수로 초기화해서 오류난 것, 전역 변수 초기화로 해결</li>
</ul>
</li>
<li>depth 찾기<ul>
<li>재귀에서 파라미터 넘겨주는 것처럼 que에 저장할 때 해당 depth+1로 넘겨줌!</li>
<li>depth를 출력하는 위치에 따라 cnt, cnt+1 결정.</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>bfs 내에서 queue를 이용, 파라미터로 start x,y 받는 걸로 대부분 구현</li>
<li>int[]로 cnt[px][py] 해당 위치의 숫자를 cnt로 이용 -&gt; 이건 역시 N+4 선언으로 해결하려면 까다로움.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>메서드로 구현한 게 이 로직을 따로 빼 주는 것 외에는 별 의미가 없는 건지? (재귀와 비교할 때, 재귀는 메서드로 빼는 이유를 알겠는데, 이건 모르겠음.)</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>답들이 생각한 거의 그대로여서 뿌듯했다~.~ int[][]로 cnt 값 이용하는 것도 고민해 본 거라 뿌듯!</li>
<li>오. queue 사용법 조금은 알 거 같은 기분? 최근에 Queue int[] 로 사용하는 걸 알게된 게 큰 수확이었다.</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>바이러스 - 23/11/1 2.5뽀 - 14320KB 128ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 13944KB 116ms</li>
<li>문제 핵심<ul>
<li>stack 이용</li>
<li>node로 연결되어 있어서 해당 숫자 담는 1차원 배열 1개와 그래프 방문 가능한지 담은 배열로 갈 곳 탐색</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>배열로 주어지지 않아서 그래프 탐색을 어떻게 해야 할지</li>
<li>DFS와 BFS 문제 떠올리며 각 노드 배열에 방문 처리!</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>Map - Integer, List<Integer>&gt 등 이용하는 법! </li>
<li>그래프에 방문처리할 필요 없이 nodeArr에만 하면 됐음</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>배열로 주어지지 않는 그래프 탐색 연습</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>희미한 정신을 붙잡고 풀이를 떠올렸다!~!~!~!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>유기농 배추 - 23/10/31 1뽀 - 16580KB 156ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14292KB 124ms</li>
<li>문제 핵심<ul>
<li>DFS 진행된 구역이 몇 개니? (섬의 개수와 같은 듯)</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>wow 진짜 하나도 안 막히고 풂..!</li>
<li>테스트 케이스를 여러 개 돌리면 맨 아래에 엔터 추가해 주면 좋음! → 그러지 않으면 테스트 케이스 이미 돌아간 게 출력된 후에 엔터 치고, 그러면 마지막 출력만 분리됨. 저번에도 이런 일이 있었지..</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>dfs 함수 들어오자마자 방문 처리해 주면, 본문과 for문 내에서 각각 방문 처리하지 않고 단번에 처리 가능. </li>
<li>queue로 구현해 보기..!</li>
<li>dfs 함수 내 dxdy 선언하지 않고 범위 나눠서 풂</li>
<li>무조건 dfs 입장 후 처음에 범위 벗어나는지 검증, boolean 반환해서 true면 answer+1;</li>
<li>|+, ~ 등 이용<pre><code class="lang-java">int BIT = <span class="hljs-number">6</span>, MASK = ~(<span class="hljs-number">-1</span> &lt;&lt; BIT);
<span class="hljs-section">state</span> &amp; MASK
</code></pre>
</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>System.in.read()로 구현</li>
<li>비트연산자 이용해서 푸는 법</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>와.. dfs는 정말 최고다.... 진짜로 슉슉 풀어서 넘 뿌듯했고 재밌었다... 이제 이건.. 좀 더 높은 단계 풀어봐도 될 듯...</li>
<li>이제 진짜... read(), 비트 연산자를.. 슬슬... 공부할 때가 온다....</li>
</ul>
</li>
</ul>
</div>
</details>



<details>
<summary>(Hint*3) 미로 탐색- 23/10/30 4.5뽀 - 14596KB 132ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14528KB 124ms</li>
<li>문제 핵심<ul>
<li>최소 거리를 구하는 문제 -&gt; BFS</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>DFS -&gt; DP 로 접근했으나 힌트 확인 후 BFS...! -&gt; 거의 확인하면서 함...</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>que 사용법</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>BFS, DFS를... 잘 모르고 있었다... 왜 최단 거리에는 BFS인지!</li>
</ul>
</li>
<li>~어쩌구~<ul>
<li>발상은 꽤나... 근접했으나 BFS로 구현한 적이 거의 없어서 상상을 못했다.. 아자~!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary> (Hint) 토마토 - 23/10/23 3.5뽀 - 248312KB 1700ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 65960KB 296ms</li>
<li><p>문제 핵심</p>
<ul>
<li>해당하는 다수의 점에서 동시에 탐색을 시작하는 것이 관건</li>
<li>얼마 만에 다 탐색했는지 cnt, 방문하지 않은 곳 있다면 -1 출력</li>
<li><p>-1, 1은 이미 방문한 곳 처리</p>
<ul>
<li>이때 boolean[] 기본이 false이므로 0인 곳을 갈 곳 true 처리 및 1인 곳 que에 담기</li>
</ul>
</li>
<li><p>dfs 내부</p>
<ul>
<li>모두 방문한 곳이면 return</li>
<li>que가 빌 때까지 갈 곳이면 방문했다는 처리 후 새로운 que에 담기</li>
<li>que가 비었는지 확인<ul>
<li>비었으면 return(더이상 갈 곳이 없으므로)</li>
<li>비지 않았다면 새로운 que, depth+1 전달하며 dfs 실행,</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
<li><p>어려웠던 부분 해결</p>
<ul>
<li>처음에 queue 순서랑 empty인 경우 조건 설정하는 법이 헷갈려서 다른 방법 확인 위해 힌트 확인 -&gt; que 이용</li>
<li>if문 위치가 중요 -&gt; 그래야 처음부터 다 익은 경우 등 출력 가능</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>숫자 활용 - 기존 익어있는 곳에 +1 하면서 max 찾을 수 있음. </li>
<li>while 내에 들어가는지, 들어가지 못하는 걸로 분기 나눠 return 가능</li>
<li>처리해야 하는 토마토 개수 세서 조건 설정</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>자꾸 queue, 재귀 같이 사용 -&gt; queue 제대로 사용하는 법 알기</li>
<li>분기 나누는 법</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>^_^ 아자!!!!! 생각을 좀만 더 촘촘하게 해 보자~!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>안전 영역 - 23/10/10 4뽀 - 82596KB 612ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 16020KB  208ms</li>
<li>문제 핵심</li>
<ul>
    <li>DFS 들어간 횟수 구하기 </li>    
    <li>방문 조건 외에도 계속 달라지는 height 비교 조건 추가 </li>  
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>2차원 배열 초기화</li>
    <ul>
        <li>Arrays.fill(); for문 돌려 초기화</li>
    </ul>
    <li>조건 설정의 중요성 → 우선 print로 동작 다른 부분 확인, 추후 구조화하고 풀기!(오늘은 아팠다.)</li>
    <ul>
        <li>4 방면 탐색할 때 임시 변수 선언하지 않아 오류</li>
        <li>해당하는 곳인데 방문 처리 안 하고 돌아서 오류</li>
        <li>height 범위 설정 헷갈려 오류(완전 반대로…해버린 초반) </li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>for문 내에서 boolean[] 그냥 new로 초기화 가능</li>
    <li>상하좌우 좌표를 이차원 배열에 총 4쌍 넣어놓고 사용 시 for-each문으로 작성 가능.</li>
    <li>height를 static 필드로 처리 시 dfs(i,j) 유지 가능</li>
    <li>max-height가 1일 때 바로 result=1하고, boolean 배열을 height 기준 높으면 true 저장해 true인 곳만 dfs 돌기</li>
    <li>dfs가 1 return해 cnt에 계속 더하기</li>
    <li>변수 처리 안 하고, x+dx[i]로 범위 확인하고 그대로 파라미터에 넣음</li>
    <ul>
    <li>파라미터에 그냥 넣는 건 아직 depth 정도만 가능. 잘 활용하지 않게 됨.</li>
    </ul>
    <li>모든 걸 true 처리할 필요 X (N+2 크기로 선언해도 조건 설정 잘하면 됨)</li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>딱히 없음.</li> 
</ul>
<li>~칭찬~</li>
<ul>
<li>최댓값 비교시 Math 함수 드디어! 사용해 봄! </li>
<li>초기화하는 곳, dfs 파라미터 포함 꽤 깔끔하게 짠 거 같아서 뿌듯. </li>
<li>디버깅 시 print 적절한 위치에 넣어서 기대와 다르게 동작하는 부분 잘 파악할 수 있었음.</li>
</ul>
</ul>
</div>
</details>

