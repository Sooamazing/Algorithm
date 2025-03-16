package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-15 50min
// https://www.acmicpc.net/problem/15991
public class OneTwoThreeSum6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		final int MOD = 1_000_000_009;
		final int MAX = 100_000;
		int[][] dp = new int[MAX + 1][6 + 1];
		// 1, 2, 3 전체 개수가 홀수인 경우, 가운데 수가 1, 2, 3인 경우
		// 4, 5, 6 전체 개수가 짝수인 경우, 가운데 수가 1, 2, 3인 경우
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[2][5] = 1;
		dp[3][1] = 1;
		dp[3][3] = 1;
		for (int i = 4; i <= MAX; i++) {
			boolean isEven = i % 2 == 0;
			if (isEven) {
				dp[i][4] = dp[i - 1][1];
				dp[i][2] = ((dp[i - 2][4] + dp[i - 2][5]) % MOD + dp[i - 2][6]) % MOD;
				dp[i][5] = dp[i - 2][2];
				dp[i][6] = dp[i - 3][3];
				continue;
			}

			dp[i][1] = ((dp[i - 1][4] + dp[i - 1][5]) % MOD + dp[i - 1][6]) % MOD;
			dp[i][3] = ((dp[i - 3][4] + dp[i - 3][5]) % MOD + dp[i - 3][6]) % MOD;
		}

		while (test-- > 0) {
			int current = Integer.parseInt(br.readLine());
			int result = (((((dp[current][1] + dp[current][2]) % MOD
				+ dp[current][3]) % MOD
				+ dp[current][4]) % MOD
				+ dp[current][5]) % MOD
				+ dp[current][6]) % MOD;
			sb.append(result).append("\n");
		}

		System.out.println(sb);
	}
}
