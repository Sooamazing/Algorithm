package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourSquares {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N + 1];

		dp[1] = 1;
		for (int i = 2; i < N + 1; i++) {
			int min = 50001;
			System.out.println("i = " + i);
			for (int j = 1; j * j <= i; j++) {
			// for (int j = 0; j * j < i; j++) {
				boolean flag;
				int temp = i - j * j;
				int before = min;
				min = Math.min(min, dp[i - j * j]);
				flag = before!=min ? true : false;
				if(flag){
					System.out.println("j = " + j+", temp = " + temp+", min = " + min);
				}
			}
			System.out.println();
			dp[i] = min + 1;
		}

		System.out.println(dp[N]);

	}
}
