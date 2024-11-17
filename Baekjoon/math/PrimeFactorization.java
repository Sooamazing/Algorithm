package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-17 5min
// https://www.acmicpc.net/problem/11653
public class PrimeFactorization {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		int divider = 2;
		while (num != 1) {
			if (num % divider == 0) {
				sb.append(divider).append("\n");
				num /= divider;
			} else {
				divider++;
			}
		}

		System.out.println(sb);

	}
}
