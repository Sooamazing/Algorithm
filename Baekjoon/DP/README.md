# 기록
## Baekjoon.DP 문제

<details>
<summary><a href="">문제 이름</a> - 날짜 0뽀 - 성능</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: </li>
<li>추정 시간 복잡도: </li>
<li>문제 핵심</li>
<li>어려웠던 부분 해결</li>
<li>순위 코드 분석 후 배운 점</li>
<li>보충이 필요한 지식</li>
<li>하고 싶은 말</li>
<li><a href="">노션 링크</a></li>
</ul>
</div>
</details>

--------


<details>
<summary>(Hint) <a href="MinkyunsRuse.java">민균이의 계략</a> - 23/11/13 3뽀 - 15128KB 148ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14252KB 128ms</li>
<li>문제 핵심<ul>
<li>상자 넣기와 동일, LIS<ul>
<li>이전 숫자와 현재 숫자를 비교하고, 이전 digit dp의 최댓값에 +1 </li>
<li>이전에 조건문에서 최댓값 비교해 주는 방식 이용</li>
</ul>
</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>조건문 비교 후 업데이트하는 값이 dp[i]여야 dp[i]에 최댓값이 입력됨 -&gt; 조건문 안에서 dp[i]가 아닌 temp로 업데이트 후 모든 for문을 돈 후 temp를 넣어주면, 당연히 마지막 조건을 통과했던 그 temp가 들어가서 이전 최댓값 dp[j]로 업데이트되는 걸 보장하지 못함.</li>
<li>max에서 N 범위 설정</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>String[] temp = br.readLine().split(&quot; &quot;)로 입력 받기</li>
<li>high idx 반환하는 binSearch, ptr 구현해 구하기</li>
<li>for j=i 시작, 뒤랑 비교하며. dp[i] == dp[j], 뒤가 더 큰 경우, dp[j]++</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>dp[i] == dp[j] 이 조건이 필요한 이유</li>
<li>Arrays.binarySearch(a, t)이 어떤 걸 반환하는지 확인하고, 이용해 보기</li>
<li><a href="https://shoark7.github.io/programming/algorithm/3-LIS-algorithms">LIS의 길이를 구하는 3가지 알고리즘</a> → 이진  탐색으로 푸는 법 공부하기!</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>처음 dp의 최댓값이 아니었다는 걸 찾지 못해... 답 통과 후 지금 보니 오류가 보인다 허허...</li>
<li>… 이진탐색으로 푸는 것도 배우고, 이렇게 푸는 것도 좀 더 익힐 필요성은 있는 듯.</li>
<li>max도 그 안에서 효율적으로 구하는 걸 배우자.  </li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_11568-4ea7cfdd7d194ad29eff9e0ae96dabad?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>



<details>
<summary><a href="PinaryNumber.java">이친수</a> - 23/11/12 0.5뽀 - 14216KB 124ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14124KB 120ms</li>
<li>문제 핵심<ul>
<li>이전 digit에서 가능한 0, 1 개수에 따라 좌우됨<ul>
<li>0인 경우 1, 0 둘 다 사용 가능</li>
<li>1인 경우 이후엔 0만 올 수 있음.</li>
</ul>
</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>long 판별이 어렵다... 어떻게 long인 걸 딱 알지? -&gt; 우선 바로 90 찍어보고 범위 벗어난 것  확인 후 수정</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>피보나치….. 01타일과 동일한.. 문제...</li>
<li>D[i]=(D[i-1]-count)*2+count; </li>
<li>t, o. l 변수 세 개로 해결</li>
<li><a href="https://m.blog.naver.com/occidere/220788046159">피보나치 블로그 설명</a></li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>static 변수, 메서드를 사용하는 것과 main 내에서 하는 . 게차이가 나나?</li>
<li>call by value</li>
<li><a href="https://www.acmicpc.net/board/view/905">변수의 지역변수와 전역변수의 시간차이에 대해서..</a> - 캐시 힛 등</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>바로 피보나치인 걸 인식하지 못해서 자료형이 어려웠지만, 그래도 바로 적절하게 출력해 보고 알아챌 정도로는 성장한 거 같아서 기쁘다^_^~!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_2193-d85de49c27c5487a852b65dae2eb3f9a?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>

