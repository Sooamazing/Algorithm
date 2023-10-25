package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM6 {
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

	static int[] cond;
	static int[] temp;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		cond = new int[N];
		temp = new int[M];
		visited = new boolean[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cond[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cond);
		perm(0, 0);
		System.out.println(sb);

	}

	private static void perm(int depth, int cur) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append('\n');
			return; //자꾸 이걸 까먹는다... ㅠㅠ
		}

		//i=cur+1 X
		for (int i = cur; i < N; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			temp[depth] = cond[i];
			perm(depth + 1, i + 1);
			visited[i] = false;

		}

	}
}
