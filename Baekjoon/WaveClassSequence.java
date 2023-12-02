// https://www.acmicpc.net/problem/9461

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaveClassSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {

			// 1 ≤ N ≤ 100
			// 1, 1, 1, 2, 2, 3, 4, 5, 7, 9
			int N = Integer.parseInt(br.readLine());
			long[] dp = new long[N + 4];
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			dp[4] = 2;
			for (int i = 5; i < N + 4; i++) {
				dp[i] = dp[i - 5] + dp[i - 1];
			}
			sb.append(dp[N]).append('\n');

		}
		System.out.println(sb);

	}
}
