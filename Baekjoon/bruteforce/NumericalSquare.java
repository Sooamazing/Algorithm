package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-27 45min
// https://www.acmicpc.net/problem/1051
public class NumericalSquare {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());

		int[][] square = new int[row][col];
		for (int i = 0; i < row; i++) {
			String string = br.readLine();
			for (int j = 0; j < col; j++) {
				square[i][j] = string.charAt(j) - '0';
			}
		}

		int maxArea = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int maxLength = Math.min(row - i - 1, col - j - 1);
				for (int k = 1; k <= maxLength; k++) {
					if (square[i][j] == square[i + k][j]
						&& square[i][j] == square[i][j + k]
						&& square[i][j + k] == square[i + k][j + k]) {
						maxArea = Math.max((k + 1) * (k + 1), maxArea);
					}
				}
			}
		}

		System.out.println(maxArea);
	}
}
