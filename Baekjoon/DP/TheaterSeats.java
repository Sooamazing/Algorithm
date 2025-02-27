package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-27 40min
// https://www.acmicpc.net/problem/2302
public class TheaterSeats {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int vip = Integer.parseInt(br.readLine());
		int[] dp = new int[total + 1];
		dp[0] = 1;
		dp[1] = 1;
		if (total <= 1) {
			System.out.println(dp[1]);
			return;
		}
		dp[2] = 2;
		for (int i = 3; i < total + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		int result = 1;
		int prev = 0;
		for (int i = 0; i < vip; i++) {
			int current = Integer.parseInt(br.readLine());
			// vip 자리 사이의 자리 조합
			result *= dp[current - prev - 1];
			prev = current;
		}
		result *= dp[total - prev]; // 마지막 자리에서 vip까지도 더해줌

		System.out.println(result);
	}
}
