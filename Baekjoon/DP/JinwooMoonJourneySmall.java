package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-17 5min, 25-03-20 35min
// https://www.acmicpc.net/problem/17484
public class JinwooMoonJourneySmall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		final int DIRECTION = 3;
		final int LEFT = 0;
		final int STRAIGHT = 1;
		final int RIGHT = 2;
		int[][][] dp = new int[DIRECTION][row][col];

		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				int currentFuel = Integer.parseInt(st.nextToken());
				if (i == 0) {
					if (j == 0) {
						dp[STRAIGHT][i][j] = dp[RIGHT][i][j] = currentFuel;
						continue;
					}
					if (j == col - 1) {
						dp[LEFT][i][j] = dp[STRAIGHT][i][j] = currentFuel;
						continue;
					}
					dp[LEFT][i][j] = dp[STRAIGHT][i][j] = dp[RIGHT][i][j] = currentFuel;
					continue;
				}

				// 왼쪽 맨 끝은 왼쪽에서 오는 경우 고려 X
				if (j == 0) {
					// 가운데에서 오는 경우는 이전에 오른쪽에서 왔던 경우 뿐.
					dp[STRAIGHT][i][j] = dp[RIGHT][i - 1][j] + currentFuel;
					dp[RIGHT][i][j] = Math.min(dp[LEFT][i - 1][j + 1], dp[STRAIGHT][i - 1][j + 1]) + currentFuel;
					continue;
				}

				// 오른쪽 맨 끝은 오른쪽에서 오는 경우 고려 X
				if (j == col - 1) {
					dp[LEFT][i][j] = Math.min(dp[STRAIGHT][i - 1][j - 1], dp[RIGHT][i - 1][j - 1]) + currentFuel;
					// 가운데에서 오는 경우는 이전에 왼쪽에서 왔던 경우 뿐.
					dp[STRAIGHT][i][j] = dp[LEFT][i - 1][j] + currentFuel;
					continue;
				}

				// i-1번째의 j-1, j, j+1 중 2개를 택하고, 해당하는 곳에서의 방향(0, 1, 2)까지 신경써야 함.
				dp[LEFT][i][j] = Math.min(dp[STRAIGHT][i - 1][j - 1], dp[RIGHT][i - 1][j - 1]) + currentFuel;
				dp[STRAIGHT][i][j] = Math.min(dp[LEFT][i - 1][j], dp[RIGHT][i - 1][j]) + currentFuel;
				dp[RIGHT][i][j] = Math.min(dp[LEFT][i - 1][j + 1], dp[STRAIGHT][i - 1][j + 1]) + currentFuel;
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < col; j++) {
				// 맨 왼쪽에서는 왼쪽에서 오는 경우, 맨 오른쪽 열에서는 오른쪽에서 오는 경우 제외 (불가능한 길이라 0이기 때문)
				if ((i == 0 && j == 0) || (i == 2 && j == col - 1)) {
					continue;
				}
				min = Math.min(min, dp[i][row - 1][j]);
			}
		}

		System.out.println(min);
	}
}
