package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-04-24 25min
// https://www.acmicpc.net/problem/9465
public class Sticker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {
			int jSize = Integer.parseInt(br.readLine());
			int[][] arr = new int[2][jSize];
			int[][] dp = new int[2][jSize];
			// int max = Integer.MIN_VALUE;
			for (int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < jSize; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// jSize가 1일 경우 따로 처리
			if (jSize >= 1) {
				dp[0][0] = arr[0][0];
				dp[1][0] = arr[1][0];
				// max = Math.max(dp[0][0], dp[1][0]);
			}

			// jSize가 2일 경우 따로 처리
			if (jSize >= 2) {
				dp[0][1] = dp[1][0] + arr[0][1];
				dp[1][1] = dp[0][0] + arr[1][1];
				// max = Math.max(dp[0][1], dp[1][1]);
			}

			// j - i 순서 유의. i부터 진행 시 불가.
			for (int j = 2; j < jSize; j++) {
				for (int i = 0; i < 2; i++) {
					// 윗행인 경우, 왼쪽 아래, 왼왼쪽 위, 왼왼쪽 아래 비교.
					if (i == 0) {
						dp[i][j] = Math.max(
							dp[1][j - 1], Math.max(
								dp[1][j - 2],
								dp[0][j - 2]))
							+ arr[i][j];
					} else {
						// 아래 행인 경우, 왼쪽 위, 왼왼쪽 위, 왼왼쪽 아래 비교.
						dp[i][j] = Math.max(
							dp[0][j - 1], Math.max(
								dp[0][j - 2],
								dp[1][j - 2]))
							+ arr[i][j];
					}
				}
			}

			// max = Math.max(dp[0][jSize - 1], dp[1][jSize - 1]);

			// dp의 가장 마지막 열의 두 행 max 비교
			sb.append(Math.max(dp[0][jSize - 1], dp[1][jSize - 1])).append('\n');

		}
		System.out.println(sb);
	}
}
