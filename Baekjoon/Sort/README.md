# 기록
## 정렬 문제


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
<summary><a href="Statistics.java">통계학</a> - 23/11/19 4.5뽀 - 72804KB 804ms</summary>
<div markdown="1">
<ul>
<li><a href="https://www.acmicpc.net/problem/2108">문제 링크</a></li>
<li>공개한 1등 기록: 14608KB 164ms</li>
<li>문제 핵심<ul>
<li>산술평균(반올림 구하기), 중앙값, 최빈값(정렬), 범위 출력하기</li>
</ul>
</li>
<li>해결 과정<ul>
<li>산술 평균 - <code>(double) sum / length</code> 로 소수 계산 후 Math.round로 반올림 (String.format으로 하면 -0 출력)</li>
<li>중앙값 - length / 2 (모두 홀수라 가능)</li>
<li>최빈값 - 입력 시부터 Map에 해당 숫자(Key)와 해당 숫자를 count한 수(Value)를 짝지어 넣은 후, Value로 내림차순, Key로 오름차순함. 2개 이상이면 두 번째 값 출력.</li>
<li>범위 - 정렬 후 arr[N-1] - arr[0] 계산</li>
</ul>
</li>
<li>다른 코드 감상 및 배울 점<ul>
<li>sort 이용하지 않고, 입력 for에서 max, min 찾고, 해당 자리 count 배열에 개수 추가 후 두 번째 for에서 min-max 범위에서 count &gt; n/2 이면 중앙값, count 최댓값 찾으며 flag 이용해 두 번째 값 찾아주기.</li>
</ul>
</li>
<li>궁금하다! 더 공부하고 싶다!<ul>
<li>중앙값을 지나쳤을 때, median 중복이 두 개 이상이면 무조건 그게 최빈값인가..? 왜 이 조건이 가능하지?</li>
<li>String.Format은 왜 -0으로 출력되는가.</li>
<li>Generic, wild card 사용(extends, super), comparator, comparable, compareTo 의미 및 사용법</li>
<li> > 0, < 0일 때 정렬 원리 개념</li>
<li>Map에서 value로 정럴하면 value가 같을 때 key는 원래 순서 그대로 정렬되는 건가?</li>
<li>EntryList 사용법, LinkedList&lt;&gt;(map.entrySet()) 의미(→ 이게 초기값 설정? iterator로 돌면서 각 set를 list idx와 매핑..해? 변환?)</li>
<li>SortedMap, LinkedHashMap 사용법</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>미뤘던 정렬을 그래도… 간단하게 람다만이지만! 공부했다! 정렬하는 법, 반올림하는 법을 알았다!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_2108-a56aac6c007549da85a8d42ac91c3f09?pvs=4">노션 링크</a> - 다른 코드 및 틀린 코드 확인</li>
</ul>
</div>
</details>

<details>
<summary>수 정렬하기 2 - 23/11/5 0.5뽀 - 157648KB 1784ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 44816KB 628ms</li>
<li>문제 핵심<ul>
<li>빠른 정렬</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>PriorityQueue로 정렬</li>
<li>시간 제한 해결 위해 BufferedReader, StringBuilder 사용</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>read() 구현 및 배열에 저장 후 true 값 출력(자동 정렬)</li>
<li>Arrays.stream(arr).forEach(System.out::println); 이용</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>PriorityQueue 정렬 방식</li>
<li>효율적인 정렬 방식</li>
<li>pq 이용! Arrays.sort가 더 빠름. 왜지? </li>
</ul>
</li>
<li>~칭찬~<ul>
<li>뚝딱~ 풀었지~! 시간은 늦지만~! pq를 사용한 점도 뿌듯!</li>
</ul>
</li>
</ul>
</div>
</details>