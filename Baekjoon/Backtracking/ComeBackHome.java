package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-20 20min
// https://www.acmicpc.net/problem/1189
public class ComeBackHome {
	static int rowSize, columnSize, goalNumber, result;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		rowSize = Integer.parseInt(st.nextToken());
		columnSize = Integer.parseInt(st.nextToken());
		goalNumber = Integer.parseInt(st.nextToken());

		visited = new boolean[rowSize][columnSize];
		for (int i = 0; i < rowSize; i++) {
			String curStr = br.readLine();
			for (int j = 0; j < columnSize; j++) {
				char curChar = curStr.charAt(j);
				if (curChar == 'T') {
					visited[i][j] = true;
				}
			}
		}

		// 처음부터 못 가는 경우 예외 처리
		if (visited[rowSize - 1][0]) {
			System.out.println(0);
			return;
		}

		// 처음 방문 처리 까먹지 말자...
		visited[rowSize - 1][0] = true;
		goMap(1, rowSize - 1, 0);

		System.out.println(result);
	}

	static void goMap(int depth, int x, int y) {

		int[] dx = new int[] {0, 0, 1, -1};
		int[] dy = new int[] {1, -1, 0, 0};

		if (depth == goalNumber) {
			if (x == 0 && y == columnSize - 1) {
				result++;
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			if (newX >= 0 && newX < rowSize
				&& newY >= 0 && newY < columnSize
				&& !visited[newX][newY]) {
				visited[newX][newY] = true;
				goMap(depth + 1, newX, newY);
				visited[newX][newY] = false;
			}
		}
	}
}
