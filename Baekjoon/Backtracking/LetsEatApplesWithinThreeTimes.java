package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-22 45min
// https://www.acmicpc.net/problem/26169
public class LetsEatApplesWithinThreeTimes {
	static int[][] board;
	static boolean[][] visited;
	static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		board = new int[5][5];
		visited = new boolean[5][5];
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int startR = Integer.parseInt(st.nextToken());
		int startC = Integer.parseInt(st.nextToken());
		if (board[startR][startC] == -1) {
			System.out.println(0);
			return;
		}
		System.out.println(checkApples(startR, startC, 0, board[startR][startC]) ? 1 : 0);
	}

	static boolean checkApples(int r, int c, int distance, int apple) {

		visited[r][c] = true; // 지나간 칸은 장애물로 변경

		if (distance > 3) {
			return apple - board[r][c] >= 2;
		}

		for (int i = 0; i < 4; i++) {
			int tempR = r + dir[i][0];
			int tempC = c + dir[i][1];
			if (tempR < 0 || tempC < 0 || tempR >= 5 || tempC >= 5
				|| board[tempR][tempC] == -1
				|| visited[tempR][tempC]) {
				continue;
			}

			boolean couldEat2ApplesAtLeast = checkApples(tempR, tempC, distance + 1, apple + board[tempR][tempC]);
			visited[tempR][tempC] = false;

			if (couldEat2ApplesAtLeast) {
				return true;
			}
		}

		return false;
	}
}
