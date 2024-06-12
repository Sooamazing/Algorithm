package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-12 30min
// https://www.acmicpc.net/problem/16507
public class ScaredOfTheDark {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int height = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int testCaseNum = Integer.parseInt(st.nextToken());

		int[][] picture = new int[height + 1][width + 1];
		for (int i = 1; i <= height; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= width; j++) {
				int cur = Integer.parseInt(st.nextToken());
				picture[i][j] = cur + picture[i - 1][j] + picture[i][j - 1] - picture[i - 1][j - 1];
			}
		}

		while (testCaseNum-- > 0) {

			int totalSum = 0;
			int totalNum = 0;

			st = new StringTokenizer(br.readLine());

			// 좌표값 1부터 시작 주의. -> 누적합이라 1부터인가 봐...
			int startR = Integer.parseInt(st.nextToken());
			int startC = Integer.parseInt(st.nextToken());
			int endR = Integer.parseInt(st.nextToken());
			int endC = Integer.parseInt(st.nextToken());

			totalNum = (endR - startR + 1) * (endC - startC + 1);
			totalSum =
				picture[endR][endC] + picture[startR - 1][startC - 1] - picture[startR - 1][endC] - picture[endR][
					startC
						- 1];

			sb.append(totalSum / totalNum).append("\n");
		}
		System.out.println(sb);
	}

}
