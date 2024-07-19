package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-19 30min
// https://www.acmicpc.net/problem/6593
public class SangbeomBuilding {

	static int[][] dir = new int[][] {{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}};
	static int height;
	static int row;
	static int col;
	static int[][][] building;
	// static boolean[][][] visited;
	static int goalH;
	static int goalR;
	static int goalC;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while (true) {

			st = new StringTokenizer(br.readLine());
			height = Integer.parseInt(st.nextToken());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			if (height == 0 && row == 0 && col == 0) {
				break;
			}

			building = new int[height][row][col];
			// visited = new boolean[height][row][col];

			int startH = 0;
			int startR = 0;
			int startC = 0;

			goalH = 0;
			goalR = 0;
			goalC = 0;

			for (int h = 0; h < height; h++) {
				for (int r = 0; r < row; r++) {
					String str = br.readLine();
					for (int c = 0; c < col; c++) {
						char ch = str.charAt(c);
						if (ch == '.' || ch == 'S') {
							building[h][r][c] = 0;
							if (ch == 'S') {
								startH = h;
								startR = r;
								startC = c;
							}
						} else if (ch == '#') {
							building[h][r][c] = -1;
						} else {
							building[h][r][c] = 2;
							goalH = h;
							goalR = r;
							goalC = c;
						}
					}
				}
				br.readLine();
			}

			int reachedTime = getReachedTime(startH, startR, startC, 0);
			if (reachedTime == -1) {
				sb.append("Trapped!\n");
			} else {
				sb.append("Escaped in ").append(reachedTime).append(" minute(s).\n");
			}

		}

		System.out.println(sb);

	}

	static int getReachedTime(int h, int r, int c, int t) {

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {h, r, c, 0});
		// visited[h][r][c] = true;
		building[h][r][c] = -1;

		boolean reached = false;
		int time = 0;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			h = poll[0];
			r = poll[1];
			c = poll[2];
			t = poll[3];

			if (h == goalH
				&& r == goalR
				&& c == goalC) {
				reached = true;
				time = t;
				break;
			}

			for (int i = 0; i < 6; i++) {
				int tempH = h + dir[i][0];
				int tempR = r + dir[i][1];
				int tempC = c + dir[i][2];
				int tempT = t + 1;

				if (tempH >= 0 && tempH < height && tempR >= 0 && tempR < row && tempC >= 0 && tempC < col
					&& building[tempH][tempR][tempC] != -1) {
					building[tempH][tempR][tempC] = -1;
					que.add(new int[] {tempH, tempR, tempC, tempT});
				}
			}
		}

		if (reached) {
			return time;
		} else {
			return -1;
		}

	}
}
