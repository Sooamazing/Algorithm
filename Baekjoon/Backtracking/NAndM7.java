package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM7 {
	static int N;
	static int M;
	static int[] arr;
	static boolean[] visited;
	static int[] temp;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		visited = new boolean[N];
		temp = new int[M];

		st=new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		//입력 및 정렬 완료

		perm(0);
		System.out.println(sb);

	}

	static void perm(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(temp[i]).append(' ');
			}
			sb.append('\n');
			return; //.....
		}

		for (int i = 0; i < N; i++) {
			temp[depth] = arr[i];
			perm(depth + 1);
		}

	}
}
