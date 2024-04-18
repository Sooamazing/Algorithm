package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-18 60min
// https://www.acmicpc.net/problem/9251
public class LSC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String string1 = br.readLine();
		String string2 = br.readLine();

		int length1 = string1.length();
		int length2 = string2.length();

		int[][] dp = new int[length1 + 1][length2 + 1];
		int max = 0;

		for (int i = 0; i < length1; i++) {
			char char1 = string1.charAt(i);
			for (int j = 0; j < length2; j++) {
				char char2 = string2.charAt(j);
				if (char1 == char2) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}
				max = Math.max(dp[i + 1][j + 1], max);
			}
		}

		System.out.println(max);

	}
}
