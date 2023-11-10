package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertABox {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] dp = new int[N + 1];
		int[] temp = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
			int max = 0;
			for (int j = 0; j < i; j++) {

				if (temp[j] < temp[i]) {
					max = Math.max(dp[j], max);
				}
				dp[i] = max + 1;
			}
		}

		int max = 0;
		for(int i = 1 ; i<N+1;i++){
			max=Math.max(max, dp[i]);
		}

		System.out.println(max);

	}
}
