package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-04 30min
// https://www.acmicpc.net/problem/3495
public class ASCIIShapes {
	static int row;
	static int col;
	static char[][] memos;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		memos = new char[row][col];
		visited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			// char Array로 받을 수 있음.
			memos[i] = br.readLine().toCharArray();
		}

		int area = bfs(0, 0);
		System.out.println(area);
	}

	static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	private static int bfs(int startR, int startC) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC, memos[startR][startC] * 2, 0}); // r, c, sum, dir
		// 1/2 피하기 위해 *2 실행.
		visited[startR][startC] = true;

		int sum = 0;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];
			sum = poll[2];
			char curChar = memos[r][c];
			if (curChar == '.') {
				sum += 2;
				for (int i = 0; i < 4; i++) {
					int tempR = r + dir[i][0];
					int tempC = c + dir[i][1];
					if (tempR >= 0 && tempR < row
						&& tempC >= 0 && tempC < col
						&& !visited[tempR][tempC]) {
						visited[tempR][tempC] = true;
						que.add(new int[] {tempR, tempC, poll[2]});
					}
				}
			} else {
				sum += 1;

			}
		}
		return sum;
	}
}
