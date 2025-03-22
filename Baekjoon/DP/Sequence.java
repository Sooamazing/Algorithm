package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-03-22 15min
// https://www.acmicpc.net/problem/2491
public class Sequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int[] bigger = new int[total];
		Arrays.fill(bigger, 1); // 자기 자신 포함.
		int[] smaller = new int[total];
		Arrays.fill(smaller, 1); // 자기 자신 포함.
		StringTokenizer st = new StringTokenizer(br.readLine());
		int prev = Integer.parseInt(st.nextToken());
		int max = 1; // 자기 자신 포함
		for (int i = 1; i < total; i++) {
			int current = Integer.parseInt(st.nextToken());
			if (prev <= current) {
				bigger[i] = bigger[i - 1] + 1;
				max = Math.max(max, bigger[i]);
			}

			if (prev >= current) {
				smaller[i] = smaller[i - 1] + 1;
				max = Math.max(max, smaller[i]);
			}

			prev = current;
		}

		System.out.println(max);
	}
}
