# 기록
## Backtracking 문제

<details>
<summary>N과 M (3) - 23/10/08</summary>
<div markdown="1">
<ul>
<li>문제 핵심</li>
<ul>
    <li>중복 숫자를 허용한 수열</li>    
    <li>depth==3마다 print 출력 시 촉박한 시간 해결</li>  
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>1 2 1 이후 1 2 2가 아닌 2 1 2 출력</li>
    <ul>
        <li>list.remove((Integer)idx)여서 중복인 경우 앞부터 지워줬기에 오류, depth 위치를 지워주도록 수정</li>
    </ul>
    <li>시간 초과</li>
    <ul>
        <li>시간 초과 해결을 위해 StringBuilder 사용, 마지막에 한번에 print</li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>list 대신 array 사용 시 remove 작업 없이 해당 idx의 값만 재할당하면 됨.</li>
    <li>array를 char 타입으로 선언 후 “ “, “\n”를 미리 main에서 초기화해 놓으면 재귀 함수 내 단계가 간략해짐.</li>
    <li>파라미터로 한 줄의 입력을 넘겨 줄 수도 있음. 예) 초기화: ""+i+" " →  k+i+" "  </li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>buffer, StringBuilder 개념</li>
    <li>int와 char 변환, 예) (char)(i + '0')</li>
</ul>
</ul>
</div>
</details>