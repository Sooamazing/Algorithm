package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-11 10min
// https://www.acmicpc.net/problem/2312
public class NumberRestoration {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			int num = Integer.parseInt(br.readLine());

			int primeFactor = 2;
			int primeFactorCount = 0;
			while (num != 1) {
				while (num % primeFactor == 0) {
					num /= primeFactor;
					primeFactorCount++;
				}
				if (primeFactorCount != 0) {
					sb.append(primeFactor).append(" ").append(primeFactorCount).append("\n");
				}
				primeFactor++;
				primeFactorCount = 0;
			}

		}

		System.out.println(sb);

	}
}
