package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-19 5min
// https://www.acmicpc.net/problem/14490
public class BaekDaeyeal {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());

		int gcd = getGcd(first, second);

		System.out.println(first / gcd + ":" + second / gcd);

	}

	public static int getGcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGcd(b, a % b);
	}
}
