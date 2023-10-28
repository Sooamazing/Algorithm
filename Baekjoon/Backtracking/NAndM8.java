package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM8 {
	static int N;
	static int M;
	static int[] arr;
	static int[] temp;
	static StringBuilder sb = new StringBuilder();

	static void perm(int depth, int cur) {
		if (depth == M) {
			for (int i = 0; i < depth; i++) {
				sb.append(temp[i]).append(' ');
			}
			//'', "" 차이?
			sb.append('\n');
			return;
		}

		for (int i = cur; i < N; i++) {

			temp[depth] = arr[i];
			perm(depth + 1, i);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		temp = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			int temp = arr[i];
			for (int j = i; j < N; j++) {
				if (temp > arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
					temp = arr[i]; // 이걸 빼먹음
				}
			}
		}

		// Arrays.sort(arr);//입력 및 초기화 완료

		perm(0, 0);
		System.out.println(sb);

	}

}
