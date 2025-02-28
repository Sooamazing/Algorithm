package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-28 35min
// https://www.acmicpc.net/problem/1699
// 반례: 14458 - 2
// 참고: https://stdio-han.tistory.com/94
public class SumOfSquares {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			// int rootPow = (int)Math.pow(i, (double)1 / 2);
			// int doublePow = (int)Math.pow(rootPow, 2);
			// dp[i] = 1 + dp[i - doublePow];

			dp[i] = i;
			for (int j = 0; j * j <= i; j++) {
				if (dp[i] > dp[i - j * j] + 1) {
					dp[i] = dp[i - j * j] + 1;
				}
			}
		}

		System.out.println(dp[n]);
	}
}
