# 기록
## DP 문제

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

--------

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
