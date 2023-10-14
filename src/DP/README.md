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

--------- 


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