<details>
<summary>(Hint) <a href="TheEasyNumberOfStairs.java">쉬운 계단 수</a> - 23/11/11 3.5뽀 - 17732KB 212ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14148KB 120ms</li>
<li>문제 핵심<ul>
<li>이전 수에서 가지치기를 어떻게 해서 현재 수로 넘어오는지 구하고, 전체 수 더해주기.</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>두 번째까지만 세어 보고, 0, 9인 경우에 대해 납작하게 (dp[i - 1] * 2 - 1) 이렇게만 생각함. -&gt; <a href="https://cotak.tistory.com/12">블로그 참고</a></li>
<li>arr 정답 배열에 담을 때 += 사용해 자료형 범위 넘어가며 틀림.</li>
<li>블로그에서 이전 수에서 현재 수로 넘어올 때 선 그은 걸 보고 관계를 이렇게 맺어서 해당 수를 모두 더하면 되는 구나! -&gt; 0~9까지 하드 코딩<ul>
<li>0에서 가지치기가 되는 건지 헷갈려서 한 번 더 틀리고, 맨 처음만 안 되는 걸 다시 확인함.</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>for 내에서 if로 0,9 거르고, 마지막 dp만 sum 구해서 출력</li>
<li>Arrays.toString 사용해서 print하면 배열 내 요소 출력</li>
<li>0일때, 9일때를 나눠서 for문 내 if 두 개로 각 j-1, j+1인 경우를 한 번에 처리 가능</li>
<li>for(j = 0; j++ &lt; 10;) 사용</li>
<li>N+2하는 것처럼 앞 뒤에 공간 주고, 처음부터 끝까지 같은 점화식 사용</li>
<li>dp 전체 배열 X, 이전과 이후 저장하는 배열만 생성해 사용</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>mod 계산에 대해 추후 공부해 보기</li>
<li>int, long 최대 허용치 외우기…</li>
<li>topdwon, bottomup 구현</li>
<li>dp 내의 배열 숫자가 커질수록 내가 생각한 양상이 아니었음… 잘 생각해 보기.</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>11/4에 못 풀고, 오늘 도전, 힌트를 보고 풀어냈다.</li>
<li>좀 이해 못한 것도 있지만, 그래도 오랜만에 다른 사람 코드에서 재밌는 부분을 찾았다 ㅎㅅㅎ~!</li>
<li>블로그 글처럼.. 생각하는 게 dp 핵심같은 기분!</li>
</ul>
</li>
<li><a href="https://hannanana.notion.site/_10844-c3b16416d8b245c095040120c0dad41b?pvs=4">노션 링크</a></li>
</ul>
</div>
</details>

