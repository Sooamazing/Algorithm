package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-09 3min
// https://www.acmicpc.net/problem/13752
public class Histogram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (test-- > 0) {
			int count = Integer.parseInt(br.readLine());
			sb.append("=".repeat(count))
				.append("\n");
		}

		System.out.println(sb);
	}
}
