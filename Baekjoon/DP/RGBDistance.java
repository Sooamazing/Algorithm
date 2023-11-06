package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBDistance {
	// PCCP 모의고사2 체육대회랑 같은 듯?

	static int N, min;
	static int[][] rgbArr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		rgbArr = new int[N][3];
		temp = new int[N];
		houseVisited = new boolean[N];
		colorVisited = new boolean[3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			rgbArr[i][0] = Integer.parseInt(st.nextToken());
			rgbArr[i][1] = Integer.parseInt(st.nextToken());
			rgbArr[i][2] = Integer.parseInt(st.nextToken());
		}//입력 및 초기화 완료

		int[][] dp = new int[N][3];
		dp[0][0] = rgbArr[0][0];
		dp[0][1] = rgbArr[0][1];
		dp[0][2] = rgbArr[0][2];
		for (int i = 1; i < N; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + rgbArr[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + rgbArr[i][1];
			dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][0]) + rgbArr[i][2];
		}

		System.out.println(Math.min(Math.min(dp[N-1][0],dp[N-1][1]), dp[N-1][2]));

	}

	static int[] temp;
	static boolean[] houseVisited;
	static boolean[] colorVisited;

	private static void backtracking(int depth, int x, int y, int sum) {
		if (depth == N) {
			min = Math.min(min, sum);
			return; // 까먹음.
		}

		int before = y;
		for (int i = x; i < N; i++) {
			if (houseVisited[i]) {
				continue;
			}
			houseVisited[i] = true;
			for (int j = y; j < 3; j++) {
				if (before == j) {
					continue;
				}
				before = j;
				temp[depth] = rgbArr[i][j];
				backtracking(depth + 1, i + 1, j + 1, i + 1);
				houseVisited[i] = false;
			}
		}

	}
}
