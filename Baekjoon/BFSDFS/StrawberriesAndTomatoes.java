package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-04 40min
// https://www.acmicpc.net/problem/25565
public class StrawberriesAndTomatoes {
	static int row;
	static int col;
	static int goal;
	static int[][] gardens;
	static boolean[][] visited;
	static int[][] dir = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		goal = Integer.parseInt(st.nextToken());
		gardens = new int[row + 1][col + 1];
		visited = new boolean[row + 1][col + 1];
		for (int i = 1; i <= row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= col; j++) {
				gardens[i][j] = Integer.parseInt(st.nextToken());
				if (gardens[i][j] == 0) {
					visited[i][j] = true;
				}
			}
		}

		int ans1 = 0;
		int ans2 = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (gardens[i][j] == 1) {
					if (visited[i][j]) {
						ans2++;
					}
					ans1 = dfs(i, j, 1, 0, false);
					System.out.println(ans1);
					return;
				}
			}
			// if (ans1 == 0) {
			// 	ans1 = ans2;
			// } else {
			// 	System.out.println(goal - ans2);
			// 	return;
			// }
		}
	}

	static int dfs(int r, int c, int depth, int dirIdx, boolean isSecond) {
		int sum = 0;
		int ans = 0;
		if (depth == goal) {
			return goal;
		}

		visited[r][c] = true;
		for (int i = dirIdx; i < 4; i++) {
			int tempR = r + dir[i][0];
			int tempC = c + dir[i][1];
			if (tempR >= 1 && tempR <= row && tempC >= 1 && tempC <= col) {
				if (!visited[tempR][tempC] && !isSecond) {
					visited[tempR][tempC] = true;
					sum = dfs(tempR, tempC, depth + 1, i, isSecond);
					if (sum == goal) {
						isSecond = true;
					}
				} else if (isSecond && gardens[tempR][tempC] == 1) {
					if (visited[tempR][tempC]) {
						ans++;
						sum = dfs(tempR, tempC, depth + 1, i, isSecond);
					} else {
						visited[tempR][tempC] = true;
						sum = dfs(tempR, tempC, depth + 1, i, isSecond);
					}
				}

			}
		}
		return ans;
	}
}
