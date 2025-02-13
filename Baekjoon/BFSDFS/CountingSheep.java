package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-13 15min
// https://www.acmicpc.net/problem/11123
public class CountingSheep {
	private static char[][] fields;
	private static boolean[][] visited;
	private static int[][] dxdy = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
	private static int row;
	private static int col;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		while (test-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());

			fields = new char[row][col];
			visited = new boolean[row][col];
			for (int i = 0; i < row; i++) {
				String str = br.readLine();
				for (int j = 0; j < col; j++) {
					fields[i][j] = str.charAt(j);
				}
			}

			int count = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					// 간 적 있거나 풀이면 Pass
					if (visited[i][j] || fields[i][j] == '.') {
						continue;
					}
					checkSheep(i, j);
					count++;
				}
			}
			sb.append(count).append("\n");
		}

		System.out.println(sb);
	}

	private static void checkSheep(int r, int c) {
		visited[r][c] = true;
		for (int i = 0; i < 4; i++) {
			int newR = r + dxdy[i][0];
			int newC = c + dxdy[i][1];
			// 이미 간 적 있거나 풀이면 pass
			if (newR < 0 || newR >= row || newC < 0 || newC >= col
				|| visited[newR][newC]
				|| fields[newR][newC] == '.') {
				continue;
			}
			checkSheep(newR, newC);
		}

	}
}