<details>
<summary>상자넣기 - 23/11/10 1.5뽀 - 14644KB 152ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14256KB 124ms</li>
<li>문제 핵심<ul>
<li>현재 순서보다 앞선 순서에서 작은 수를 찾고, 그 수에 저장된 (그 수보다 작은 수의 개수의 최댓값)이 가장 큰 수 +1</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>dp에 넣을 (가장 큰 dp 값 가진) 작은 수를 찾기 -&gt;  0~i까지 for를 돌리며 이전 값과 비교</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>이진 탐색 사용해 dp 배열에서 유의미한 가장 긴 부분 수열 길이 구하기</li>
<li>D[j]&gt;=D[i] &amp;&amp; S[i]&gt;S[j] 로 하면 이전 dp[j]에서 가장 큰 값에 +1하게 됨.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>LIS, <a href="https://bedamino.tistory.com/26">블로그 이진 탐색 사용 설명</a><ul>
<li>이진 탐색에서 어떤 걸 구하고자 하는 건지 확인<ul>
<li>low는 next와 같거나 가장 가까운 작은 수? high는 ?</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>그래도.. ㅎㅅㅎ 가장 긴 감소하는 수열…. 열심히 떠올려서 풀었다 뿌듯.</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>퇴사 - 23/11/9 3뽀 - 14236KB 132ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14184KB 120ms</li>
<li>문제 핵심<ul>
<li>시간을 idx로 후에 완료될 일 값과 비교하기</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>dp[i][j]: <ul>
<li>i: 시간의 흐름, </li>
<li>j: 수락한 일을 해당 일까지 완료했을 때의 받을 돈 <ul>
<li>1&lt;=j&lt;=5: 일을 수행 완료하기까지의 일수, </li>
<li>j=0: 해당일까지 받을 돈의 최댓값</li>
</ul>
</li>
</ul>
</li>
<li>입력: 각 1~5일차 뒤의 dp 배열의 해당하는 j번째에 저장</li>
<li>dp[i][0]: n일 전의 0번째 + i(당일)의 n번째 중 (총 5일 비교) 가장 금액이 큰 값을 i(당일) 0에 저장</li>
<li>idx error -&gt; -5까지 있어서 배열 크기 +5</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>... 거의 이해를 못함 .....</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>Max 값을 여러 개 비교할 수 있는 방법</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>와.. 큰일났다.. 진짜로 모르겠다........ 뭐지..? 다들 점화식을 어떻게 다 저렇게 세운 거지?</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>01타일 - 23/11/08 0.5뽀 - 22296KB 148ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14196KB 128ms</li>
<li>문제 핵심<ul>
<li>피보나치 수열</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>for 문의 종료 조건 수 +1로 배열 크기 설정해야 idx error X</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>저장하지 않고, a, b, result 변수만 업데이트, 1,2인 경우 따로 처리 필요.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>이게 어떻게 가능하지?<ul>
<li>짝수: dpn = (n / 2) <em> ((n / 2) + 2 </em> (n / 2 - 1)) % MOD; </li>
<li>홀수: dpn = (((n + 1) / 2) <em> ((n + 1) / 2) % MOD + ((n - 1) / 2) </em> ((n - 1) / 2) % MOD) % MOD; </li>
</ul>
</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>풀었던 문제랑 비슷한 유형 나오니까 슥삭..! 이래서….. 문제를 많이 풀어보는구나! 요즘 의기소침했는데, 뭔가….. 좀 자신감이 생기는 기분? ㅋㅋㅋ</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>(Hint) Four Squares - 23/11/7 4뽀 - 14572KB 148ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14272KB 132ms</li>
<li>문제 핵심<ul>
<li>제곱수인 경우 dp[i - j * j]이 dp[0]으로 출력돼 dp[i]=1이 됨.</li>
<li>j가 1부터 j*j&lt;=i(i와 같아지는 제곱수)까지 돎 =&gt; 이전 수까지 dp에 저장되어 있어서 저장된 배열로 이용 가능 <ul>
<li>0부터 j * j &lt; i까지로 하면 j=0일 때 dp[i]에 저장된 수가 0이라 계속 0만 출력됨.</li>
</ul>
</li>
<li>나머지수(=해당 수 - 제곱수)를 구하는 최소 수는 이미 dp에 있어서 어떤 제곱수를 뺀 나머지 수를 이용하는 게 더 최소를 보장하는지를 j for문에서 비교</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>dp 이해 -&gt; print로 확인</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>재귀로 dp 풀기</li>
<li>각 for에서 1,2,3,4 return</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>예시에서 만족하는 제곱수를 뽑은 것처럼 만족하는 제곱수를 전부 출력하려면 어떤 조건을 추가하면 가능하지?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>dp를 더 열심히 풀자..!</li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary>(Hint) RGB거리 - 23/11/6 2뽀 - 14600KB 132ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14140KB 120ms</li>
<li>문제 핵심<ul>
<li>이전 조건에 따른 최솟값 구하기</li>
<li>각 r,g,b 각각에서 시작해 겹치지 않게 min으로 dp 진행</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>백트래킹으로 시도했으나 풀리지 않아 dp 힌트 및 코드 확인..</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>입력 받을 때부터 dp 가능!</li>
<li>red, green, blue 상수로 이용</li>
<li>나머지 이용해 행 별로 메모이 제이션 이용 / 두 행으로 비교</li>
<li>stream으로 min 출력</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>dp 공부</li>
<li>메모이제이션 적절하게 활용하는 법</li>
<li>백트래킹으로 푼다면?</li>
</ul>
</li>
<li>하고 싶은 말<ul>
<li>...... dp를 더 공부하자.</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>(Hint*3) 가장 긴 감소하는 부분 수열 - 23/10/24 3뽀 - 14396KB 148ms </summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14108KB 124ms</li>
<li>문제 핵심<ul>
<li><a href="https://velog.io/@kmh9250/%EB%B0%B1%EC%A4%8011722-%EA%B0%80%EC%9E%A5-%EA%B8%B4-%EA%B0%90%EC%86%8C%ED%95%98%EB%8A%94-%EB%B6%80%EB%B6%84-%EC%88%98%EC%97%B4">블로그 참고</a></li>
<li>if 세 번째 수인 경우 앞선 두 번째까지의 수 중 큰 수가 존재하고, 해당 digit의 dp+1이 현재 digit의 현재 dp보다 크면 then<ul>
<li>현재 digit의 현재 dp에 해당 digit dp +1<pre><code>dp<span class="hljs-string">[i]</span> = dp<span class="hljs-string">[j]</span> + <span class="hljs-number">1</span>;
</code></pre></li>
</ul>
</li>
<li>i번째마다 현재 개수와 dp[i]의 개수 중 더 큰 값 구해서 cnt 저장</li>
</ul>
</li>
<li><p>어려웠던 부분 해결</p>
<ul>
<li>유니크한 수 구해서 수열로 만들기 set 사용 -&gt; 예제에서 dp 1 1 2 2 2 3 출력까지 도출</li>
<li>조건식 어려워서 hint 확인 -&gt; 이전 수 전체와의 비교, 그 중 저장된 dp 값이 높은 수+1</li>
</ul>
</li>
<li><p>순위 코드 분석 후 배운 점</p>
<ul>
<li>이분 탐색으로도.. 풀 수 있다...</li>
</ul>
</li>
<li><p>보충이 필요한 지식</p>
<ul>
<li>이분 탐색으로 푸는 법..!</li>
</ul>
</li>
<li><p>~칭찬~</p>
<ul>
<li>음.. 열심히 배웠다!</li>
</ul>
</li>
</ul>

