package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-05	15min
// https://www.acmicpc.net/problem/2745
public class BaseTransformation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String num = st.nextToken();
		int base = Integer.parseInt(st.nextToken());

		int length = num.length();
		int decimal = 0;
		for (int i = 0; i < length; i++) {
			char c = num.charAt(i);
			int cur;

			if (c - '0' >= 0 && c - '0' <= 9) {
				// 숫자면
				cur = Integer.parseInt(String.valueOf(c));
			} else {
				// 문자면
				cur = Integer.parseInt(String.valueOf(c - 'A')) + 10;
			}

			decimal += cur * (int)Math.pow(base, length - i - 1.0);
		}
		System.out.println(decimal);
	}
}
