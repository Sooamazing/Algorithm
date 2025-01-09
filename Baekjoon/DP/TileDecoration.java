package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-01-09 5min
// https://www.acmicpc.net/problem/13301
public class TileDecoration {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tile = Integer.parseInt(br.readLine());

		long[] dp = new long[tile + 2];
		dp[1] = 1;
		for (int i = 2; i <= tile + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		long ans = dp[tile] * 2 + dp[tile + 1] * 2;
		System.out.println(ans);
	}
}
