package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-05 20min
// https://www.acmicpc.net/problem/11053
public class LongestIncreasingSubsequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int[] numbers = new int[total + 1];
		int[] dp = new int[total + 1]; // 각 index까지의 최대 긴 길이를 저장하는 배열
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= total; i++) {
			int currentNumber = numbers[i] = Integer.parseInt(st.nextToken());

			// i번째 숫자를 포함할 때 가장 긴 증가하는 수열의 수를 dp[i]에 저장하기
			for (int j = 0; j < i; j++) {
				// 현재 숫자가 이전 숫자보다 크고, 증가하는 수열 개수가 더 크면 dp 값 저장
				if (numbers[j] < currentNumber && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
			// 가장 긴 배열의 길이만 저장
			result = Math.max(result, dp[i]);
		}

		System.out.println(result);
	}
}
