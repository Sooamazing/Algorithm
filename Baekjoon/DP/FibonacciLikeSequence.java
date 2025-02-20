package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-20 10min
// https://www.acmicpc.net/problem/14495
public class FibonacciLikeSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		long[] sequences = new long[n + 1];

		// f(1) = f(2) = f(3) = 1
		if (n == 1 || n == 2 || n == 3) {
			System.out.println(1);
			return;
		}

		sequences[1] = sequences[2] = sequences[3] = 1;
		for (int i = 4; i <= n; i++) {
			// f(n) = f(n-1) + f(n-3)
			sequences[i] = sequences[i - 1] + sequences[i - 3];
		}

		System.out.println(sequences[n]);
	}
}
