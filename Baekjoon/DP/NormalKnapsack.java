package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NormalKnapsack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] W = new int[K + 1];
		int[] dp = new int[K + 1];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());

			//무게가 담을 수 있는 것보다 큰 경우 continue
			if(idx>K){
				continue;
			}
			W[idx] = Integer.parseInt(st.nextToken());
		}//입력 및 W 무게에 V 가치 담는 배열 초기화 완료

		dp[1] = W[1];
		if (N >= 2) {
			dp[2] = W[2];
		}
		for (int i = 3; i < K + 1; i++) {
			int temp = 0;
			if (i % 2 == 0) {
				int[] arr = new int[i / 2];
				for (int j = 1; j < i / 2; j++) {
					arr[j] = dp[j] + dp[i - j];
				}
				Arrays.sort(arr);
				temp = arr[i / 2 - 1];
			} else {
				int[] arr = new int[i / 2+1];
				for (int j = 1; j <= i / 2; j++) {
					arr[j] = dp[j] + dp[i - j];
				}
				Arrays.sort(arr);
				temp = arr[i / 2];
			}
			dp[i] = Math.max(W[i], temp);
		}
		System.out.println(dp[K]);
	}
}
