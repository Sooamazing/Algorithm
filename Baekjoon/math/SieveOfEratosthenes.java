package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-04 10min
// https://www.acmicpc.net/problem/2960
public class SieveOfEratosthenes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());

		boolean[] numbers = new boolean[total + 1];
		int order = 0;
		int result = 0;
		for (int i = 2; i <= total; i++) {
			for (int j = i; j <= total; j += i) {
				if (numbers[j]) {
					continue;
				}
				numbers[j] = true;
				order++;
				if (order == goal) {
					result = j;
					break;
				}
			}
			if (order == goal) {
				break;
			}
		}
		System.out.println(result);
	}
}
