// https://www.acmicpc.net/problem/9095
package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreeMore {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		//while 사용해 봄.
		while (T-- > 0) {

			int N = Integer.parseInt(br.readLine());
			int[] dp = new int[N+2]; // dp[2]까지 그냥 저장 위해 N+2로 선언

			dp[0]=1;
			dp[1]=2;
			dp[2]=4;
			for (int i = 3; i < N; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}

			sb.append(dp[N-1]).append('\n');
			// System.out.println(dp[N - 1]);
		}
		System.out.println(sb);
	}
}
