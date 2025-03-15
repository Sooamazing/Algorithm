package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-03-15 3min
// https://www.acmicpc.net/problem/2748
public class FibonacciNumber2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		long[] dp = new long[total + 1];
		dp[1] = 1;
		for (int i = 2; i <= total; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[total]);
	}
}