</div>
</details>

<details>
<summary>1로 만들기 - 23/10/21 2.5뽀 - 18288KB 148ms</summary>
<div markdown="1">
<ul>
<li><p>공개한 1등 기록: 14292KB 120ms</p>
<ul>
<li>내 기록: Scanner 사용 시 21676KB 232ms, BufferedReader 사용 시 18288KB 148ms</li>
</ul>
</li>
<li><p>문제 핵심</p>
<ul>
<li>memoization을 이용해 dp[N]을 구하는 것이 핵심!</li>
<li>dp[i] = (i-1)번째, (i/3)번째, (i/2)번째 중 min으로 구하는 것이 핵심<ul>
<li>비교 시 i%6, i%3, i%2가 0에 해당 하는 경우에 min 비교</li>
</ul>
</li>
<li>도달하는 방법이 3가지만 있다고 알려준.. 친절한 문제였음..!</li>
</ul>
</li>
<li><p>어려웠던 부분 해결</p>
<ul>
<li>무작정 3, 2로 나눠지는 경우에 대해서만 나누려고 함.<ul>
<li>마지막에 1을 만들기 위해 점화식을 세움. -&gt; 이게 오답 원인.</li>
</ul>
</li>
<li>1~N까지 순차적으로 각 값의 min을 구하고 이용하는 방식으로 변경 -&gt; 해결</li>
</ul>
</li>
<li><p>순위 코드 분석 후 배운 점</p>
<ul>
<li>재귀 이용! 그냥 N/2, N/3 숫자 비교하는데 각각 횟수를 N%2, N%3을 더해도 가능</li>
</ul>
</li>
<li><p>보충이 필요한 지식</p>
<ul>
<li>각각 횟수를 N%2, N%3을 더해서 비교하는 게 min을 왜 보장하지..? </li>
<li>로직이 같은데, 시간 차이 이유? 재귀가 더 빠른가? 어떤 차이지?</li>
</ul>
</li>
<li><p>~칭찬~</p>
<ul>
<li>생각보다 오래 걸리고, 시간 제한 마감에 떠올라서 시간을 더 쓰긴 했지만 그래도 dp를 잘 떠올린 것 같다! 다음에는 카테고리 보지 않고도 잘 풀어낼 수 있으면 좋겠다!</li>
</ul>
</li>
</ul>

</div>
</details>


<details>
<summary>(Hint) 평범한 배낭 - 23/10/18 0뽀 - 성능</summary>
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


