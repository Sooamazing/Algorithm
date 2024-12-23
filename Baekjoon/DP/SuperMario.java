package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-23 5min
// https://www.acmicpc.net/problem/2851
public class SuperMario {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] prefixSum = new int[11];
		int[] diff = new int[11];

		int minDiffIndex = 0;
		int minDiff = 10001;
		for (int i = 1; i < 10 + 1; i++) {
			int cur = Integer.parseInt(br.readLine());

			prefixSum[i] += cur + prefixSum[i - 1];
			diff[i] = Math.abs(100 - prefixSum[i]);
			if (diff[i] <= minDiff) {
				minDiff = diff[i];
				minDiffIndex = i;
			}
		}

		System.out.println(prefixSum[minDiffIndex]);

	}
}
