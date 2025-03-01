package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-01 30min
// https://www.acmicpc.net/problem/15990
public class OneTwoThreePlusFive {
	private static final int MOD_NUMBER = 1_000_000_009;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		long[][] dp = new long[100_001][4];
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		for (int i = 4; i < 100_001; i++) {
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % MOD_NUMBER;
			dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % MOD_NUMBER;
			dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % MOD_NUMBER;
		}
		while (testCase-- > 0) {
			int number = Integer.parseInt(br.readLine());

			long result = (dp[number][1] + dp[number][2] + dp[number][3]) % MOD_NUMBER;
			sb.append(result).append("\n");
		}

		System.out.println(sb);
	}
}
