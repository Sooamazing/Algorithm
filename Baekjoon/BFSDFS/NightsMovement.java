package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NightsMovement {

	static int[] goal;
	static int[][] visited;
	static Queue<int[]> que;
	static int[][] dxdy = {
		{1, 2}, {2, 1},
		{2, -1}, {1, -2},
		{-1, -2}, {-2, -1},
		{-2, 1}, {-1, 2}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int N;
		int[] start = new int[2];
		goal = new int[2];

		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			visited = new int[N + 4][N + 4];

			// 역시나.. 2~N+1 까지로 설정하기 위해서는 < N+2 로 하는 idx error.
			for (int j = 2; j < N + 2; j++) {
				for (int k = 2; k < N + 2; k++) {
					visited[j][k] = 1;
				}
			}
			st = new StringTokenizer(br.readLine());
			start[0] = Integer.parseInt(st.nextToken()) + 2;
			start[1] = Integer.parseInt(st.nextToken()) + 2;

			st = new StringTokenizer(br.readLine());
			goal[0] = Integer.parseInt(st.nextToken()) + 2;
			goal[1] = Integer.parseInt(st.nextToken()) + 2;

			que = new LinkedList<>();
			// 입력 및 초기화 완료

			visited[start[0]][start[1]] = 0;
			que.add(new int[] {start[0], start[1], 0});

			System.out.println(bfs());
		}

	}

	static int bfs() {

		while (!que.isEmpty()) {

			int[] arr = que.poll();
			int x = arr[0];
			int y = arr[1];
			int cnt = arr[2];

			if (x == goal[0] && y == goal[1]) {
				return cnt;
			}

			for (int[] item : dxdy) {
				int tempX = x + item[0];
				int tempY = y + item[1];

				if (visited[tempX][tempY] == 1) {
					visited[tempX][tempY] = 0;
					que.add(new int[] {tempX, tempY, cnt + 1});
				}
			}
		}
		return -1;
	}

}