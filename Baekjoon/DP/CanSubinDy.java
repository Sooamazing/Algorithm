package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-30 30min
// https://www.acmicpc.net/problem/14585
// 반례: https://www.acmicpc.net/board/view/32021
// 6 2
// 0 1
// 1 0
// 0 3
// 1 2
// 2 1
// 3 0
// 0 열, 행에도 사탕 바구니 존재할 수 있음.
public class CanSubinDy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());
		int[][] candyLocation = new int[301][301];
		int numberOfCandy = Integer.parseInt(st.nextToken());
		int row = 0;
		int col = 0;
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			candyLocation[r][c] = numberOfCandy;
			row = Math.max(row, r);
			col = Math.max(col, c);
		}
		int[][] dp = new int[row + 1][col + 1];
		// 첫째 행, 열 초기화
		for (int i = 1; i <= row; i++) {
			dp[i][0] = dp[i - 1][0];
			// 사탕 원래 있었는지, 남아 있는지 확인 필요.
			if (candyLocation[i][0] > 0
				&& candyLocation[i][0] - i > 0) {
				dp[i][0] += (candyLocation[i][0] - i);
			}
		}
		for (int i = 1; i <= col; i++) {
			dp[0][i] = dp[0][i - 1];
			if (candyLocation[0][i] > 0
				&& candyLocation[0][i] - i > 0) {
				dp[0][i] += (candyLocation[0][i] - i);
			}
		}

		// 두번째부터 좌, 상 비교 dp 시작.
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				if (candyLocation[i][j] > 0
					&& candyLocation[i][j] - (i + j) > 0) {
					dp[i][j] += (candyLocation[i][j] - (i + j));
				}
			}
		}

		System.out.println(dp[row][col]);

	}
}
