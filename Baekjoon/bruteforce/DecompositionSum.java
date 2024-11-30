package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-30 10min
// https://www.acmicpc.net/problem/2231
public class DecompositionSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 1; i < num; i++) {
			int sum = i;

			int temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == num) {
				result = i;
				break;
			}

		}
		System.out.println(result);
	}
}
