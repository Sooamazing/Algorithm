# 기록
## BFS, DFS 문제


<details>
<summary>문제 이름 - 날짜 0뽀 - 성능</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: </li>
<li>문제 핵심</li>
<ul>
    <li></li>    
    <li></li>  
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li></li>
    <ul>
        <li></li>
    </ul>
    <li></li>
    <ul>
        <li></li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li></li>
    <li></li>
    <li></li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li></li>
    <li></li>
</ul>
<li>~칭찬~</li>
<ul>
<li></li>
<ul><li></li></ul>
</ul>
</ul>
</div>
</details>

------------

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

