package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
	static boolean[][] password;
	static int result, goal;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());

		while (testCaseNum-- > 0) {
			goal = Integer.parseInt(br.readLine());
			password = new boolean[][] {{false, false, false}, {false, false, false}, {false, false, false},
				{false, true, true}};

			result = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == 3 && (j == 1 || j == 2))
						continue;
					calculate(1, i, j);
				}
			}
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}

	static int[] dc = new int[] {0, 0, 1, -1};
	static int[] dr = new int[] {1, -1, 0, 0};

	static void calculate(int depth, int r, int c) {

		if (depth == goal) {
			result = ((result + 1) % 1234567);
			return;
		}

		// password[r][c] = true;

		for (int i = 0; i < 4; i++) {
			int tempC = c + dc[i];
			int tempR = r + dr[i];
			if (tempC >= 0 && tempC < 3 && tempR >= 0 && tempR < 4 && !password[tempR][tempC]) {
				password[tempR][tempC] = true;
				calculate(depth + 1, tempR, tempC);
				password[tempR][tempC] = false;
			}
		}

	}
}
