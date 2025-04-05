package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 25-04-05 60min
// https://www.acmicpc.net/problem/1793
public class Tiling {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		final int MAX = 250;
		final int LAST_ONE = 0;
		final int LAST_TWO = 1;
		BigInteger[][] dp = new BigInteger[MAX + 1][2];
		dp[0][LAST_ONE] = BigInteger.ZERO;
		dp[0][LAST_TWO] = BigInteger.ZERO;
		dp[1][LAST_ONE] = BigInteger.ONE;
		dp[1][LAST_TWO] = BigInteger.ZERO;
		dp[2][LAST_ONE] = BigInteger.ONE;
		dp[2][LAST_TWO] = BigInteger.TWO;
		dp[3][LAST_ONE] = BigInteger.valueOf(3);
		dp[3][LAST_TWO] = BigInteger.valueOf(2);
		for (int i = 4; i <= MAX; i++) {
			BigInteger prevPrev = dp[i - 2][LAST_ONE].add(dp[i - 2][LAST_TWO]);
			dp[i][LAST_ONE] = dp[i - 1][LAST_TWO].add(prevPrev);
			dp[i][LAST_TWO] = prevPrev.multiply(BigInteger.TWO);
		}

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			int number = Integer.parseInt(str);
			sb.append(dp[number][0].add(dp[number][1])).append("\n");
		}

		System.out.println(sb);
	}
}
