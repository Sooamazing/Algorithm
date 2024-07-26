package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-26 25min
// https://www.acmicpc.net/problem/18404
public class WiseNight {
	static int size;
	static int enemyNum;
	static int[][] chess;
	static int[][] enemies;
	static int arrMax;
	static int enemy;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		size = Integer.parseInt(st.nextToken());
		enemyNum = Integer.parseInt(st.nextToken());
		chess = new int[size][size];
		arrMax = size * size;
		enemy = arrMax + 1;
		// Arrays.fill(chess, arrMax); // ArrayStoreException:
		for (int i = 0; i < size; i++) {
			Arrays.fill(chess[i], arrMax);
		}
		st = new StringTokenizer(br.readLine());
		int startR = Integer.parseInt(st.nextToken()) - 1;
		int startC = Integer.parseInt(st.nextToken()) - 1;

		enemies = new int[enemyNum][2];
		for (int i = 0; i < enemyNum; i++) {
			st = new StringTokenizer(br.readLine());
			int enemyR = Integer.parseInt(st.nextToken()) - 1;
			int enemyC = Integer.parseInt(st.nextToken()) - 1;
			chess[enemyR][enemyC] = enemy;
			enemies[i][0] = enemyR;
			enemies[i][1] = enemyC;
		}

		bfs(startR, startC);

		for (int i = 0; i < enemyNum; i++) {
			sb.append(chess[enemies[i][0]][enemies[i][1]]).append(" ");
		}
		System.out.println(sb);

	}

	static int[][] dir = new int[][] {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};

	static void bfs(int startR, int startC) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC, 0});
		chess[startR][startC] = 0;

		int goal = enemy;
		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int r = cur[0];
			int c = cur[1];
			int cnt = cur[2];

			if (goal == 0) {
				break;
			}

			for (int i = 0; i < 8; i++) {
				int nextR = r + dir[i][0];
				int nextC = c + dir[i][1];
				if (nextR >= 0 && nextR < size
					&& nextC >= 0 && nextC < size
					&& (chess[nextR][nextC] == arrMax
					|| chess[nextR][nextC] == enemy)) {
					// chess[nextR][nextC] > cnt + 1 조건으로 최소 보장 가능.
					if (chess[nextR][nextC] == enemy) {
						goal--;
					}
					chess[nextR][nextC] = cnt + 1;
					que.add(new int[] {nextR, nextC, cnt + 1});
				}
			}
		}
	}
}
