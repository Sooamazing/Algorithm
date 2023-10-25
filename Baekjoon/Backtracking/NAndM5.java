package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM5 {
	static int N;
	static int M;
	static int numArr[];
	static int result[];
	static StringBuilder sb;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		numArr = new int[N];
		visited = new boolean[N];
		result = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numArr);
		//기본 입력 및 초기화, 정렬 완료

		sb = new StringBuilder();
		backtracking(0);

		System.out.println(sb);
	}

	static void backtracking(int depth) {

		//depth가 M이면 sb에 numArr 내용 전체 저장(공백 및 줄바꿈 포함)
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i]).append(' ');
			}
			sb.append('\n');
			// System.out.println();
			return;
		}

		//방문하지 않은 숫자인 경우 방문 처리 및 해당 depth에 현재 순서의 숫자 저장.
		for(int i=0;i<N;i++){
			if(!visited[i]){
				visited[i]=true;
				result[depth] = numArr[i];
				backtracking(depth+1);
				visited[i]=false;
			}
		}
	}
}
