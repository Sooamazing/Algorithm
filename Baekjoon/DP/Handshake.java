package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-08 10min
// https://www.acmicpc.net/problem/8394
public class Handshake {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int[] dp = new int[total + 1];
		if (total >= 2) {
			dp[2] = 2;
		}
		if (total >= 3) {
			dp[3] = 3;
		}
		for (int i = 4; i <= total; i++) {
			// 마지막 자리만 출력
			dp[i] = dp[i - 1] % 10 + dp[i - 2] % 10;
		}

		// 마지막 자리만 출력
		System.out.println(dp[total] % 10);

	}
}
