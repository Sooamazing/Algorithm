package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] sumArr = new int[N + 1][N + 1];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < N + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < N + 1; j++) {
				//(1,1)에서부터 해당 자리까지의 합
				sumArr[i][j] =
					sumArr[i][j - 1] + sumArr[i - 1][j] - sumArr[i - 1][j - 1] + Integer.parseInt(st.nextToken());
			}
		}// N 배열까지 입력 및 초기화 완료

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			int prefixSum = sumArr[x2][y2] - sumArr[x2][y1-1] - sumArr[x1-1][y2] + sumArr[x1-1][y1-1];
			sb.append(prefixSum).append('\n');
		}
		System.out.println(sb);
	}
}
