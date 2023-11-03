package Programmers.BFSDFS;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {

	public static void main(String[] args) {

		// int a = solution(
		// 	new int[][] {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
		// int b = solution(
		// 	new int[][] {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}});
		int c = solution(
			new int[][] {
				{1, 1, 1, 1 },
				{1, 0, 0, 1 },
				{1, 1, 1, 1 },
				{1, 1, 1, 1}});
		// System.out.println("a = " + a);
		// System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	static public int solution(int[][] maps) {
		// int answer = 0;
		int[][] dxdy = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
		Queue<int[]> que = new LinkedList<>();

		int N = maps.length;
		int M = maps[0].length;
		boolean[][] visited = new boolean[N][M];

		visited[0][0] = true;
		que.add(new int[] {0, 0});
		// int x = 0, y = 0;

		while (!que.isEmpty()) {
			int[] cur = que.poll();
			// x = cur[0];
			// y = cur[1];
			int x = cur[0];
			int y = cur[1];

			if (x == N - 1 && y == M - 1) {
				return maps[N - 1][M - 1];
			}

			for (int i = 0; i < 4; i++) {
				int tempX = x + dxdy[i][0];
				int tempY = y + dxdy[i][1];

				if (tempX >= 0 && tempX < N && tempY >= 0 && tempY < M && maps[tempX][tempY] == 1) {
					maps[tempX][tempY] = maps[x][y] + 1;
					que.add(new int[] {tempX, tempY});
				}
			}
		}
		//
		// if (x == N - 1 && y == M - 1) {
		// 	return maps[x][y];
		// }

		return -1;
	}
}
