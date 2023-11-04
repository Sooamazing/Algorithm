# 기록
## Backtracking 문제

<details>
<summary>문제 이름 - 날짜 0뽀 - 성능</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: </li>
<li>추정 시간 복잡도: </li>
<li>문제 핵심</li>
<li>어려웠던 부분 해결</li>
<li>순위 코드 분석 후 배운 점</li>
<li>보충이 필요한 지식</li>
<li>~칭찬~</li>
</ul>
</div>
</details>

-----

<details>
<summary>(Hint*2) N과 M (9) - 23/11/4 3.5뽀 - 21372KB 200ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 19580KB 172ms </li>
<li>문제 핵심<ul>
<li>다른 depth에서 선택 시 같은 idx 중복 비허용- visited</li>
<li>같은 depth 내 동일 숫자 중복 비허용</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>depth 별로 중복 처리를 다르게 하는 게 어려웠음.</li>
<li>같은 depth에서 확인할 경우, 해당 idx에서 사용되어야 하기 때문에 이전 idx를 방문한 경우만 continue (이전과 비교하면 이전은 무조건 방문처리해서 이전에 사용했는지를 확인해야 함, 안 그러면 지금 사용해야 하는데 continue 처리됨)</li>
<li><a href="https://www.acmicpc.net/board/view/102625">참고한 질문 게시글 답변</a></li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>dfs 내 before 변수 사용해 조건문 축약</li>
<li>저장 시 sb.setCharAt(), sb.delete() 사용</li>
<li>st.charAt()-&#39;0&#39;으로 parseInt하지 않고 저장</li>
<li>sb에 저장 혹은 LinkedHashSet에 저장하면서 해당 수열 중복 거르기</li>
<li>dfs 후 뒤 idx 값이 현재 idx의 값과 같으면 달라질 때까지 i++ 진행</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>퀵소트 구현</li>
<li>StringBuilder 메서드 이용하는 법</li>
<li>StringTokenizer 메서드 이용법</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>진짜 머리 아프고 하고 싶지 않았는데... 끝까지 풀기 위해 노력했다는 점....~! 그리고 열심히 분석했다!!!! </li>
<li>N과 M 우습게 봤는데... 이제 어려워지나 보다.... </li>
</ul>
</li>
</ul>
</div>
</details>

<details>
<summary>N과 M (8) - 23년 10월 28일 0.5뽀 - 16480KB 152ms 2등!! </summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 15780KB 152ms</li>
<li>문제 핵심<ul>
<li>비내림차순 순열 구하기</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>bubble 정렬 <pre><code class="lang-java"><span class="hljs-attr">arr[i]</span> = arr[j];
<span class="hljs-attr">arr[j]</span> = temp;
<span class="hljs-attr">temp</span> = arr[i];
</code></pre>
</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>main에서 사용하는 메서드를 위에 배치해야 더 빠름</li>
<li>for문이 for-each보다 빠르고, for문 내 비교 변수는 전역 변수보다 지역 변수(파라미터)가 더 빠름</li>
<li>Arrays.sort보다 버블 정렬이 메모리에서 미세하게 적음(다양한 사례 필요)</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>버블 정렬 외의 정렬</li>
<li>sb에 ‘ ‘, “ “ 번갈아 넣어도 되는 이유? </li>
<li>상기 이유 더 빠른 이유, 통상적으로 더 빠른 게 맞는지 확인</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>드디어… return을 제때 하고, 버블 정렬로 구현해 봤다!</li>
<li>와...  위치를 바꾸는 것만으로... 시간 차이가 나다니 신기하다...</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>N과 M (7) - 23/10/26 0.5뽀 - 122960KB 616ms 16등!!</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 119408KB 568ms</li>
<li>문제 핵심<ul>
<li>중복 허용, 모슨 수열</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>return!!!!!!!!!!! </li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>ans 배열을 주어진 범위로 초기화</li>
<li>sort를 버블 정렬로 구현!</li>
<li>for-each 사용</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>버블 정렬이 Arrays.sort보다 빠른지?</li>
<li>ans 배열 초기화를 미리 하는 게 메모리 사용에 유의미한지?</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>같은 문제를 반복해서 풀어서겠지만, 그래도! 순위권 뿌듯하다! 진짜 뚝딱뚝딱~! 10분도 안 돼서 푼 듯!</li>
</ul>
</li>
</ul>
</div>
</details>


