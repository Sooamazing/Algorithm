package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheTransferOfPipes {

	static final int TOTAL = 0;

	static final int HORIZONTAL = 1; // 가로
	static final int DIAGONAL = 2; // 대각선
	static final int VERTICAL = 3; // 세로

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int[][] arr = new int[size + 1][size + 1];
		int[][][] dp = new int[size + 1][size + 1][4];

		for (int i = 1; i <= size; i++) {
			String[] split = br.readLine().split(" ");
			for (int j = 1; j <= size; j++) {
				arr[i][j] = Integer.parseInt(split[j - 1]);
			}
		}

		for (int i = 1; i <= size; i++) {
			for (int j = 2; j <= size; j++) {
				if (i == 1 && j == 2) {
					dp[1][2][HORIZONTAL] = 1;
					continue;
				}
				// 가로에서 온 경우
				dp[i][j][HORIZONTAL] = dp[i - 1][j - 1][DIAGONAL] + dp[i][j - 1][HORIZONTAL];

				// 세로에서 온 경우
				dp[i][j][VERTICAL] = dp[i - 1][j - 1][DIAGONAL] + dp[i - 1][j][VERTICAL];

				// 대각선에서 온 경우

				dp[i][j][DIAGONAL] = dp[i - 1][j - 1][DIAGONAL] + dp[i - 1][j][VERTICAL] + dp[i][j - 1][HORIZONTAL];

				if (arr[i][j] == 1) {
					// 장애물이 있는 경우
				}
			}
		}

		System.out.println(dp[size][size][0]);

	}
}
