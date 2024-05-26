package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2 1
// BW
// IdxEx
// 24-05-26 30min
// https://www.acmicpc.net/problem/1303
public class WarBattle {

	static boolean[][] visit;
	static char[][] people;

	static int rowNum, columnNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		columnNum = Integer.parseInt(st.nextToken());
		rowNum = Integer.parseInt(st.nextToken());

		people = new char[rowNum][columnNum];
		visit = new boolean[rowNum][columnNum];

		for (int i = 0; i < rowNum; i++) {
			String string = br.readLine();
			for (int j = 0; j < columnNum; j++) {
				people[i][j] = string.charAt(j);
			}
		}

		int wSum = 0;
		int bSum = 0;
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				if (!visit[i][j]) {
					int tempSum = calculate(i, j);

					if (people[i][j] == 'B') {
						bSum += (tempSum * tempSum);
					} else {
						wSum += (tempSum * tempSum);
					}
				}
			}
		}

		System.out.println(wSum + " " + bSum);

	}

	static int calculate(int row, int column) {
		visit[row][column] = true;
		char curC = people[row][column];
		int sum = 1;

		int[] dc = new int[] {0, 0, 1, -1};
		int[] dr = new int[] {1, -1, 0, 0};

		for (int i = 0; i < 4; i++) {
			int tempC = column + dc[i];
			int tempR = row + dr[i];
			if (tempC >= 0 && tempC < columnNum
				&& tempR >= 0 && tempR < rowNum
				&& !visit[tempR][tempC]
				&& curC == people[tempR][tempC]) {
				sum += calculate(tempR, tempC);
			}
		}

		return sum;

	}
}
