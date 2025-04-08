package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-08 25min
// https://www.acmicpc.net/problem/1788
public class ExtendedFibonacci {
	private static final int MOD = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int result = 0;
		if (total >= 0) {
			result = getPlusFibonacci(total);
		} else {
			result = getMinusFibonacci(-total);
		}

		boolean isPositive = result > 0;
		boolean isZero = result == 0;
		// 원래 어떤 부호였는지 출력
		int sign = isPositive ? 1 : isZero ? 0 : -1;
		// 양수로 출력 필요
		result = isPositive ? result : -result;

		System.out.println(sign + "\n" + result);
	}

	private static int getPlusFibonacci(int total) {
		int[] dp = new int[total + 1];
		if (total >= 1) {
			dp[1] = 1;
		}
		for (int i = 2; i <= total; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
		}
		return dp[total];
	}

	private static int getMinusFibonacci(int total) {
		int[] dp = new int[total + 1];
		if (total >= 1) {
			dp[1] = 1;
		}
		dp[1] = 1;
		for (int i = 2; i <= total; i++) {
			dp[i] = (dp[i - 2] - dp[i - 1]) % MOD;
		}
		return dp[total];
	}
}
