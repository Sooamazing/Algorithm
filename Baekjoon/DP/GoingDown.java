package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-12 30min
// https://www.acmicpc.net/problem/2096
public class GoingDown {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int[][][] dp = new int[size][3][2];

		StringTokenizer st = new StringTokenizer(br.readLine());

		int left = Integer.parseInt(st.nextToken());
		int mid = Integer.parseInt(st.nextToken());
		int right = Integer.parseInt(st.nextToken());

		dp[0][0][0] = left;
		dp[0][0][1] = left;

		dp[0][1][0] = mid;
		dp[0][1][1] = mid;

		dp[0][2][0] = right;
		dp[0][2][1] = right;

		for (int i = 1; i < size; i++) {

			st = new StringTokenizer(br.readLine());
			left = Integer.parseInt(st.nextToken());
			mid = Integer.parseInt(st.nextToken());
			right = Integer.parseInt(st.nextToken());

			dp[i][0][0] = Math.min(dp[i - 1][0][0], dp[i - 1][1][0]) + left;
			dp[i][0][1] = Math.max(dp[i - 1][0][1], dp[i - 1][1][1]) + left;

			dp[i][1][0] = Math.min(dp[i - 1][0][0], Math.min(dp[i - 1][1][0], dp[i - 1][2][0])) + mid;
			dp[i][1][1] = Math.max(dp[i - 1][0][1], Math.max(dp[i - 1][1][1], dp[i - 1][2][1])) + mid;

			dp[i][2][0] = Math.min(dp[i - 1][2][0], dp[i - 1][1][0]) + right;
			dp[i][2][1] = Math.max(dp[i - 1][2][1], dp[i - 1][1][1]) + right;

		}

		System.out.println(
			Math.max(dp[size - 1][2][1], Math.max(dp[size - 1][1][1], dp[size - 1][0][1])) + " " + Math.min(
				dp[size - 1][2][0], Math.min(dp[size - 1][1][0], dp[size - 1][0][0])));
	}

}