<details>
<summary>N과 M (6) - 23/10/25 0.5뽀 - 14292KB 124ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14224KB  120ms</li>
<li>문제 핵심<ul>
<li>오름차순 순열</li>
</ul>
</li>
<li>어려웠던 부분 해결<ul>
<li>return, i=cur, cur+1</li>
</ul>
</li>
<li>순위 코드 분석 후 배운 점<ul>
<li>visited 꼭 필요한 때만 하기!</li>
<li>arr[idx-1]≥num[i]처럼 직접 비교할 수 있음.</li>
</ul>
</li>
<li>보충이 필요한 지식<ul>
<li>idx, 함수 종료 조건</li>
</ul>
</li>
<li>~칭찬~<ul>
<li>그래도... 빠르게 풀어내긴 했다....  좀 더 기계적으로 착착 생각할 수 있게 노력하자~!</li>
</ul>
</li>
</ul>

</div>
</details>


<details>
<summary>(Hint) 스타트와 링크 - 23/10/13 8뽀 - 19648KB 268ms</summary>
<div markdown="1">
<ul>
<li>공개한 1등 기록: 14704KB 140ms </li>
<li>문제 핵심</li>
<ul>
    <li>조합을 이용해 N/2명씩 두 팀으로 나눠 팀 별합, 두 팀의 차 구하기</li>
    <li>한 팀이 정해지면 다른 팀은 나머지라는 점을 이용</li>
    <ul>
        <li>이미 구해 놓은 visited 이용 (N은 최대 20)</li>
    </ul>
    <li>동시에 합 구하기</li>
    <ul><li>이중 for문 내에서 조건 분기로 동시에 합 구하기</li></ul>
</ul>
<li>어려웠던 부분 해결</li>
<ul>
    <li>그동안 sb에 넣고 print만 해서 정작 넣어서 사용하는 법이 어려웠음</li>
    <ul><li>정답 코드에서 사용하진 않았지만, 조합은 배열 쌍을 다시 list에 저장하고, 수열은 결국 S는 2차원 배열이라는 점에서 배열의 idx 0,1 사용하는 방식으로 구현해냄.</li>
    <li>정답 코드에서는 결국 조합을 찾으면 바로 사용했는데, 그래서 N과 M 시리즈가 그냥 sb에 넣을 줄 알고, print하면 되는 식으로 출제되었나?</li>
    </ul>
    <li>초기 발상 - 시간 초과</li>
    <ol>
        <li>(N개에서 2/N개 만큼 조합 뽑고,(nC(n/2))/2번 하면 중복X 경우의 수 추출 - Start팀</li>
        <li>해당 조합을 나누는 건 숫자 한 개가 속한 조합을 전부 구하면 한 쪽은 Start, 다른 쪽은 Link로 나누어 sum, cnt를 두 번 연산하지 않아도 되기 때문.</li>
        <li>각 Start팀에 없는 Link 팀 구하기
        </li>
        <li>추출한 idx 조합 2개 뽑는 순열로 합 구하기 (Start, Link 팀 각각)
        </li>
        <li>Math.abs으로 각 팀의 sum 차 구하기</li>
    </ol>
    <li>발상 수정 - 시간 초과</li>
    <ol>
        <li>N개에서 2/N개 만큼 조합 전부 뽑기 - 반을 나누면 각 Start, Link 팀 완성</li>
        <li>추출한 idx 조합 전부 2개 뽑는 순열로 합 구하기
        </li>
        <li>Math.abs으로 각 팀의 sum 차 구하기</li>
    </ol>
    <li>힌트 확인 후 수정</li>
    <ul>
        <li>조합 내에서 팀이 정해지면, visited를 이용해 상대 팀을 바로 결정</li>
        <li>이중 for문 한 개 내에서 두 개의 팀 전부 합 구하기</li>
    </ul>
    <details>
<summary>틀린 코드</summary>
<div markdown="1">

    //처음부터 시간초과...
    
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Map;
    import java.util.Scanner;
    import java.util.StringTokenizer;
    
    public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int[] comb;
    static int[] perm;
    static ArrayList<List<Integer>> combList = new ArrayList();
    // static StringBuilder sb = new StringBuilder();
    static int sum = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = new int[N + 1][N + 1];
		visited = new boolean[N];
		comb = new int[N / 2];
		perm = new int[N / 2];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력 및 초기화 완료

		// sb = new StringBuilder();
		startAndLinkComb(0, 0);

		int[] sumArr = new int[combList.size()];
		int cnt = 0;
		for (List<Integer> item : combList) {
			// System.out.println(">>>");
			sum = 0;
			// sb = new StringBuilder();
			visited = new boolean[N];
			sumArr[cnt++] = startAndLinkPerm(item, 0);
			// System.out.println("sum = " + sum);
			// System.out.println(sb);
		}

		int lastIdx = sumArr.length - 1;
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < sumArr.length / 2; i++) {
			int sum = Math.abs(sumArr[i] - sumArr[lastIdx - i]);
			minSum = Math.min(sum, minSum);
		}
		System.out.println(minSum);
		// System.out.println("----------");
		// System.out.println(sb);
	}


	static void startAndLinkComb(int depth, int cur) {
		//comb = new int[N/2][2];
		//(N개에서 2/N개 만큼 조합 뽑기(nC(n/2))%2번 하면 중복X 경우의 수 추출

		if (depth == N / 2) {
			ArrayList<Integer> tempList = new ArrayList<>();
			for (int i = 0; i < N / 2; i++) {
				// sb.append(comb[i]).append(" ");
				tempList.add(comb[i]);
			}
			// sb.append("\n");
			combList.add(tempList);
			return;
		}

		for (int i = cur; i < N; i++) {

			//이 조건 왜 여기? 재귀 끝나고가 왜 아니지?
			// if (depth == 0 & i > 0)
			// 	return;

			if (visited[i]) {
				continue;
			}

			visited[i] = true;
			comb[depth] = i + 1;
			startAndLinkComb(depth + 1, i);
			visited[i] = false;
		}

	}

	static int startAndLinkPerm(List<Integer> item, int depth) {
		if (depth == 2) {
			sum += S[perm[0]][perm[1]];
			// sb.append(perm[0]).append(" ").append(perm[1]).append(" ");
			// sb.append(", S: ").append(S[perm[0]][perm[1]]);
			// sb.append('\n');
		}

		for (int i = 0; i < N / 2; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			perm[depth] = item.get(i);
			startAndLinkPerm(item, depth + 1);
			visited[i] = false;
		}

		return sum;

	}

    }       
