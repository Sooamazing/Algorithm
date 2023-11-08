package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile01 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		// // long[] dp = new long[1000000+1];
		// long[] dp = new long[N+1];
		// dp[1]=1L;
		// // dp[2]=2L;
		// if(N>=2){
		// 	dp[2]=2L;
		// }
		// for (int i = 3; i < N + 1; i++) {
		// 	dp[i] =( dp[i - 1] + dp[i - 2] )% 15746;
		// }
		// System.out.println(dp[N]);

		int a = 1;
		int b = 2;
		int result = a+b;
		for (int i = 3; i < N + 1; i++) {

			result = (a+b)%15746;
			a=b;
			b=result;

		}
		System.out.println(result);
	}
}
