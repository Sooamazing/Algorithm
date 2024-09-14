package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-09-14 10min
// https://www.acmicpc.net/problem/9625
public class Babba {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int goal = Integer.parseInt(br.readLine());

		int[][] dp = new int[goal + 1][2];

		dp[1][1] = 1;

		for (int i = 2; i < goal + 1; i++) {
			dp[i][0] = dp[i - 1][1];
			dp[i][1] = dp[i - 1][0] + dp[i - 1][1];
		}

		System.out.println(dp[goal][0] + " " + dp[goal][1]);
	}
}
