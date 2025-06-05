package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-05 3min
// https://www.acmicpc.net/problem/9085
public class Plus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			int total = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int i = 0; i < total; i++) {
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(sum).append("\n");
		}

		System.out.println(sb);
	}
}
