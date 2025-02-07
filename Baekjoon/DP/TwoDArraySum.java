package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-07 15min
// https://www.acmicpc.net/problem/2167
public class TwoDArraySum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());

		int[][] dp = new int[row + 1][col + 1];
		for (int i = 1; i <= row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= col; j++) {
				int current = Integer.parseInt(st.nextToken());
				if (i == 1) {
					dp[1][j] = dp[1][j - 1] + current;
					if (j == 1) {
						dp[1][1] = current;
					}
				} else if (j == 1) {
					dp[i][1] = dp[i - 1][1] + current;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + current;
				}
			}
		}

		int total = Integer.parseInt(br.readLine());
		while (total-- > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			sb.append(
				dp[x][y] - dp[i - 1][y] - dp[x][j - 1] + dp[i - 1][j - 1]
			).append("\n");
		}

		System.out.println(sb);

	}
}
