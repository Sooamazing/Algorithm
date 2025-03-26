package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-26 55min
// https://www.acmicpc.net/problem/15489
// 참고: 3 2 1 - https://www.acmicpc.net/board/view/147119
public class PascalsTriangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int row = Integer.parseInt(st.nextToken()) - 1;
		int col = Integer.parseInt(st.nextToken()) - 1;
		row -= col; // 문제에서 제시한 것과 맞추기 위해서는 대각선으로 열만큼 거슬러 올라가야 함.
		int width = Integer.parseInt(st.nextToken());

		int maxRow = row + width;
		int maxCol = col + width;
		long[][] triangle = new long[maxRow][maxCol];

		long sum = 0;
		int triangleWidth = width;
		for (int i = 0; i < maxRow; i++) {
			boolean isRowInSumRange = i >= row;
			for (int j = 0; j < maxCol; j++) {
				if (i == 0 || j == 0) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i - 1][j] + triangle[i][j - 1];
				}
				boolean isColInSumRange = j < col + triangleWidth && j >= col;
				if (isColInSumRange && isRowInSumRange) {
					sum += triangle[i][j];
				}
			}
			// 삼각형 내부 변 길이가 하나씩 줄어듦
			if (isRowInSumRange) {
				triangleWidth--;
			}
		}
		System.out.println(sum);
	}
}
