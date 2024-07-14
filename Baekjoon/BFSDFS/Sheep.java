package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-14 35min
// https://www.acmicpc.net/problem/3184
public class Sheep {
	static int row;
	static int col;
	static int[][] backGarden;
	static int[] ans = new int[2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		backGarden = new int[row][col];
		for (int i = 0; i < row; i++) {
			String str = br.readLine();
			for (int j = 0; j < col; j++) {
				char c = str.charAt(j);
				if (c == '#') {
					backGarden[i][j] = -1;
				} else if (c == 'o') {
					backGarden[i][j] = 1;
				} else if (c == 'v') {
					backGarden[i][j] = 2;
				} else {
					// .
					backGarden[i][j] = 3;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (backGarden[i][j] != 0) {
					bfs(i, j);
				}
			}
		}

		System.out.println(ans[0] + " " + ans[1]);

	}

	static int[][] dir = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	static void bfs(int startR, int startC) {

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC, 0, 0}); // r, c, sheep, wolf

		int wolf = 0;
		int sheep = 0;
		if (backGarden[startR][startC] == 1) {
			sheep++;
		} else if (backGarden[startR][startC] == 2) {
			wolf++;
		}
		backGarden[startR][startC] = -1;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];
			// sheep = poll[2];
			// wolf = poll[3];

			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];
				if (tempR >= 0 && tempR < row && tempC >= 0 && tempC < col && backGarden[tempR][tempC] > 0) {
					int cur = backGarden[tempR][tempC];
					if (cur == 1) {
						// sheep
						// que.add(new int[] {tempR, tempC, 1, 0});
						sheep++;
					} else if (cur == 2) {
						// wolf
						// que.add(new int[] {tempR, tempC, 0, 1});
						wolf++;
					}
					backGarden[tempR][tempC] = -1;
					que.add(new int[] {tempR, tempC});
				}
			}
		}
		if (wolf < sheep) {
			// sheep
			ans[0] += sheep;
		} else {
			// wolf
			ans[1] += wolf;
		}
	}
}
