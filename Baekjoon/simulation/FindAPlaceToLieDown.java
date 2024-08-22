package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-08-22 20min
// https://www.acmicpc.net/problem/1652
public class FindAPlaceToLieDown {

	static int ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		boolean[][] room = new boolean[size][size];
		boolean[] rows = new boolean[size];
		boolean[] cols = new boolean[size];
		for (int i = 0; i < size; i++) {
			String str = br.readLine();
			for (int j = 0; j < size; j++) {
				room[i][j] = str.charAt(j) == '.';
			}
		}

		int rowAns = 0;
		int colAns = 0;
		for (int i = 0; i < size; i++) {
			int rowCnt = 0;
			int colCnt = 0;
			for (int j = 0; j < size; j++) {
				if (room[i][j]) {
					rowCnt++;
				} else {
					if (rowCnt >= 2) {
						rowAns++;
					}
					rowCnt = 0;
				}
				if (room[j][i]) {
					colCnt++;
				} else {
					if (colCnt >= 2) {
						colAns++;
					}
					colCnt = 0;
				}
			}
			if (rowCnt >= 2) {
				rowAns++;
			}
			if (colCnt >= 2) {
				colAns++;
			}
		}

		System.out.println(rowAns + " " + colAns);
	}
}