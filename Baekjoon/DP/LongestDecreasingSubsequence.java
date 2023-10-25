package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LongestDecreasingSubsequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int[] dp = new int[N + 1];
		Arrays.fill(dp, 1);
		int[] arr = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}//입력 및 초기화 완료

		int cnt = 0;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[i] < arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
			cnt = Math.max(cnt, dp[i]);
		}

		System.out.println(cnt);

	}
}
