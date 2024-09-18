package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 3 7 100
// 0 0 1 0 2 0 0
// 0 0 1 0 0 0 0
// 0 0 0 0 0 0 0
// 8
// https://www.acmicpc.net/board/view/146017
// 24-09-18 65min
// https://www.acmicpc.net/problem/17836
public class SaveThePrincess {
	static int row, col, limit;
	static int[][] castle;
	static boolean[][][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		limit = Integer.parseInt(st.nextToken());

		castle = new int[row][col];
		visited = new boolean[row][col][2];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				castle[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ans = bfs(0, 0);
		System.out.println(ans == -1 ? "Fail" : ans);

	}

	static int[][] dir = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

	static int bfs(int startR, int startC) {
		// PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> {
		// 	return b[3] - a[3];
		// });
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC, 0, 0}); // r, c, hasGram(1), distance
		visited[startR][startC][0] = true;
		int gramDistance = limit;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];
			int hasGram = poll[2];
			int distance = poll[3];
			if (distance > limit) {
				return -1;
			}
			if (r == row - 1 && c == col - 1) {
				return distance;
			}
			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];
				if (tempR >= 0 && tempR < row && tempC >= 0 && tempC < col) {
					if (distance > gramDistance) {
						// gram을 획득한 이후라면 각 차원에서만 움직임.
						if (!visited[tempR][tempC][hasGram]) {
							// gram 획득한 차원
							if (hasGram == 1) {
								visited[tempR][tempC][hasGram] = true;
								que.add(new int[] {tempR, tempC, hasGram, distance + 1});
							} else {
								// gram 획득 X, 벽 없는 곳만 가능.
								if (castle[tempR][tempC] == 0) {
									{
										visited[tempR][tempC][hasGram] = true;
										que.add(new int[] {tempR, tempC, hasGram, distance + 1});
									}
								}
							}
						}
					} else {
						// gram 획득 이전이라면
						if (!visited[tempR][tempC][hasGram]) {
							if (castle[tempR][tempC] == 0) {
								// 벽 없는 곳
								visited[tempR][tempC][hasGram] = true;
								// visited[tempR][tempC][1] = true;
								que.add(new int[] {tempR, tempC, hasGram, distance + 1});
							} else if (castle[tempR][tempC] == 2) {
								// gram
								visited[tempR][tempC][hasGram] = true;
								visited[tempR][tempC][1] = true;

								gramDistance = distance;

								que.add(new int[] {tempR, tempC, 1, distance + 1});
							}
						}
					}
				}
			}
		}
		return -1;
	}
}
