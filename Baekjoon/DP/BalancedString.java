package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-17 15min
// https://www.acmicpc.net/problem/17520
public class BalancedString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int MOD = 16_769_023;
		int total = Integer.parseInt(br.readLine());
		int[][] dp = new int[total + 1][2];
		dp[1][0] = dp[1][1] = 1;
		for (int i = 2; i <= total; i++) {
			boolean isEven = i % 2 == 0;
			if (isEven) {
				dp[i][0] = dp[i - 1][1];
				dp[i][1] = dp[i - 1][0];
				continue;
			}
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
		}

		System.out.println((dp[total][0] + dp[total][1]) % MOD);
	}
}
