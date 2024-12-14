package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-14 5min
// https://www.acmicpc.net/problem/2455
public class IntelligentTrain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int max = 0;
		int current = 0;
		int MAX_PEOPLE = 10_000;
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());
			current = Math.min(current + in - out, MAX_PEOPLE);
			max = Math.max(max, current);
		}

		System.out.println(max);

	}
}
