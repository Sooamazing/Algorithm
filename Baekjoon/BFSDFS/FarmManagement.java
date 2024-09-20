package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-05 20min, 24-09-20 200min
// https://www.acmicpc.net/problem/1245
// 반례: https://www.acmicpc.net/board/view/142917 - 이해 안 감.
public class FarmManagement {
	static int row;
	static int col;
	static int[][] farm;
	static boolean[][] visited;
	static int[][] dir = {
		{-1, 0}, {1, 0}, {0, -1}, {0, 1},
		{-1, -1}, {-1, 1}, {1, -1}, {1, 1}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		farm = new int[row][col];
		visited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				farm[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ans = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (visited[i][j]) {
					continue;
				}
				if (isTop(i, j, farm[i][j])) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	static boolean isTop(int startR, int startC, int height) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC});
		visited[startR][startC] = true;

		boolean isTop = true;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];

			for (int i = 0; i < 8; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];

				if (tempR < 0 || tempR >= row
					|| tempC < 0 || tempC >= col) {
					continue;
				}

				if (farm[tempR][tempC] == height
					&& !visited[tempR][tempC]) {
					// 높이가 같고, 방문한 적 없는 경우 방문 처리
					visited[tempR][tempC] = true;
					// 이어진 같은 높이를 돌며 산봉우리인지 확인
					que.add(new int[] {tempR, tempC});
				} else if (farm[tempR][tempC] > height) {
					// 주위 높이가 더 높은 경우 산봉우리가 아님
					isTop = false;
				}
			}
		}

		return isTop;
	}
}
