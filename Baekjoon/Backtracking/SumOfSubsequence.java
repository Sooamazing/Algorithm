package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfSubsequence {
	static int N;
	static int S;
	static int[] arr;
	static boolean[] visited;
	static int cnt;
	// static StringBuilder sb = new StringBuilder();
	// static int[] tempArr=new int[20];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		visited = new boolean[N];

		st=new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// Arrays.sort(arr); //sum과 S를 그때그때 비교하려 했으나 오류
		//입력 및 정렬 완료

		cnt=0;
		for (int i = 1; i <= N; i++) {
			sumOfSubsequence(0, i, 0,0);
		}

		// System.out.println(sb);
		System.out.println(cnt);

	}

	static void sumOfSubsequence(int depth, int depthLimit, int cur, int sum) {
		// //sum>S이면 return - 오류
		// if(sum>S){
		// 	return;
		// }

		//depth==depthLimit sum이 S이면 cnt++ 후 return
		if(depth==depthLimit){
			// for(int i=0; i<depthLimit;i++){
			// 	sb.append(tempArr[i]).append(" ");
			// }
			// sb.append("\n");
			if(sum==S){
				cnt++;
			}
			return;
		}

		//조합 찾기
		for(int i=cur;i<N;i++){
			if(visited[i]){
				continue;
			}
			visited[i]=true;
			// tempArr[depth]=arr[i];
			sumOfSubsequence(depth+1, depthLimit, i, sum+arr[i]);
			visited[i]=false;
		}
	}
}