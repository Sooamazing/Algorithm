package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-08 10min
// https://www.acmicpc.net/problem/21736
public class OldPeopleNeedFriends {
	static int row;
	static int col;
	static boolean[][] visited;
	static boolean[][] people;
	static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		int startR = 0;
		int startC = 0;
		visited = new boolean[row][col];
		people = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			String line = br.readLine();
			for (int j = 0; j < col; j++) {
				char c = line.charAt(j);
				if (c == 'P') {
					people[i][j] = true;
				} else if (c == 'X') {
					visited[i][j] = true;
				} else if (c == 'I') {
					startR = i;
					startC = j;
				}
			}
		}

		int cnt = dfs(startR, startC);
		System.out.println(cnt == 0 ? "TT" : cnt);

	}

	static int dfs(int r, int c) {
		visited[r][c] = true;
		int cnt = 0;

		for (int i = 0; i < 4; i++) {
			int nr = r + dir[i][0];
			int nc = c + dir[i][1];

			if (nr >= 0 && nr < row
				&& nc >= 0 && nc < col
				&& !visited[nr][nc]) {
				if (people[nr][nc]) {
					cnt++;
				}
				cnt += dfs(nr, nc);
			}
		}

		return cnt;
	}
}
