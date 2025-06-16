package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-16 50min
// https://www.acmicpc.net/problem/1526
public class TheGreatestGoldMinsu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stringNumber = br.readLine();
		if (stringNumber.matches("[47]*$")) {
			System.out.println(stringNumber);
			return;
		}

		int max = Integer.parseInt(stringNumber);

		if (max <= 6) {
			System.out.println(4);
			return;
		}

		int[][] dp = new int[8][Math.min(max, 1000)];
		dp[1] = new int[] {4, 7};

		int maxIIndex = 0;
		int maxJIndex = 0;

		Outer:
		for (int i = 2; i < 8; i++) {
			int[] dpSet = dp[i];
			for (int j = 0; j < dp[i - 1].length; j++) {
				if (dp[i - 1][j] == 0) {
					break;
				}
				dpSet[2 * j] = (dp[i - 1][j]) * 10 + 4;
				if (dpSet[2 * j] >= max) {
					maxIIndex = i;
					maxJIndex = 2 * j;
					break Outer;
				}
				dpSet[2 * j + 1] = (dp[i - 1][j]) * 10 + 7;
				if (dpSet[2 * j + 1] >= max) {
					maxIIndex = i;
					maxJIndex = 2 * j + 1;
					break Outer;
				}
			}

		}

		if (maxJIndex == 0) {
			System.out.println(String.valueOf(dp[maxIIndex][maxJIndex] / 10).replace("4", "7"));
			return;
		}

		System.out.println(dp[maxIIndex][maxJIndex - 1]);
		// for (int i = 4; i < 1_000_000; i++) {
		// 	list.add(i);
		// }
	}
}
