package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-25 10min
// https://www.acmicpc.net/problem/14606
public class PizzaSmall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pizzaNum = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		// dp[2] = 1;
		// for (int i = 3; i <= pizzaNum; i++) {
		// 	dp[i] = i - 1 + dp[i - 1];
		// }
		System.out.print(dp[pizzaNum]);

	}
}
