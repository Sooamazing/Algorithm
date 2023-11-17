// https://www.acmicpc.net/problem/1003
package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while(T-->0){
			int N = Integer.parseInt(br.readLine());

			// N < 2 일 때 dp[0][0], dp[1][1] idx 에러 방지 위해 N+3으로 저장
			int[][] dp = new int[N+3][2];

			dp[0][0] = 1;
			dp[1][1] = 1;
			for(int i = 2;i<N+1;i++){
				dp[i][0] = dp[i-1][0]+dp[i-2][0];
				dp[i][1] = dp[i-1][1]+dp[i-2][1];
			}
			System.out.println(dp[N][0]+" "+dp[N][1]);
		}
	}
}
