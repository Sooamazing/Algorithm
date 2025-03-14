package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-14 5min
// https://www.acmicpc.net/problem/15988
public class OneTwoThreeSum3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		int total = 1_000_000;
		int mod = 1_000_000_009;
		int[] dp = new int[total + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <= total; i++) {
			dp[i] = ((dp[i - 1] + dp[i - 2]) % mod + dp[i - 3]) % mod;
		}
		while (test-- > 0) {
			int current = Integer.parseInt(br.readLine());
			sb.append(dp[current]).append("\n");
		}

		System.out.println(sb);

	}
}
