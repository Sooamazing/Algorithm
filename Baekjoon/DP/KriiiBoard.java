package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반례 참고: https://www.acmicpc.net/board/view/111455
// 24-07-10 25min
// https://www.acmicpc.net/problem/11058
public class KriiiBoard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pushBtnNum = Integer.parseInt(br.readLine());
		long[] dp = new long[pushBtnNum + 1 + 3];

		for (int i = 1; i <= 6; i++) {
			dp[i] = i;
		}

		for (int i = 7; i < pushBtnNum + 1; i += 4) {
			dp[i] += (dp[i - 1] + dp[i - 4]);
			dp[i + 1] += (dp[i] + dp[i - 4]);
			dp[i + 2] += (dp[i + 1] + dp[i - 4]);
			dp[i + 3] += (dp[i + 2] + dp[i - 4]);
		}

		System.out.println(dp[pushBtnNum]);

	}
}
