package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UphillNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long[][] dp = new long[N + 2][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= N+1; i++) {
			for (int j = 0; j < 10; j++) {

				long sum = 0;
				for (int k = j; k < 10; k++) {
					sum =  (sum+dp[i - 1][k])%10007;
				}
				dp[i][j] = sum%10007;
			}
		}

		System.out.println(dp[N+1][0]);

	}
}
