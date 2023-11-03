package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FloorDecoration {

	static char[][] arr;
	static boolean[][] visited;
	static int[][] upArr = {{1, 0}, {-1, 0}};
	static int[][] rightArr = {{0, 1}, {0, -1}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new char[N + 2][M + 2];
		visited = new boolean[N + 2][M + 2];
		for (int i = 1; i < N + 1; i++) {
			String s = br.readLine();
			for (int j = 1; j < M + 1; j++) {
				arr[i][j] = s.charAt(j - 1);
				visited[i][j] = true;
			}
		} //입력 및 초기화 완료

		int cnt = 0;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < M + 1; j++) {
				if (visited[i][j]) {
					visited[i][j] = false;
					cnt++;
					dfs(i, j);
				}
			}
		}
		System.out.println(cnt);
	}

	static void dfs(int x, int y) {

		if (arr[x][y] == '|') {
			for (int i = 0; i < 2; i++) {
				int tempX = x + upArr[i][0];
				int tempY = y + upArr[i][1]; // x 오타..
				if (arr[tempX][tempY] == '|' && visited[tempX][tempY]) {
					visited[tempX][tempY] = false;
					dfs(tempX, tempY);
				}
			}
		} else if (arr[x][y] == '-') {
			for (int i = 0; i < 2; i++) {
				int tempX = x + rightArr[i][0];
				int tempY = y + rightArr[i][1]; // x 오타..
				if (arr[tempX][tempY] == '-' && visited[tempX][tempY]) {
					visited[tempX][tempY] = false;
					dfs(tempX, tempY);
				}
			}
		}
	}
}