</div>
</details>

</ul>
<li>순위 코드 분석 후 배운 점</li>
<ul>
    <li>섬의 개수와 비슷하게 for 없이 그냥 재귀로만 조합 가능, 확인한 상위권 전부 이렇게 풀이.</li>
    <ul><li>재귀함수로 들어온 수 +1 재귀, 여기까지만 하는 재귀 총 2개를 다시 돌리면서 전체 조합 탐색</li></ul>
</ul>
<li>보충이 필요한 지식</li>
<ul>
    <li>초기에 조합 -> 순열로 진행하는 건 어느 부분에서 시간 초과가 나는 걸까? (저 발상 자체가 시간 초과인지, 내가 잘못 짠 건지)</li>
    <li>조합 구할 때 재귀 내에서 분기하는 법을 더 공부하기, 특히 idx 이용와 sum 구하는 방식</li>
    <li>구한 조합을 저장하는 방법</li>
    <li>하기 코드는 조합 함수 for의 맨 위에 위치해야 원하는 대로(1번 선수일 때만 조합을 구하고 싶은 것, 그게 절반이니까.) 동작하는데, 그 이유는? (처음에는 for의 마지막에 놓음, 조합 재귀가 끝난 후 다시 돌 때 검사해도 충분하다 생각함) 
 
    if (depth == 0 & i > 0)
	return;

</li>
    <li>N개를 뽑는 게 정해져 있는 경우, 숫자 한 개가 들어있는 조합을 전부 구하면 나머지는 각각의 경우에 대응하는 나머지가 구해지는 점. -> 전부 확인해 보고야 확신, 이에 대해서 좀 더 수학적으로 설명(검증)할 수 있으면 좋겠음.</li>
</ul>
<li>~칭찬~</li>
<ul>
<li>어떻게 푸는지는 떠올렸다! 잘했다! visited로 이용하는 것 등 있는 변수, 조건을 최대한 잘 활용할 생각을 더 열심히 하면 되겠다! 조건문과 재귀함수만 이용한 탐색도 좀 더 공부하면 된다!</li>
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
