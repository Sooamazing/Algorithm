# 기록
## 투 포인터 문제

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
<summary>(Hint) 두 용액 - 23/10/20 3.5뽀 - 28672KB 400ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 15932KB 184ms</li>
<li>문제 핵심<ul>
<li>투 포인터, 두 수의 합이 음수인지 양수인지에 따라 leftPtr, rightPtr의 이동 결정하기</li>
<li>0에 가까운 수를 출력하는 거라 Math.abs 이용</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>이분 탐색으로 mid 이용했지만 틀렸습니다!<ul>
<li>원래 푼 방식인 한 번 이분 탐색 도는 걸로는 최소를 장담할 수 없음.</li>
<li>힌트 확인 후 음수, 양수인지 비교해 투 포인터로 풂.</li>
</ul>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>출력시 printf 사용!</li>
<li>2_000_000_000 - 숫자 리터럴, 정수 상수 표현.</li>
<li>while (s != e), Math.abs(sN) &gt;= Math.abs(eN), 조건문 비교 참고. </li>
<li>sum==0일 때 break 추가.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>left, right 포인터의 조건 설정!</li>
<li>결국 루프를 하나 다 돌면서 이분 탐색이라 상위권은 투포인터로 푼 건지? 시간 복잡도는 N*logN ? <ul>
<li><a href="https://yanoo.tistory.com/97">이분 탐색으로 푼 코드</a>  참고</li>
<li>루프를 줄이는 방법은 없나? 꼭 다 돌아야 하나?</li>
</ul>
</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>힌트를 조금만 보고 풀어보려 노력했지만, 이분 탐색이라는 굴레에 갇혀버려서... 투포인터는 전혀 떠올리지 못했다... 카테고리에 집착하지 말고 풀 수 있는 대로 ... 생각하자!</li>
<li>솔직히 오늘 좀 풀기 싫었고, 힌트도 봤지만, 얽매이지 말자는 걸 배웠다!</li>
</ul>
</li>
</ul>
</div>
</details>