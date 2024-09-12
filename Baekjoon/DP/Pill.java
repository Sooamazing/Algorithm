package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-04 10min
// https://www.acmicpc.net/problem/4811
public class Pill {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());

		while (testCaseNum-- > 0) {
			int day = Integer.parseInt(br.readLine());

			// int n = Integer.parseInt(br.readLine());
			// long[][] dp = new long[31][31];
			//
			// for (int i = 0; i <= n; i++) {
			// 	dp[i][0] = 1;
			// }
			//
			// for (int i = 1; i <= n; i++) {
			// 	for (int j = 1; j <= n; j++) {
			// 		dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			// 	}
			// }
			//
			// System.out.println(dp[n][n]);
		}

		System.out.println(sb);
	}
}
