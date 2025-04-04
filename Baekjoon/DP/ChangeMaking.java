package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-04 15min
// https://www.acmicpc.net/problem/14916
public class ChangeMaking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int[] dp = new int[total + 1];
		if (total >= 2) {
			dp[2] = 1;
		}
		if (total >= 4) {
			dp[4] = 2;
		}
		if (total >= 5) {
			dp[5] = 1;
		}
		for (int i = 6; i <= total; i++) {
			int plus2 = 0;
			int plus5 = 0;
			// 현재 거스름돈에서 2원을 뺐을 때, 계산이 유효했는지 확인 후 2원 더했을 때 총 개수
			if (dp[i - 2] != 0) {
				plus2 = dp[i - 2] + 1;
			}
			// 5원도 마찬가지
			if (dp[i - 5] != 0) {
				plus5 = dp[i - 5] + 1;
			}

			if (plus2 * plus5 == 0) {
				if (plus2 != 0) {
					dp[i] = plus2;
				}
				if (plus5 != 0) {
					dp[i] = plus5;
				}
				continue;
			}

			dp[i] = Math.min(plus2, plus5);

		}

		System.out.println(dp[total] == 0 ? -1 : dp[total]);
	}
}
