package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 25-02-03 20min
// https://www.acmicpc.net/problem/2210
public class NumberBoardJump {
	private static int[][] numberTable = new int[5][5];
	private static Set<String> numbers = new HashSet<>();
	private static int[][] drc = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
	private static int[] tempSixDigitNumbers = new int[6];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				numberTable[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				explore(0, i, j);
			}
		}

		System.out.println(numbers.size());
	}

	private static void explore(int depth, int r, int c) {
		if (depth == 6) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 6; i++) {
				sb.append(tempSixDigitNumbers[i]);
			}
			numbers.add(sb.toString());
			return;
		}

		for (int i = 0; i < 4; i++) {
			int tempR = r + drc[i][0];
			int tempC = c + drc[i][1];
			if (tempR < 0 || tempR >= 5
				|| tempC < 0 || tempC >= 5) {
				continue;
			}
			tempSixDigitNumbers[depth] = numberTable[tempR][tempC];
			explore(depth + 1, tempR, tempC);
		}
	}
}
