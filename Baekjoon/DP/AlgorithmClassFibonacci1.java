package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-01 10min
// https://www.acmicpc.net/problem/24416
public class AlgorithmClassFibonacci1 {
	private static int[] dp;
	private static int countRecursion;
	private static int countDp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		dp = new int[total + 1];

		getFibbonacciWithRecursion(total);
		getFibbonacciWithDp(total);
		System.out.println(countRecursion + " " + countDp);
	}

	private static int getFibbonacciWithRecursion(int number) {
		//  if (n = 1 or n = 2)
		//  then return 1;  # 코드1
		//  else return (fib(n - 1) + fib(n - 2));
		if (number == 1 || number == 2) {
			countRecursion++;
			return 1;
		}
		return (getFibbonacciWithRecursion(number - 1) + getFibbonacciWithRecursion(number - 2));
	}

	private static int getFibbonacciWithDp(int number) {
		// f[1] <- f[2] <- 1;
		if (number == 1 || number == 2) {
			return 1;
		}
		// for i < -3 to n
		// 	f[i] < -f[i - 1] + f[i - 2];  #코드2
		for (int i = 3; i <= number; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			countDp++;
		}
		// return f[n];
		return dp[number];
	}
}
