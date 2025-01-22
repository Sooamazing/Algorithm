package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-22 35min
// https://www.acmicpc.net/problem/10164
public class GridPath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		int bifurcation = Integer.parseInt(st.nextToken());

		long[][] dp = new long[row][col];

		// 분기점이 있는 경우
		if (bifurcation != 0) {
			int bifurcationRow = bifurcation / col;
			int bifurcationCol = bifurcation % col - 1;

			if (bifurcationCol == -1) {
				bifurcationRow -= 1;
				bifurcationCol = col - 1;
			}

			for (int i = 0; i <= bifurcationRow; i++) {
				for (int j = 0; j <= bifurcationCol; j++) {
					if (i == 0 && j == 0) {
						dp[0][0] = 1;
						continue;
					}
					if (i == 0) {
						dp[0][j] = 1;
						continue;
					}

					if (j == 0) {
						dp[i][0] = 1;
						continue;
					}

					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}

			for (int i = bifurcationRow; i < row; i++) {
				for (int j = bifurcationCol; j < col; j++) {
					if (i == bifurcationRow && j == bifurcationCol) {
						continue;
					}

					if (i == bifurcationRow) {
						dp[bifurcationRow][j] = dp[bifurcationRow][bifurcationCol];
						continue;
					}

					if (j == bifurcationCol) {
						dp[i][bifurcationCol] = dp[bifurcationRow][bifurcationCol];
						continue;
					}

					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}

		} else {

			// 분기점이 없는 경우
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i == 0 && j == 0) {
						dp[0][0] = 1;
						continue;
					}
					if (i == 0) {
						dp[0][j] = 1;
						continue;
					}

					if (j == 0) {
						dp[i][0] = 1;
						continue;
					}

					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}

		}

		System.out.println(dp[row - 1][col - 1]);
	}
}
