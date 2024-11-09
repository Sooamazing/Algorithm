package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-09 10min
// https://www.acmicpc.net/problem/14215
public class ThreeBars {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int max = Math.max(a, Math.max(b, c));

		if (max >= a + b + c - max) {
			int leftTwo = a + b + c - max;
			System.out.println(leftTwo * 2 - 1);
		} else {
			System.out.println(a + b + c);
		}
	}
}
