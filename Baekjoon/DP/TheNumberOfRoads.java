package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 4 4
// 4
// 1 1 2 1
// 2 1 3 1
// 2 2 2 3
// 1 3 2 3
// 24-07-31 50min
// https://www.acmicpc.net/problem/1577
// 반례: https://www.acmicpc.net/board/view/77301
public class TheNumberOfRoads {
	static final int DOWN = 0;
	static final int RIGHT = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());

		int brokenRoadNum = Integer.parseInt(br.readLine());
		boolean[][][] brokenRoads = new boolean[row + 1][col + 1][2];
		for (int i = 0; i < brokenRoadNum; i++) {
			st = new StringTokenizer(br.readLine());
			int r1 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());

			// 이전 경로의 방향에 부서진 도로 저장.
			if (r1 < r2) {
				brokenRoads[r1][c1][DOWN] = true;
			} else if (c1 < c2) {
				brokenRoads[r1][c1][RIGHT] = true;
			} else if (r1 > r2) {
				brokenRoads[r2][c2][DOWN] = true;
			} else {
				brokenRoads[r2][c2][RIGHT] = true;
			}
		}

		// 2의 64승은 long.
		long[][] dp = new long[row + 1][col + 1];
		for (int i = 0; i < row + 1; i++) {
			for (int j = 0; j < col + 1; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = 1; // 0이면 모두가 0
				} else if (i == 0) {
					// 0행
					if (!brokenRoads[i][j - 1][RIGHT]) {
						// 이전 도로와 연결되어 있으면 (부러지지 않았으면)
						dp[i][j] = dp[i][j - 1];
					}
				} else if (j == 0) {
					// 0열
					if (!brokenRoads[i - 1][j][DOWN]) {
						// 이전 도로와 연결되어 있으면 (부러지지 않았으면)
						dp[i][j] = dp[i - 1][j];
					}
				} else {
					boolean leftBroken = brokenRoads[i][j - 1][RIGHT];
					boolean upBroken = brokenRoads[i - 1][j][DOWN];
					if (!leftBroken && !upBroken) {
						// 둘 다 부서지지 않았다면
						dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
					} else if (leftBroken && !upBroken) {
						// 왼쪽만 부서졌다면
						dp[i][j] = dp[i - 1][j];
					} else if (!leftBroken) {
						// 위만 부서졌다면
						dp[i][j] = dp[i][j - 1];
					}
					// 그냥 leftBroken, upBroken 조건끼리만 하면 조건이 명확해지지 않아서 정확히 표기 필요.
					// else if 대신 else로 한 번에 처리하면, 둘 다 부서진 경우에 대해서 0 처리가 안 됨!!
				}
			}
		}

		System.out.println(dp[row][col]);
	}
}
