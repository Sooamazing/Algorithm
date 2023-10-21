package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MakeIt1 {
	public static void main(String[] args) throws IOException {

		//21676KB 232ms
		// Scanner stdIn = new Scanner(System.in);
		// int N = stdIn.nextInt();

		//BufferedReader 사용 시 18288KB 148ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());


		int[] dp = new int[N + 1];

		dp[1] = 0;
		for (int i = 2; i < N + 1; i++) {
			if (i % 6 == 0) {
				dp[i] = Math.min(dp[i - 1], Math.min(dp[i / 3], dp[i / 2])) + 1;
			} else if (i % 3 == 0) {
				dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1;
			} else if (i % 2 == 0) {
				dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
			} else {
				dp[i] = dp[i - 1] + 1;
			}
		}
		System.out.println(dp[N]);
	}
}
