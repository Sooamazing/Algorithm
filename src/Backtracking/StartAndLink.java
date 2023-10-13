package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartAndLink {
	static int N;
	static int[][] S;
	static boolean[] visited;
	static int[] comb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = new int[N + 1][N + 1];
		visited = new boolean[N+1];
		comb = new int[N / 2+1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력 및 초기화 완료

		startAndLinkComb(0, 1);
		System.out.println(res);

	}

	static int res = Integer.MAX_VALUE;

	static void startAndLinkComb(int depth, int cur) {

		if (depth == N / 2) {

			int startSum = 0;
			int LinkSum = 0;
			for(int i=1;i<=N;i++){
				for(int j=1;j<=N;j++){
					if(visited[i]&&visited[j]){
						startSum+=S[i][j];
					}
					if(!visited[i]&&!visited[j]){
						LinkSum+=S[i][j];
					}
				}
			}
			res=Math.min(Math.abs(startSum-LinkSum), res);
			return;
		}

		for (int i = cur; i <= N; i++) {
			if (depth == 0 & i > 1) {
				return;
			}
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			comb[depth+1] = i ;
			startAndLinkComb(depth + 1, i + 1);
			visited[i] = false;
		}
	}
}
