# 기록

## Backjoon.이분 탐색 문제

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
<summary>(Hint) <a href="WriteTheIFSentence.java">IF문 좀 대신 써줘_19637</a> - 23/11/25 4뽀 - 60792KB 620ms</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/19637">문제 링크</a></li>
<li>공개한 1등 기록: 35752KB 420ms</li>
<li>문제 핵심<ul>
<li>정렬된 기준이 입력됐을 때, 해당 범위 조건에 맞는 값을 출력하기 → 정렬된 기준 내에서 범위 찾기는 이분 탐색으로 빠르게 탐색 가능</li>
</ul>
</li>
<li>해결 과정<ul>
<li>이미 정렬된 채 입력 받으니 문자열과 match하고, if 구하는 거라 판단해 map으로 구현 → 틀림</li>
<li>반례 위해 질문 게시판 참고 → 이분탐색 키워드 확인 → Arrays.binarySearch 이용<ul>
<li>그냥 sort 빼고 비내림차순이 그냥 중복 허용 오름차순이길래 LinkedHashMap 사용 </li>
<li>Map에서 if 전부 돌리는 것도 어쨌든 시간 초과날 것 같아서 이진 탐색 Arrays.binarySearch 이용, keyIdx = (keyIdx + 1) * (-1);</li>
<li>중복 제거 때문에 기존 arr에 null 이 들어가서, list에 먼저 담고 list size 맞춰 arr 생성 후 복붙 → 정답</li>
</ul>
</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>Arrays.sort(titles, Comparator.comparing(Title::getPower)); 이용,  low = mid + 1, high = mid; low 반환</li>
<li>그냥 while 에서 이진 탐색 진행</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>map에 넣고 돌린 게 왜 틀린 건지 아직도 모르겠음… LinkedHashMap 사용해서 순서도 보장이 되는데, stream을 사용 시 순서 보장이 되지 않는 건지?</li>
<li>rank[0]=&quot;BOUNDARY&quot;; → 왜 한 거지?</li>
<li>map<ul>
<li>map entrySet... 뭔지.. 공부가 필요해...</li>
<li>String, int 섞이면 map이 맞나. 다른 방법? 그냥 배열 두 개 idx 로만?</li>
<li>stream이 현재 map 순서를 보장하면서 list 만들어주는지! 확인 필요!</li>
</ul>
</li>
<li><a href="https://codingdog.tistory.com/entry/java-arrays-binarysearch-함수를-알아봅시다">java arrays binarysearch 함수를 알아봅시다.</a><ul>
<li>일치하는 숫자가 없는 경우: (해당 숫자가 들어가야 할 곳(정렬을 유지하기 위해 들어가야 할 순서, 작은 숫자와 큰 숫자 사이라서 큰 숫자의 idx) * (-1)) -1 반환</li>
<li>lower_bound:<ul>
<li>양수: 반환된 idx</li>
<li>음수: (반환된 idx+1)*(-1)</li>
</ul>
</li>
<li>upper_bound:<ul>
<li>양수: 반환된 idx+1</li>
<li>음수: (반환된 idx+1)*(-1)</li>
</ul>
</li>
<li>key가 unique하지 않은 경우<ul>
<li>(key, location)으로 만들고 binary_search 진행</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>이분 탐색인 걸 감을 못 잡겠다…</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/IF-_19637-e38736759df24253a43ac3b156cf7d8e?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

<details>
<summary>(Hint)랜선 자르기 - 23/10/27 2뽀 - 25268KB 216ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14252KB 144ms</li>
<li>문제 핵심<ul>
<li>가장 긴 랜선 기준으로 이분 탐색으로 자르고, 자른 랜선 길이를 기준으로 나머지 랜선에서 각각 나눠서 총 개수 구해 max 개수 구하기!</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>/ by zero runtime error<ul>
<li>0으로 나눌 때 에러 발생 -&gt; start 값이 0인 경우 mid가 0인 경우가 생겨서 에러 발생! -&gt; 1로 변경 (이 부분 hint)</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>bit 연산자 사용 및 boolean 변수 활용</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>start=1 이어야 하는 이유! 나무 자르기에서는 0도 됐는데!</li>
<li>start&lt;end 조건!</li>
<li>/2 대신 비트 연산자를 쓰면 더 좋은 이유?</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>로직 자체는 어렵지 않게 떠올려서 작성했다~! 조건에 대해서 조금 더 공부하고 고민할 시간 필요!</li>
</ul>
</li>
</ul>
</div>
</details>


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
