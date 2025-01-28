package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-01-28 3min
// https://www.acmicpc.net/problem/5988
public class OddOrEven {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		while (total-- > 0) {
			String num = br.readLine(); // 1 <= K <= 10^60
			if (num.charAt(num.length() - 1) % 2 == 0) {
				sb.append("even\n");
			} else {
				sb.append("odd\n");
			}
		}
		System.out.println(sb);
	}
}
