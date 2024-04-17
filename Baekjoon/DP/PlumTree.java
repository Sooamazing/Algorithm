package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 7 3
// 2
// 1
// 1
// 2
// 2
// 1
// 1
// 24-04-17 90min
// https://www.acmicpc.net/problem/2240
public class PlumTree {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int time = Integer.parseInt(st.nextToken());
		int maxMove = Integer.parseInt(st.nextToken());

		int[][] dp = new int[time + 1][maxMove + 1];
		for (int i = 1; i <= time; i++) {
			int curTree = Integer.parseInt(br.readLine());
			for (int j = 0; j <= maxMove; j++) {

				// 그대로인 경우
				if (j == 0) {
					if (curTree == 1) {
						// 1에서 자두가 떨어지는 경우
						dp[i][j] = dp[i - 1][j] + 1;
					} else {
						// 2에서 자두가 떨어지는 경우
						dp[i][j] = dp[i - 1][j];
					}
				} else if (j % 2 == 0) { // 움직여서 1이 된 경우 (움직인 횟수가 짝수)
					if (curTree == 1) {
						// 1에서 자두가 떨어지는 경우
						dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + 1;
					} else {
						// 2에서 자두가 떨어지는 경우
						dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
					}
				} else { // 움직여서 2가 된 경우 (움직인 횟수가 홀수)

					if (curTree == 1) {
						// 1에서 자두가 떨어지는 경우
						dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
					} else {
						// 2에서 자두가 떨어지는 경우
						dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + 1;
					}
				}

			}

		}
		int answer = 0;
		for (int i = 0; i <= maxMove; i++) {
			answer = Math.max(answer, dp[time][i]);
		}

		System.out.println(answer);
	}
}
