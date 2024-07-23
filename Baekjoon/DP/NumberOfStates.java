package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-23 30min
// https://www.acmicpc.net/problem/15724
public class NumberOfStates {

	static int row, col;
	static int[][] territories;
	static int[][] dir = new int[][] {{0, 1}, {1, 0}};
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		territories = new int[row + 1][col + 1];
		for (int i = 1; i <= row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= col; j++) {
				// territories[i][j] = Integer.parseInt(st.nextToken());
				// 누적합
				int cur = Integer.parseInt(st.nextToken());
				territories[i][j] = territories[i - 1][j] + territories[i][j - 1]
					- territories[i - 1][j - 1]
					+ cur;
			}
		}

		int testCaseNum = Integer.parseInt(br.readLine());
		while (testCaseNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			int r1 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());

			// 누적합 풀이 - small에는 -1해야 하는 점 유의.
			int territorySmall = territories[r1 - 1][c1 - 1];
			int smallRow = territories[r1 - 1][c2];
			int smallCol = territories[r2][c1 - 1];
			int territoryLarge = territories[r2][c2];

			sb.append(territoryLarge - (smallRow + smallCol) + territorySmall).append("\n");

			// bfs로 풀이 - 시간 초과
			// visited = new boolean[row + 1][col + 1];
			// sb.append(sumOfTerritories(r1, c1, r2, c2)).append("\n");

		}

		System.out.println(sb);

	}

	static int sumOfTerritories(int r1, int c1, int r2, int c2) {

		Queue<int[]> que = new LinkedList<>();
		visited[r1][c1] = true;
		que.add(new int[] {r1, c1});
		int sum = territories[r1][c1]; // 0으로 초기화하면 안 됨.

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];

			for (int i = 0; i < 2; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];

				if (tempR > 0 && tempR <= r2 && tempC > 0 && tempC <= c2 && !visited[tempR][tempC]) {
					visited[tempR][tempC] = true;
					que.add(new int[] {tempR, tempC});
					sum += territories[tempR][tempC];
				}
			}

		}
		return sum;
	}
}
