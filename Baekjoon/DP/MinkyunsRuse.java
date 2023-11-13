// https://www.acmicpc.net/problem/11568

package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinkyunsRuse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[N + 1];
		long[] dp = new long[N + 1];

		dp[1] = 1; //초기화하지 않으면 dp 그냥 0 그대로.
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			// i 이전의 수와 크기 비교 후 가장 큰 digit의 dp 값(dp[j])+1 을 해당 dp[i]에 저장
			// 가장 큰 dp[j] 찾기: 해당 digit의 dp 수가 더 크거나 같은 경우에만 저장하기.
			// j < i 실수
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && dp[j]>=dp[i]) {
					dp[i]=dp[j]+1;
					// dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}

		long max = 0;
		for (int i = 0; i < N+1; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