<details>
<summary>2xn 타일링 2 - 23/10/18 1.5뽀 - 14328KB 128ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14180KB 124ms</li>
<li>문제 핵심<ul>
<li>i-2, i-1에서 중복되는 부분 셈하기<ol>
<li>(i-2) 모음에 각각 ||, =, ㅁ을 더해 주면 2*i을 채울 수 있고, (i-2)모음 *3 개.</li>
<li>(i-1) 모음에 |을 더해 주면 이 또한 2*i을 채울 수 있음. (i-1) 모음 - (i-2) 모음 개.<ul>
<li>(i-2) 모음을 기본으로 하고, 여기에 없는 걸 (i-1)에서 더해줌.</li>
<li>기본으로 삼은 게 (i-2)이고, (i-1) 모음의 앞 부분이 (2*i-2) 모양과 같은 걸 제외해야 하기 때문.</li>
</ul>
</li>
</ol>
</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>정해진 마지막을 기준으로 그 전 단계 경우의 수 고민하기</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>(입력은 1부터라고 명시되어 있지만) 0인 경우도 1로 초기화해 점화식 2부터 진행</li>
<li>br.readline() 한 글자면 그대로 사용해도 됨.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>문제에서 10007 수로  설정한 이유?</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>지난 번에 배운 대로 생각해서 해냈다! 비교적 불필요한 코드는 넣지 않은 것 같다!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>(Hint) 구간 합 구하기 5 - 23/10/17 3뽀 - 118280KB 844ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 26792KB 312ms</li>
<li><p>문제 핵심</p>
<ul>
<li><p>(1,1)부터 해당 위치까지의 구간합을 각 배열에 구하고, 요구하는 구간만의 합을 도출하기</p>
<pre><code>//(1,1)부터 해당 위치까지의 합
sumArr[<span class="hljs-string">i</span>][<span class="hljs-symbol">j - 1</span>] + sumArr[<span class="hljs-string">i - 1</span>][<span class="hljs-symbol">j</span>] - sumArr[<span class="hljs-string">i - 1</span>][<span class="hljs-symbol">j - 1</span>] + Integer.parseInt(st.nextToken());

//최종 구간 합
int prefixSum = sumArr[<span class="hljs-string">x2</span>][<span class="hljs-symbol">y2</span>] - sumArr[<span class="hljs-string">x2</span>][<span class="hljs-symbol">y1-1</span>] - sumArr[<span class="hljs-string">x1-1</span>][<span class="hljs-symbol">y2</span>] + sumArr[<span class="hljs-string">x1-1</span>][<span class="hljs-symbol">y1-1</span>];
</code></pre></li>
<li>꼭 그림 확인하고, 부분 -&gt; 전체인 부분 고려하기!</li>
<li>어디서 어떻게 점화식을 도출할 건지 고민</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>시간 초과<ul>
<li>시간 초과날 걸 알았지만, 떠오르지 않아 for 진행 -&gt; 역시나 시간 초과라 힌트 확인 후  각 합을 구해 배열에 넣기 성공</li>
</ul>
</li>
<li>구간 합 구하기 오류<ul>
<li>그림으로 확인 안 하고, (x2, y2) - (x1-1, y1-1) 진행해 틀림 -&gt; 다른 힌트 그림 보고 구획 나눠 답 도출</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>x1, y1 받을 때 로직에서 사용하는 값은 실질적으로 -1이라 처음부터 그렇게 저장</li>
<li>상위권 대부분 read() 구현해 사용.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>read() 등 구현 및 메서드 분리</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>시간 초과 날 걸 알았지만, 답이라도 구해 보자는 마음으로! 다음에는 지금 배운 걸 열심히 기억하고 적용하기!</li>
<li>어제 합을 생각했던 만큼 조금 더 시간을 들였어도 좋았겠지만, 시간 내에 풀지 못한 건 맞으니까. 빠르게 잘 결정했다! </li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>이동하기 - 23/10/16 4.5뽀 - 77880KB 532ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 23036KB 204ms</li>
<li>문제 핵심<ul>
<li>대각선은 생각할 필요 없음.<ul>
<li>대각선으로 한 번 오는 것보다 오른쪽/아래쪽을 한 번 거쳐 오는 게 사탕을 더 많이 담을 수 있음.</li>
</ul>
</li>
<li>idx 고려</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>처음 발상 -&gt; 불확실해 단념<ul>
<li>최대 합을 구하는 거라 대각선은 의미 X</li>
<li>이동 수: N+M-2</li>
<li>dp[이동 수] = 갈 수 있는 지역의 합</li>
<li>이동 시마다 머물렀던 셀 제외 행/열의 합을 빼 주기.</li>
</ul>
</li>
<li>정답 발상<ul>
<li>위쪽/왼쪽 중 더 많은 사탕을 가진 쪽의 경로를 택하고 현재 사탕 합치기<pre><code>dpRes[<span class="hljs-string">i</span>][<span class="hljs-symbol">j</span>] = Math.max(dpRes[<span class="hljs-string">i - 1</span>][<span class="hljs-symbol">j</span>], dpRes[<span class="hljs-string">i</span>][<span class="hljs-symbol">j - 1</span>]) + candy[<span class="hljs-string">i</span>][<span class="hljs-symbol">j</span>];
</code></pre></li>
</ul>
</li>
<li>구현 시 고친 점<ul>
<li>r=1, c=1인 경우를 각각 구하고, r=2, c=2인 경우를 따로 구하면 예시 코드나 반례는 돌아가는데, 백준 1%에서 틀렸다고 나옴.</li>
<li>여기서 힌트 확인, 따로 구하지 않고, idx를 1로 설정해서 그냥 1부터 N까지 점화식 구하니 정답. </li>
<li>동기님이 알아챈 사실: dpRes 배열 이름을 candy라고 잘못 적어서 오류였음...!.. 고치고 돌리니 첫 코드도 맞았음. -&gt; ... 답이 다 나와도 내가 의도한 대로 동작하는지 확인 위해 디버깅 한번 돌려 보기..! 컴파일러가 잡지 못하는 인간오류를... 발견해야 한다...</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>r, c 1일 때는 그냥 for 한 개로 합쳐도 무방, 필요한 조건인지 꼭 생각해 보기.</li>
<li>입력 받으면서 동시에 dp 구하는 것도 가능</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>BFS가 아닌 DP인 이유? 어떤 상황에서 어떤 알고리즘이 더 적절할지 선택하는 법</li>
<li>점화식의 기준을 잘 파악하기</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>점화식 발상을 해낸 것이 장하다! 비록... 배열명을 틀려서 힌트를 봤지만, dp에 한 걸음 더 다가간 기분~.~</li>
</ul>
</li>
</div>
</details>


