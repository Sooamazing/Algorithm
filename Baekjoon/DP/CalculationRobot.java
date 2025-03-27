package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-03-27 35min
// https://www.acmicpc.net/problem/22342
public class CalculationRobot {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());

		// row==0, row==row-1, col==0일 때 index 예외 처리하지 않기 위해 row+2, col+1 조건 추가
		int[][] outputs = new int[row + 2][col + 1];
		// int[][] saves = new int[row + 2][col + 1];
		int[][] d = new int[row + 2][col + 1];
		for (int i = 1; i <= row; i++) {
			String rowStr = br.readLine();
			for (int j = 1; j <= col; j++) {
				d[i][j] = rowStr.charAt(j - 1) - '0';
			}
		}

		int maxSave = 0;
		for (int i = 1; i <= col; i++) {
			for (int j = 1; j <= row; j++) {
				int currentNum = d[j][i];

				// 저장
				int save = Math.max(
					Math.max(outputs[j - 1][i - 1], outputs[j + 1][i - 1]),
					outputs[j][i - 1]
				);
				maxSave = Math.max(maxSave, save);

				// 출력
				outputs[j][i] = save + currentNum;

				// 배열 두 개로 관리
				// // 저장
				// saves[j][i] = Math.max(
				// 	Math.max(outputs[j - 1][i - 1], outputs[j + 1][i - 1]),
				// 	outputs[j][i - 1]
				// );
				// maxSave = Math.max(maxSave, saves[j][i]);
				//
				// // 출력
				// outputs[j][i] = saves[j][i] + currentNum;
			}
		}

		System.out.println(maxSave);
	}
}
