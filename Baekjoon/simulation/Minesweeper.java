package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-16 15min
// https://www.acmicpc.net/problem/4108
public class Minesweeper {
	private static int row;
	private static int col;
	private static char[][] fields;
	private static int[][] mines;
	private static int[][] drdc = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, 1}, {1, -1}, {-1, -1}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			if (row == 0 && col == 0) {
				break;
			}

			fields = new char[row][col];
			mines = new int[row][col];
			for (int i = 0; i < row; i++) {
				String str = br.readLine();
				fields[i] = str.toCharArray();
			}

			calc();

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (fields[i][j] == '*') {
						// 지뢰면 그대로 표기
						sb.append('*');
					} else {
						sb.append(mines[i][j]);
					}
				}
				sb.append("\n");
			}
		}

		System.out.println(sb);

	}

	private static void calc() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (fields[i][j] == '.') {
					continue;
				}
				// 지뢰가 있는 경우, 해당 지뢰의 주변에 지뢰가 있다고 알려줌.
				for (int k = 0; k < 8; k++) {
					int newR = i + drdc[k][0];
					int newC = j + drdc[k][1];
					// 갈 수 없거나 지뢰면 계산하지 않음.
					if (newR < 0 || newR >= row || newC < 0 || newC >= col || fields[newR][newC] == '*') {
						continue;
					}
					mines[newR][newC]++;
				}
			}
		}
	}
}
