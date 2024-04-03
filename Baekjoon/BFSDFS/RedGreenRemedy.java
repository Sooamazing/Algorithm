package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-04-03
// https://www.acmicpc.net/problem/10026
public class RedGreenRemedy {

	private static int gridLength;
	private static String[][] grid;
	private static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		gridLength = Integer.parseInt(st.nextToken());

		grid = new String[gridLength][gridLength];

		for (int i = 0; i < gridLength; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < gridLength; j++) {
				grid[i][j] = split[j];
			}
		}

		// 적록 색맹 X
		int notRemedyCnt = 0;
		visited = new boolean[gridLength][gridLength];
		for (int i = 0; i < gridLength; i++) {
			for (int j = 0; j < gridLength; j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					getAreaVerNotRemedy(i, j);
					notRemedyCnt++;
				}
			}
		}

		// 적록 색맹
		int remedyCnt = 0;
		visited = new boolean[gridLength][gridLength];
		for (int i = 0; i < gridLength; i++) {
			for (int j = 0; j < gridLength; j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					getAreaVerRemedy(i, j);
					remedyCnt++;
				}
			}
		}

		System.out.println(notRemedyCnt + " " + remedyCnt);

	}

	private static void getAreaVerNotRemedy(int x, int y) {
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};

		Queue<int[]> que = new LinkedList<>();

		que.add(new int[] {x, y});
		String curWord = grid[x][y];
		if (curWord.equals("R")) {
			grid[x][y] = "G";
		}

		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int curX = cur[0];
			int curY = cur[1];
			for (int i = 0; i < 4; i++) {
				int newX = curX + dx[i];
				int newY = curY + dy[i];

				if (newX >= 0 && newX < gridLength
					&& newY >= 0 && newY < gridLength
					&& !visited[newX][newY]
					&& grid[newX][newY].equals(curWord)) {
					visited[newX][newY] = true;
					que.add(new int[] {newX, newY});
					if (curWord.equals("R")) {
						grid[newX][newY] = "G";
					}
				}

			}

		}

	}

	private static void getAreaVerRemedy(int x, int y) {

		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};

		Queue<int[]> que = new LinkedList<>();

		que.add(new int[] {x, y});

		// "B",  "G"/"R"
		String curWord = grid[x][y];

		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int curX = cur[0];
			int curY = cur[1];
			for (int i = 0; i < 4; i++) {
				int newX = curX + dx[i];
				int newY = curY + dy[i];

				if (newX >= 0 && newX < gridLength
					&& newY >= 0 && newY < gridLength
					&& !visited[newX][newY]
					&& grid[newX][newY].equals(curWord)) {
					visited[newX][newY] = true;
					que.add(new int[] {newX, newY});
				}

			}

		}
	}
}
