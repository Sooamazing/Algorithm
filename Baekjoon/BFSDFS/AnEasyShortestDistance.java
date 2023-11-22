// https://www.acmicpc.net/problem/14940

package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AnEasyShortestDistance {
	static int[][] arr;
	static boolean[][] toGo;
	static StringBuilder sb;
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n + 2][m + 2];
		toGo = new boolean[n + 2][m + 2];
		int startX = 0;
		int startY = 0;

		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < m + 1; j++) {
				int temp = arr[i][j] = Integer.parseInt(st.nextToken());
				if (temp == 1) {
					toGo[i][j] = true;
				}
				if (temp == 2) {
					startX = i;
					startY = j;
					arr[i][j] = 0;
				}
			}
		} // 입력 및 초기화 완료

		bfs(startX, startY);

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {

				// 원래 갈 수 없는 땅인 위치는 0을 출력하고
				// 원래 갈 수 있는 땅인 부분 중에서 도달할 수 없는 위치는 -1을 출력한다.
				if (toGo[i][j] && arr[i][j] == 1) {
					sb.append(-1).append(' ');
				} else {
					sb.append(arr[i][j]).append(' ');
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	static void bfs(int x, int y) {
		Queue<int[]> que = new LinkedList<>();
		int[][] dxdy = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

		que.add(new int[] {x, y});
		toGo[x][y] = false;

		while (!que.isEmpty()) {
			int[] node = que.poll();

			for (int i = 0; i < 4; i++) {
				int tempX = node[0] + dxdy[i][0];
				int tempY = node[1] + dxdy[i][1];
				int cur = arr[node[0]][node[1]];

				if (toGo[tempX][tempY] && arr[tempX][tempY] == 1) {
					que.add(new int[] {tempX, tempY});
					toGo[tempX][tempY] = false;
					arr[tempX][tempY] = cur + 1;
				}
			}
		}
	}
}
