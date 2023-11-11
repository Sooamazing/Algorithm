package Baekjoon.DP;

import java.util.Arrays;
import java.util.Scanner;

public class TheEasyNumberOfStairs {
	public static void main(String[] args) {
		// int answer =  answer%1000000000;
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		long[][] dp = new long[N + 1][10];
		long[] arr = new long[N + 1];
		dp[1][1] = 1;
		dp[1][2] = 1;
		dp[1][3] = 1;
		dp[1][4] = 1;
		dp[1][5] = 1;
		dp[1][6] = 1;
		dp[1][7] = 1;
		dp[1][8] = 1;
		dp[1][9] = 1;
		arr[1] = 9;

		for (int i = 2; i < N + 1; i++) {

			dp[i][0] = (dp[i - 1][1]) % 1000000000;
			for (int j = 1; j <= 8; j++) {
				dp[i][j] = (dp[i - 1][j-1] + dp[i - 1][j+1]) % 1000000000;
			}
			dp[i][9] = (dp[i - 1][8]) % 1000000000;

			for (int j = 0; j < 10; j++) {
				arr[i] = (arr[i] + dp[i][j]) % 1000000000;
			}

		}
		// System.out.println(Arrays.toString(dp[3]));
		System.out.println(arr[N]);
	}
}
