package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-06-28 35min
// https://www.acmicpc.net/problem/17265
public class InMyLifeWithMath {
	static char[][] map;
	static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());

		map = new char[size][size];
		for (int i = 0; i < size; i++) {
			// map[i] = br.readLine().toCharArray(); // 난 size로 선언했는데, 어떻게 size*10이 가능하지?
			String str = br.readLine();
			for (int j = 0; j < size; j++) {
				// 0 <= num <= 5라서 chatAt 사용 가능.
				map[i][j] = str.charAt(j * 2);
			}
		}

		int[][][] dp = new int[size][size][2];
		dp[0][0][0] = map[0][0] - '0';
		dp[0][0][1] = map[0][0] - '0';

		for (int i = 1; i < size; i++) {
			// 1행
			// 현재 부호라면
			if (map[0][i] == '+' || map[0][i] == '-' || map[0][i] == '*') {
				dp[0][i][0] = dp[0][i][1] = dp[0][i - 1][0];
			} else {
				// 현재 숫자라면
				char leftSign = map[0][i - 1];
				int curNum = map[0][i] - '0';

				if (leftSign == '+') {
					dp[0][i][0] = dp[0][i][1] = dp[0][i - 1][0] + curNum;
				} else if (leftSign == '-') {
					dp[0][i][0] = dp[0][i][1] = dp[0][i - 1][0] - curNum;
				} else {    // min
					dp[0][i][0] = dp[0][i][1] = dp[0][i - 1][0] * curNum;
				}

			}
			// 1열
			// 현재 부호라면
			if (map[i][0] == '+' || map[i][0] == '-' || map[i][0] == '*') {
				dp[i][0][0] = dp[i][0][1] = dp[i - 1][0][0];
			} else {
				// 현재 숫자라면
				char leftSign = map[i - 1][0];
				int curNum = map[i][0] - '0';

				if (leftSign == '+') {
					dp[i][0][0] = dp[i][0][1] = dp[i - 1][0][0] + curNum;
				} else if (leftSign == '-') {
					dp[i][0][0] = dp[i][0][1] = dp[i - 1][0][0] - curNum;
				} else {    // min
					dp[i][0][0] = dp[i][0][1] = dp[i - 1][0][0] * curNum;
				}

			}
		}

		for (int i = 1; i < size; i++) {
			for (int j = 1; j < size; j++) {
				// 현재 부호라면
				if (map[i][j] == '+' || map[i][j] == '-' || map[i][j] == '*') {
					// min
					dp[i][j][0] = Math.min(dp[i - 1][j][0], dp[i][j - 1][0]);
					// max
					dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i][j - 1][1]);
				} else {
					// 현재 숫자라면
					char upSign = map[i - 1][j];
					char leftSign = map[i][j - 1];
					int curNum = map[i][j] - '0';

					if (upSign == '+') {
						if (leftSign == '+') {
							// min
							dp[i][j][0] = Math.min(dp[i - 1][j][0], dp[i][j - 1][0]) + curNum;
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i][j - 1][1]) + curNum;
						} else if (leftSign == '-') {    // min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] + curNum, dp[i][j - 1][0] - curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] + curNum, dp[i][j - 1][1] - curNum);
						} else { // '*'
							// min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] + curNum, dp[i][j - 1][0] * curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] + curNum, dp[i][j - 1][1] * curNum);
						}

					} else if (upSign == '-') {
						if (leftSign == '+') {
							// min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] - curNum, dp[i][j - 1][0] + curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] - curNum, dp[i][j - 1][1] + curNum);
						} else if (leftSign == '-') {    // min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] - curNum, dp[i][j - 1][0] - curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] - curNum, dp[i][j - 1][1] - curNum);
						} else { // '*'
							// min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] - curNum, dp[i][j - 1][0] * curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] - curNum, dp[i][j - 1][1] * curNum);
						}
					} else if (upSign == '*') {
						if (leftSign == '+') {
							// min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] * curNum, dp[i][j - 1][0] + curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] * curNum, dp[i][j - 1][1] + curNum);
						} else if (leftSign == '-') {    // min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] * curNum, dp[i][j - 1][0] - curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] * curNum, dp[i][j - 1][1] - curNum);
						} else { // '*'
							// min
							dp[i][j][0] = Math.min(dp[i - 1][j][0] * curNum, dp[i][j - 1][0] * curNum);
							// max
							dp[i][j][1] = Math.max(dp[i - 1][j][1] * curNum, dp[i][j - 1][1] * curNum);
						}
					}
				}
			}

		}

		// dp
		System.out.println(dp[size - 1][size - 1][1] + " " + dp[size - 1][size - 1][0]);

		// dfs
		// char는 -'0' 필수.
		// dfs(0, 0, map[0][0] - '0');

		// System.out.	println(max + " " + min);

	}

	static int[][] dir = {{0, 1}, {1, 0}};
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;

	static void dfs(int r, int c, int sum) {

		// System.out.println("cur R: " + r + ", cur C: " + c + ", cur Sum: " + sum);

		// size와 같으면 안 됨.
		if (r == size - 1 && c == size - 1) {
			// System.out.println("last sum: " + sum + ", min: " + min + ", max: " + max);
			min = Math.min(min, sum);
			max = Math.max(max, sum);
			return;
		}

		for (int i = 0; i < 2; i++) {
			int tempR = r + dir[i][0];
			int tempC = c + dir[i][1];

			if (tempR < size && tempC < size) {

				if (map[r][c] == '+') {
					dfs(tempR, tempC, sum + (map[tempR][tempC] - '0'));
				} else if (map[r][c] == '-') {
					// 그냥 map[tempR][tempC] - '0'로 사용하면, char - '0'이 아니기 때문에 괄호 필수.
					dfs(tempR, tempC, sum - (map[tempR][tempC] - '0'));
				} else if (map[r][c] == '*') {
					dfs(tempR, tempC, sum * (map[tempR][tempC] - '0'));
				} else {
					dfs(r + dir[i][0], c + dir[i][1], sum);
				}
			}

		}

	}
}
