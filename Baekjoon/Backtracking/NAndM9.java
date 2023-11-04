package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM9 {
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder(); // 초기화...NullPointEx

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		temp = new int[M]; // 초기화...
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		// 입력 및 초기화 완료

		backtracking(0, 0);
		System.out.println(sb);
	}

	static int[] temp;
	static boolean[] visited;

	static void backtracking(int depth, int prev) {

		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {

			// 다른 depth에서 선택 시 같은 idx 중복 비허용- visited
			if (visited[i]) {
				continue;
			}

			// 같은 depth 내 동일 숫자 중복 비허용
			if (i > 0 && arr[i - 1] == arr[i] && !visited[i - 1]) {
				continue;
			}

			visited[i] = true;
			temp[depth] = arr[i];
			backtracking(depth + 1, i);
			visited[i] = false;
		}
	}
}
