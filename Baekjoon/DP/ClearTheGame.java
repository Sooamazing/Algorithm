package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-08-22 25min
// https://www.acmicpc.net/problem/28017
public class ClearTheGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int round = Integer.parseInt(st.nextToken());
		int weaponNum = Integer.parseInt(st.nextToken());
		long[][] dp = new long[round][weaponNum];
		int[] weapons = new int[weaponNum];

		for (int i = 0; i < round; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < weaponNum; j++) {
				weapons[i] = Integer.parseInt(st.nextToken());
				Arrays.fill(dp[i], Integer.MAX_VALUE);
			}
		}

		for (int i = 0; i < round; i++) {
			for (int j = 0; j < weaponNum; j++) {
				if (i == 0) {
					dp[i][j] = weapons[j];
					continue;
				} else if (j < weaponNum) {

				}

			}
		}

		long ans = Long.MAX_VALUE;
		for (int i = 0; i < weaponNum; i++) {
			ans = Math.min(ans, dp[round - 1][i]);
		}
		System.out.println(ans);

	}
}
