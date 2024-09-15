package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-15 10min
// https://www.acmicpc.net/problem/14430
public class ResourceDigging {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		boolean[][] mine = new boolean[row][col];
		int[][] dp = new int[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				mine[i][j] = st.nextToken().charAt(0) == '1';
				if (i == 0) {
					if (j == 0) {
						dp[i][j] = mine[i][j] ? 1 : 0;
					} else {
						int prev = dp[i][j - 1];
						dp[i][j] = mine[i][j] ? prev + 1 : prev;
					}
				} else {
					if (j == 0) {
						int prev = dp[i - 1][j];
						dp[i][j] = mine[i][j] ? prev + 1 : prev;
					} else {
						int prev = Math.max(dp[i - 1][j], dp[i][j - 1]);
						dp[i][j] = mine[i][j] ? prev + 1 :
							prev;
					}
				}
			}
		}
		System.out.println(dp[row - 1][col - 1]);
	}
}
