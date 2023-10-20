# 기록
## 이분 탐색 문제


<details>
<summary>문제 이름 - 날짜 0뽀 - 성능</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: </li>
<li>추정 시간 복잡도: </li>
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

-----

<details>
<summary>(Hint)나무 자르기 - 23/10/19 3뽀 - 123240KB 564ms</summary>
<div markdown="1">
<ul>
<li><p>공개한 1등 기록: 18956KB 264ms</p>
</li>
<li><p>문제 핵심</p>
<ul>
<li>정렬된 상태에서 특정 조건을 비교하며 탐색할 범위를 반씩 줄이기</li>
<li>이분 탐색이 한 개씩 조건을 변경하며 탐색하는 것보다 빠름(log(N)의 시간 복잡도를 보장)</li>
<li>최소 나무 길이 이상을 가져가야 하기 때문에, 정확하거나 근접하게 우세한 나무 길이를 구해야 함<ul>
<li>잘린 나무와 목표 양의 차의 min 값을 찾고, 그때의 중간 ptr 값을 저장해 답 도출</li>
<li>woodSum &gt;= M인 경우, min값 비교 후 아래 포인터 값 변경 및 중간 포인터 값 변경<pre><code><span class="hljs-attribute"> downPtr</span> = centerPtr + 1;
<span class="hljs-attribute"> centerPtr</span> = (downPtr + upPtr) / 2;
</code></pre></li>
<li>woodSum &lt; M인 경우, 위 포인터 값 변경 및 중간 포인터 값 변경<pre><code><span class="hljs-attribute"> upPtr</span> = centerPtr - 1;
<span class="hljs-attribute"> centerPtr</span> = (downPtr + upPtr) / 2;
</code></pre></li>
<li>위와 아래 포인터가 교차되지 않을 때까지 반복</li>
</ul>
</li>
</ul>
</li>
<li><p>어려웠던 부분 해결</p>
<ul>
<li>M만큼 구해지지 않는 등 오류 -&gt; 힌트 확인 후 문제 조건 재확인<ul>
<li>원하는 나무 길이의 범위를 고려해 long 타입 사용</li>
<li>적어도 M 중 최소 M을 구해야 해서 woodSum &gt;= M으로 변경 (이전: 큰 것과 같은 조건 따로 분기)</li>
</ul>
</li>
<li>이분 탐색 시 상하 ptr가 교차되어도 계속 진행<ul>
<li>무조건 M과 같은 게 있다고 생각해서 처리하지 않았으나, 조건 확인 후 교차되면 break하도록 조건 설정</li>
</ul>
</li>
</ul>
</li>
<li><p>순위 코드 분석 후 배운 점</p>
<ul>
<li>잘린 나무의 합이 목표M과 같다면 바로 break</li>
<li>while 조건 안에서 upPtr &gt;= downPtr 조건 설정</li>
<li>공통 로직은 최대한 뽑아서 한 번만 적기</li>
<li>for문 내 목표치 이상인 경우만 대상이기 때문에 midPtr의 최댓값이 곧 최소 차이를 의미함.</li>
<li>이분 탐색을 끝까지 하면 r (혹은 r-1)이 정답이 되는 이유<ul>
<li>근사치 포함 정답이면 이 문제에서는 l은 멈추고 r만 아래로 범위를 좁힘(while의 조건문 설정에 따라 r, r-1 등으로 진행). </li>
<li>l이 mid+1, 이후는 m보다 작아지기 때문에 r이 이전 정답이던 mid까지 내려오고, l과 r이 교차해 break, r이 정답!</li>
<li>for문으로 더하는 로직을  sum과 함께 해당 sum이 M보다 큰지를 반환하는 메서드 작성해 sum 자동 초기화 및 조건 확인 가능.</li>
</ul>
</li>
</ul>
</li>
<li><p>보충이 필요한 지식</p>
<ul>
<li>전형적인 이분 탐색 방식! -&gt; 좀 더 효율적인 방식 고민!</li>
<li>재귀로 푸는 이분 탐색</li>
<li>if 위치, r=mid / r=mid-1 일 때, 두 포인터 같은 조건 및 교차 조건 차이</li>
</ul>
</li>
<li><p>~칭찬~</p>
<ul>
<li>8월쯤 배웠던 이분 탐색 덕분에 범위를 결정하는 게 한결 수월했다. 힌트를 보고서야 조건을 제대로 봤지만, 발상 자체는 해냈다! 허투루 공부한 건 없다는 걸 느꼈지!</li>
<li>직접 글로 써서 하니까 좀더 구조화가 명확한 것 같아!!!! 역시 연필과 종이는... 대체할 수 없다...!!! </li>
</ul>
</li>
</ul>

</div>
</details>
