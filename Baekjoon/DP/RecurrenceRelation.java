package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-22 15min
// https://www.acmicpc.net/problem/13699
public class RecurrenceRelation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		long[] t = new long[total + 1];
		t[0] = 1;
		for (int i = 1; i <= total; i++) {
			for (int j = 0; j <= i / 2 - 1; j++) {
				t[i] += t[j] * t[(i - 1) - j] * 2;
			}
			// 홀수면 가운데는 제곱
			if (i % 2 == 1) {
				t[i] += t[i / 2] * t[i / 2];
			}
		}

		System.out.println(t[total]);
	}
}
