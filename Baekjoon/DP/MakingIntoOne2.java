package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MakingIntoOne2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int targetNum = Integer.parseInt(br.readLine());
		int[] dp = new int[targetNum + 6];
		List<Integer> list = new ArrayList<>();

		if (targetNum >= 1) {
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 2;
			dp[4] = 3;
			dp[5] = 4;
		}

		for (int i = 6; i <= targetNum; i++) {

			if (i % 6 == 0) {
				dp[i] = Math.min(dp[i - 1], Math.min(dp[i / 3], dp[i / 2])) + 1;
			} else if (i % 3 == 0) {
				// 3으로 나누어 떨어지는 경우
				dp[i] = dp[i / 3] + 1;
			} else if (i % 2 == 0) {
				dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1);
			} else {
				dp[i] = Math.min(dp[i - 1] + 1, dp[i - 2] + 2);
			}

		}

		int cur = targetNum;
		sb.append(cur).append(' ');

		while (cur != 1) {

			int a = cur - 1;
			int b = cur - 2;
			int c = cur % 3;
			int d = cur % 2;

			// if (cur % 6 == 0) {
			// 	cur = Math.min(dp[i - 1], Math.min(dp[i / 3], dp[i / 2])) + 1;
			// } else if (cur % 3 == 0) {
			// 	// 3으로 나누어 떨어지는 경우
			// 	cur = dp[i / 3] + 1;
			// } else if (i % 2 == 0) {
			// 	cur = Math.min(dp[i - 1] + 1, dp[i / 2] + 1);
			// } else {
			// 	cur = Math.min(dp[i - 1] + 1, dp[i - 2] + 2);
			// }

			sb.append(cur).append(' ');
		}

		System.out.println(dp[targetNum]);

	}
}
