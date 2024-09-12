package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-04 15min
// https://www.acmicpc.net/problem/13903
public class Attendance {
	static int row;
	static int col;
	static int[][] crossLines;
	static int dirNum;
	static int[][] dir;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		crossLines = new int[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				crossLines[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dirNum = Integer.parseInt(br.readLine());
		dir = new int[dirNum][2];
		for (int i = 0; i < dirNum; i++) {
			st = new StringTokenizer(br.readLine());
			dir[i][0] = Integer.parseInt(st.nextToken());
			dir[i][1] = Integer.parseInt(st.nextToken());
		}

		// 시간 초과
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < col; i++) {
			visited = new boolean[row][col];
			int tempA = bfs(i);
			ans = Math.min(ans, tempA);
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

	static int bfs(int startC) {

		int ans = Integer.MAX_VALUE;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0, startC, 0}); // r, c, distance
		visited[0][startC] = true;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];
			int distance = poll[2];
			if (r == row - 1) {
				ans = distance;
				break;
			}
			for (int i = 0; i < dirNum; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];
				if (tempR >= 0 && tempR < row && tempC >= 0 && tempC < col && !visited[tempR][tempC]) {
					visited[tempR][tempC] = true;
					que.add(new int[] {tempR, tempC, distance + 1});
				}
			}
		}
		return ans;
	}
}
