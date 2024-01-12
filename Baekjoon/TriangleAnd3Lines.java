package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAnd3Lines {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = -1, b = -1, c = -1;

		String[] s = br.readLine().split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);

		while (a != 0 && b != 0 && c != 0) {

			int max = Math.max(a, Math.max(b, c));
			int sum = a + b + c - max;
			if (max >= sum) {
				sb.append("Invalid").append('\n');
			} else {
				if (a == b && b == c) {
					sb.append("Equilateral").append('\n');
				} else if (b != c && a != b && a != c) {
					sb.append("Scalene").append('\n');
				} else {
					sb.append("Isosceles").append('\n');
				}
			}

			s = br.readLine().split(" ");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			c = Integer.parseInt(s[2]);

		}

		System.out.println(sb);

	}
}
