package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-06-09 30min
// https://www.acmicpc.net/problem/2688
// 참고: https://steady-coding.tistory.com/155
public class ItDoesntShrink {
	static int[] nums;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCaseNum = Integer.parseInt(br.readLine());
		nums = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		long[][] dp = new long[65][10];
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		// dp[i][j] = dp[i-1][j] + dp[i][j-1];
		for (int i = 2; i < 65; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = j; k < 10; k++) {
					dp[i][j] += dp[i - 1][k];
				}
			}
		}

		while (testCaseNum-- > 0) {
			int digitNum = Integer.parseInt(br.readLine());
			result = 0;
			for (int i = 0; i < 10; i++) {
				result += dp[digitNum][i];
			}
			// calculate(0, 0, digitNum);
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}

	static long result;

	public static void calculate(int curIdx, int depth, int digit) {
		if (depth == digit) {
			result++;
			return;
		}
		for (int i = curIdx; i < 10; i++) {
			calculate(i, depth + 1, digit);
		}
	}
}
