package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반례
// 3
// 100
// 100
// 1
// 24-08-25 28:45
// https://www.acmicpc.net/problem/23029
public class TheTestingSectionIsMine {
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testSectionNum = Integer.parseInt(br.readLine());
		dp = new int[testSectionNum][3];

		for (int i = 0; i < testSectionNum; i++) {
			int cur = Integer.parseInt(br.readLine());
			if (i == 0) {
				dp[0][0] = cur;
				continue;
			}

			// 0: 지금이 첫번째 시식인 경우
			dp[i][0] = dp[i - 1][2] + cur;
			// 1: 지금이 두번째 시식인 경우
			dp[i][1] = dp[i - 1][0] + cur / 2;
			// 2: 지금 시식을 통과하는 경우, 이전 시식들의 최댓값 할당.
			dp[i][2] = getMax(i);
		}

		System.out.println(getMax(testSectionNum));
	}

	private static int getMax(int i) {
		return Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));
	}
}
