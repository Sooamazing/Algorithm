package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-03-20
// https://www.acmicpc.net/problem/1926
public class Picture {

	private static boolean[][] toGo;
	private static int pictureCnt;
	private static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int height = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());

		int[][] picture = new int[height + 2][length + 2];
		toGo = new boolean[height + 2][length + 2];

		for (int i = 1; i < height + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < length + 1; j++) {
				picture[i][j] = Integer.parseInt(st.nextToken());
				if (picture[i][j] == 1) {
					toGo[i][j] = true;
				}
			}
		}

		for (int i = 1; i < picture.length; i++) {
			for (int j = 1; j < picture[0].length; j++) {
				if (toGo[i][j]) {
					toGo[i][j] = false;
					max = Math.max(max, dfs(i, j));
					pictureCnt++;
				}
			}
		}

		System.out.println(pictureCnt + "\n" + max);

	}

	private static int dfs(int x, int y) {

		int size = 1;
		int[] dx = {0, 0, 1, -1};
		int[] dy = {-1, 1, 0, 0};

		for (int i = 0; i < 4; i++) {

			int newX = x + dx[i];
			int newY = y + dy[i];

			if (toGo[newX][newY]) {
				toGo[newX][newY] = false;
				size += dfs(newX, newY);
			}

		}

		return size;

	}

}
