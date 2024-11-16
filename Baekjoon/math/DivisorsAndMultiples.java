package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-16 10min
// https://www.acmicpc.net/problem/5086
public class DivisorsAndMultiples {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a;
		int b;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			}

			if (b % a == 0) {
				sb.append("factor\n");
			} else if (a % b == 0) {
				sb.append("multiple\n");
			} else {
				sb.append("neither\n");
			}
		}

		System.out.println(sb);
	}
}
