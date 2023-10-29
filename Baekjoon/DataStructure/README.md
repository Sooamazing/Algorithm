# 기록

## 자료 구조 문제

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