<details>
<summary>(Hint) 2xn 타일링 - 23/10/15 2뽀 - 14324KB 128ms </summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14204KB 124ms</li>
<li>문제 핵심</li>
<ul>
    <li>마지막 수 기준으로 그 직전 경우의 수를 구하고, 점화식으로 표현하기! - 경우의 수 조건을 잘 나누는 게 핵심!</li>    
    <li>혹은 일정한 규칙으로 조합 구해서 각 수를 구하면 피보나치 수열 등장!</li>
    <ul>
        <li>짝수, 홀수 규칙</li>
        <ul>
            <li>홀수(2n-1): n개 더하기 - C(2n-1,0)+C(2n-1-1,1)+...+C(2n-1-n+1,n-1)</li>
            <li>짝수(2n): (2n-n+1==n될 때까지) n+1개 더하기 - C(2n,0)+C(2n-1,1)+...+C(2n-n+1,n)</li>
            <details>
            <summary>1~9까지 계산</summary>
            <div markdown="1">
            1: 1           = 1 <br>
            2: 1+1         = 2 <br>
            3: 1+2         = 3 <br>
            4: 1+3+1       = 5 <br>    
            5: 1+4+3       = 8 <br>
            6: 1+5+6+1     = 13 <br>
            7: 1+6+10+4    = 21 <br>
            8: 1+7+15+10+1 = 34 <br>
            9: 1+8+21+20+5 = 55
            </div>
            </details>
        </ul>
    </ul>   
    <li>각 수열에 나머지 연산을 해도 결과는 같음!</li>
    <ul>
        <li>수 = (10007*몫+나머지)로 표현한다면 (수+수+수+…+수)%10007에서 나머지%10007만 따로 빼서 계산이 가능</li>
        <li>즉, 전체 수에 나머지 연산을 하는 건 각 수의 나머지 연산을 더한 것과 같음.</li>
    </ul>
