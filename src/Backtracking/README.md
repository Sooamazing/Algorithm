# 기록
## Backtracking 문제

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
<summary>부분 수열의 합 - 23/10/12 1.5뽀 - 14208KB 208ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14068KB 124ms </li>
<li>문제 핵심</li>
<ul>
    <li>조합 + 합 비교</li>   

    //depth==depthLimit sum이 S인지 확인 후 return
    //조합 찾기
        //이전 idx+1부터 방문했는지 확인 후 방문하지 않은 곳 선택해 재귀

</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>중복 제거를 의도했으나 조합 3개부터는 중복이 들어감.</li>
    <ul>
        <li>이전에는 i=depth여서 arr[i]일 때 중복이었음. i=cur로 해결</li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>성환님 코드 확인 -> main에서 digit 정하지 않고, 재귀함수에서 i=cur로 그냥 for 돌리기만 해도 모든 조합 구해짐.(순서대로가 아닐 뿐) sum==S 확인하는 과정을 재귀마다 하면 모든 조합에 대해 비교.</li>
    <li>순위권에 대해서는... 조금 더 공부 필요</li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>오름차순으로 정렬 후 sum>S인 경우 return -> 반례가 뭘까? 왜 틀리지?</li>
    <li>visited를 없애는 방법이 있을까?</li>
    <li>비트 연산자를 활용하는 이유?</li>
    <li>재귀함수의 동작 과정에 대해서 조금 더 공부하기. - for문 내 i=cur 설정만으로도 모든 조합을 구한다는 것.</li>
    <li>확인한 순위권에서는 전부 하기 코드와 같이 진행했는데, 잘 감이 안 옴.</li>   

    backtracking(depth + 1, sum);   
    backtracking(depth + 1, sum + arr[depth]);
</ul>
<li>~칭찬~</li>
<ul>
<li>idx 오류가 자꾸 발생하지만, 그래도 빠르게 문제 파악한 덕에 정답 도출까지 오래 걸리지는 않음!</li>
</ul>
</ul>
</div>
</details>
<details>
<summary>N과 M (5) - 23/10/11 1뽀 - 28776KB 308ms 70등!!</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 28372KB 268ms</li>
<li>문제 핵심</li>
<ul>
    <li>입력 받은 수로 순열 구하기</li>    
    <li>입력 받은 수와 digit의 idx 설정에 유의</li>  
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>sb에 공백 추가가 아니라 공백을 출력해서 오류</li>
    <ul>
        <li>컴파일러는 잘못하지 않는다...</li>
    </ul>
    <li>result, numArr를 따로 구현하지 않아 이상한 수 출력 </li>
    <ul><li>역시 구조화를 해야 함.</li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>로직은 거의 비슷</li>
    <li>추후 파라미터로 문자열 넘기기 도전</li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>dfs-for 내에서 조건 맞으면 시행하는 것보다 continue로 구현하면 더 빠른가?</li>
</ul>
<li>~칭찬~</li>
<ul>
<li>뚝딱뚝딱~ 구조를 짜고 했다면 더 좋았겠지만, 늘어지는 것보단 풀기를 택해서 풀어낸 게 장하다!</li>
<li>N과 M은.. 그래도 이제 진짜... 어느 정도는 익힌 듯.</li>
</ul>
</ul>
</div>
</details>

<details>
<summary>N과 M (4) - 23/10/09 1.5뽀 - 15328KB 152ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 15488KB 136ms</li>
<li>문제 핵심</li>
<ul>
    <li>중복 허용</li>    
    <li>비내림차순</li>  
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>중복 허용, 비내림차순</li>
    <ul>
        <li>수열 loop에서 루프 시작값 설정에 따라 중복 허용 및 비 내림차순 구현</li>
    </ul>
    <li>char[] idx</li>
    <ul>
        <li>2*M+1, 2*M-1 헷갈리는 등 자잘한 idx 오류 -> 배열에 담길 수 써보고 그대로 구현</li>
        <li>for 내에서의 변수를 i가 아닌 (for에서는 상수인) M으로 설정해 오류 -> 디버깅으로 실제 들어가는 값 확인해 정정</li>
    </ul>
</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>시간 복잡도 고려시, for를 줄이는 게 더 나음.</li>
    <ul>
    <li>sb.append(arr[i]).append(' ')와 각 공백 포함 arr[i]에서 sb.append(arr[i]); loop를 도는 수에서 유의미한 시간 차이가 발생한 걸로 추정.</li>
    </ul>
    <li>M이 depth라는 점을 제대로 인지함.</li>
    <li>char[2*M] 대신 비트연산자 사용</li>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>int를 char로 변환하는 과정에 유의미한 시간이 소요되는지</li> 
</ul>
<li>~칭찬~</li>
<ul>
<li>어제 배운 거 활용함!</li>
<ul><li>char[]에 저장, main에서 공백 및 줄바꿈 초기화 해 backtracking 함수 내에서는 최소한 동작만 하도록 구현</li></ul>
</ul>
</ul>
</div>
</details>


<details>
<summary>N과 M (3) - 23/10/08 2뽀 - 214988KB 640ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 64840KB 364ms</li>
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
