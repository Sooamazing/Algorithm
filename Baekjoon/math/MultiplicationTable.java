package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-28 5min
// https://www.acmicpc.net/problem/32710
public class MultiplicationTable {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		if (num > 81) {
			System.out.println(0);
			return;
		}

		for (int i = 9; i >= 1; i--) {
			if (num % i == 0 && num / i <= 9) {
				for (int j = i; j >= 1; j--) {
					if (num % j == 0 && num / j <= 9) {
						System.out.println(1);
						return;
					}
				}
			}
		}

		System.out.println(0);

	}
}