</ul>
<li>어려웠던 부분 해결, 배운점</li>
<ul>
    <li>피보나치 수열 구했는데, 틀렸습니다! -> N이 일정 숫자 이상이면 출력값 범위를 넘어감.</li>
    <ul>
        <li>이전에는 출력 시에만 %10007했는데, 각 수열에 %10007 진행, 이 과정에서 이렇게 해도 되는지 힌트 봄.</li>
        <li>항상 범위 고민하기~!</li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>1,2인 경우 적절한 조건으로 코드 반복 X</li>
    <ul>
        <li>dp[1]=1 이후 if(n≥2)로 dp[2] 저장</li>
        <li>N+2개로 초기화해서 1,2를 아예 더하고 시작</li>
    </ul>
    <li>0,1 등 연산할 필요 없는 특정 조건이면 그냥 바로 print하고 return!</li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>조합을 이런 조건 하에 모두 더하는 게 원래 피보나치를 유도하는 공식 같은 건지? 어떻게 이게 피보나치가 나오는 건지? 아니면 조합을 구하는 자체에도 점화식을 유도할 수 있는지?</li>
    <ul>
        <li>결국 마지막은 기준으로 생각하고, 마지막에 도달하는 직전 경우의 수를 나누고, 그걸 점화식으로 표현하는 게 핵심.</li>
        <li>

[정석 - 참고한 블로그](https://kosaf04pyh.tistory.com/222)</li>
    </ul>    
</ul>
<li>~칭찬~</li>
<ul>
<li>차근차근 하나씩 계산해서 조합까지 규칙 발견하고, 어떻게 해야 하지 고민하다 혹시나 다 더했는데, 피보나치가..!!! 진짜 기뻤고, 끝까지 계산해서 규칙을 발견해야 하는구나.. .생각했다!!! 크~! -> 블로그를 보니 내가 구한 건 맞기야 하겠지만 우연이었겠구나 생각했다 하하. </li>
<li>나머지 연산.. 저렇게 해도 되는지 아리까리해서 간단히 검증도 해서 이해하고! 짱짱!!!</li>
</ul>
</div>
</details>

<details>
<summary>(Hint) 계단 오르기 - 23/10/14 3.5뽀 - 14132KB 124ms
</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 13992KB 116ms</li>
<li>문제 핵심</li>
<ul>
    <li>점화식!!!!!</li>    
    <li>마지막 확정된 계단을 기준으로 경우의 수를 찾아내기</li>
    <ol>
    <li>dp[i]=dp[i-3]+stairs[i-1]+stairs[i]
    </li>
    <li>dp[i]=dp[i-2])+stairs[i]
    </li>
    </ol>
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>초반에 생각한 방식 -> 생각 후 검증 어려워 바로 힌트 확인</li>
    <ul>
        <li>가장 수가 커야 하니 많이 가는 게 좋다는 걸 전제</li>
        <li>3개 중 OUT이 없으면 3개 중 1개는 무조건 건너뛰고, 그 직전에 OUT이었으니 2,3번째 숫자 중 작은 숫자 OUT</li>
        <li>OUT이 있다면 다음 3개로 넘어감.</li>
    </ul>
    <li>idx 오류</li>
    <ul>
        <li>점화식 처리 중 dp 배열과 stairs 배열의 idx 1,2 예외 처리 오류 -> 디버깅으로 확인 후 수정</li>
        <li>점화식이 i-3까지 있어서 1부터 시작해야 1,2만 예외 처리로 가능.</li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>점화식이라서인지 입력을 받으면서 바로 dp를 돌려 dp 저장 및 최종 출력 가능</li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>점화식의 기준, 검증 시 확인해야 할 부분</li>
    <li>idx를 0부터 설정할 때의 점화식 조건은?</li>
    <li>확인한 순위권, 숏코딩은 전부 점화식 같음 -> 점화식 떠올리기 연습만이 살 길.</li>
</ul>
<li>~칭찬~</li>
<ul>
    <li>고민을 한 시간 정도 하고, 떠오른 생각을 검증할 수 없을 것 같아 과감하게! 정답을 확인한 것</li>
    <ul><li>처음 접해 보는 문제라 생각해 본 후 정답 input을 넣고 output을 내는 게 더 효율적</li>
    <li> 와중에 힌트만 얻으려고 파이썬 코드를 봤지만, 정말 잘 읽혀서 의미는 없었다...
    </li>
</ul>
</ul>
</ul>
</div>
</details>
