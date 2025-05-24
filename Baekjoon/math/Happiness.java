package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-24 3min
// https://www.acmicpc.net/problem/15969
public class Happiness {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		int min = 1000;
		for (int i = 0; i < total; i++) {
			int number = Integer.parseInt(st.nextToken());
			max = Math.max(number, max);
			min = Math.min(number, min);
		}

		System.out.println(max - min);
	}
}
