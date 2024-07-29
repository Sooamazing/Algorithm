package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 24-07-29 30min
// https://www.acmicpc.net/problem/16113
// 반례: https://www.acmicpc.net/board/view/64923
// 1, 0 처리 헷갈려서 틀림.
public class Signal {
	static int row;
	static int col;
	static int[][] fonts;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int length = Integer.parseInt(br.readLine());
		String signal = br.readLine();
		row = 5;
		col = length / 5;
		fonts = new int[5][col];
		visited = new boolean[5][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// 현재 charAt 위치 (col) * i + j
				if (signal.charAt((col) * i + j) == '#') {
					visited[i][j] = false;
					fonts[i][j] = 0;
				} else {
					visited[i][j] = true;
					fonts[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (!visited[i][j] && fonts[i][j] == 0) {
					int fontPixels = bfs(i, j);
					if (fontPixels == 5) {
						sb.append(1);
					} else if (fontPixels == 7) {
						sb.append(7);
					} else if (fontPixels == 9) {
						sb.append(4);
					} else if (fontPixels == 13) {
						sb.append(8);
					} else if (fontPixels == 11) {
						// 2, 3, 5
						if (fonts[i + 1][j + 2] == 0) {
							if (fonts[i + 3][j + 2] == 0) {
								sb.append(3);
							} else {
								sb.append(2);
							}
						} else {
							sb.append(5);
						}
					} else {
						// 12인 경우, 0, 6, 9
						if (fonts[i + 3][j] == 0) {
							if (fonts[i + 1][j + 2] == 0) {
								sb.append(0);
							} else {
								sb.append(6);
							}
						} else {
							sb.append(9);
						}
					}
				}
			}
		}

		System.out.println(sb);

	}

	static int[][] dir = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

	static int bfs(int startR, int startC) {

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC});
		visited[startR][startC] = true;

		int ans = 1;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];
			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];

				if (tempR >= 0 && tempR < row
					&& tempC >= 0 && tempC < col
					&& !visited[tempR][tempC]
					&& fonts[tempR][tempC] == 0) {
					visited[tempR][tempC] = true;
					que.add(new int[] {tempR, tempC});
					ans++;
				}
			}
		}
		return ans;
	}
}
