package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-11 20min
// https://www.acmicpc.net/problem/3980
public class SelectionList {
	static int[][] arr = new int[11][11];
	static boolean[] positionArr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {

			for (int i = 0; i < 11; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 11; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 각 test마다 초기화 필수.
			tempSum = 0;
			maxSum = 0;
			positionArr = new boolean[11];
			backtracking(0, 0);
			sb.append(maxSum).append("\n");
		}

		System.out.println(sb);
	}

	static int maxSum = 0;
	static int tempSum = 0;

	static void backtracking(int depth, int row) {
		if (depth == 11) {
			maxSum = Math.max(maxSum, tempSum);
			return;
		}

		for (int i = row; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				int curScore = arr[i][j];
				if (curScore != 0 && !positionArr[j]) {
					tempSum += curScore;
					positionArr[j] = true;
					backtracking(depth + 1, i + 1);

					// 초기화해야 다음 for문에서 영향을 받지 않음.
					tempSum -= curScore;
					positionArr[j] = false;
				}
			}
		}
	}
}
