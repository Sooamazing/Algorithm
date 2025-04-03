package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-03 20min
// https://www.acmicpc.net/problem/11051
public class BinomialCoefficient2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int total = Integer.parseInt(st.nextToken());
		int pick = Integer.parseInt(st.nextToken());

		final int MOD = 10_007;
		int[][] dp = new int[total + 1][total + 1];
		for (int i = 0; i <= total; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					dp[i][j] = 1;
					continue;
				}
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
			}
		}

		System.out.println(dp[total][pick]);
	}
}
