package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1309
public class Zoo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int height = Integer.parseInt(br.readLine());

		int[][] dp = new int[height + 1][3];
		dp[1][0] = 3;
		dp[1][1] = 1;
		dp[1][2] = 1;
		for (int i = 2; i <= height; i++) {
			dp[i][1] = (dp[i - 1][1] + dp[i - 1][2] * 2) % 9901;
			dp[i][2] = (dp[i - 1][1] + dp[i - 1][2]) % 9901;
			dp[i][0] = (dp[i][1] + dp[i][2] * 2) % 9901;

			// 더 간단한 방법
			//  arr[i] = (arr[i-2]+ arr[i-1]*2) % 9901 ;
		}

		System.out.println(dp[height][0]);

	}
}
