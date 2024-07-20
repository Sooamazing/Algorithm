package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-20 15min
// https://www.acmicpc.net/problem/14716
public class Banner {

	static int row;
	static int col;
	static int[][] banner;

	// static int[][] dir = new int[][]{{0, 1}, {1, 0}, {1, 1}, {1, -1}}; // 상, 하, 좌, 우 전부 가야 함.
	static int[][] dir = new int[][] {
		{0, 1}, {1, 0}, {0, -1}, {-1, 0},
		{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		banner = new int[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				banner[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ans = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (banner[i][j] == 1) {
					bfs(i, j);
					ans++;
				}
			}
		}

		System.out.println(ans);

	}

	static void bfs(int r, int c) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {r, c});
		banner[r][c] = 0;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			r = poll[0];
			c = poll[1];

			for (int i = 0; i < 8; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];

				if (nr >= 0 && nr < row
					&& nc >= 0 && nc < col
					&& banner[nr][nc] == 1) {
					banner[nr][nc] = 0;
					que.add(new int[] {nr, nc});
				}
			}
		}
	}
}
