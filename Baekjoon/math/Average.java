package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-30 10min
// https://www.acmicpc.net/problem/1546
public class Average {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		int[] scores = new int[num];
		int max = 0;
		int total = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			int cur = Integer.parseInt(st.nextToken());
			total += cur;
			max = Math.max(cur, max);
		}

		System.out.print((double)total * 100 / (max * num));

	}
}
