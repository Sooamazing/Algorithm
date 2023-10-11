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

