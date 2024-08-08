package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-08 15min dfs 시간 초과, bfs 통과
// https://www.acmicpc.net/problem/27211
public class DonutPlanet {
	static int row;
	static int col;
	static boolean[][] donuts;
	static int[][] dir = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		donuts = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				donuts[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false; // 갈 수 없는 곳은 방문 처리, true
			}
		}

		int ans = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (!donuts[i][j]) {
					// dfs(i, j);
					bfs(i, j);
					ans++;
				}
			}
		}

		System.out.println(ans);

	}

	static void bfs(int startR, int startC) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC});
		donuts[startR][startC] = true;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];

			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];

				if (tempR < 0) {
					tempR = row - 1;
				} else if (tempR == row) {
					tempR = 0;
				}

				if (tempC < 0) {
					tempC = col - 1;
				} else if (tempC == col) {
					tempC = 0;
				}

				if (!donuts[tempR][tempC]) {
					donuts[tempR][tempC] = true;
					que.add(new int[] {tempR, tempC});
				}
			}
		}
	}

	static void dfs(int r, int c) {

		donuts[r][c] = true;

		for (int i = 0; i < 4; i++) {
			int tempR = r + dir[i][0];
			int tempC = c + dir[i][1];

			if (tempR < 0) {
				tempR = row - 1;
			} else if (tempR == row) {
				tempR = 0;
			}

			if (tempC < 0) {
				tempC = col - 1;
			} else if (tempC == col) {
				tempC = 0;
			}

			if (!donuts[tempR][tempC]) {
				dfs(tempR, tempC);
			}
		}
	}

}
