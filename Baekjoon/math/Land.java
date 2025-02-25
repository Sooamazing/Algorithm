package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-25 10min
// https://www.acmicpc.net/problem/9063
public class Land {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		// 범위: -10,000 이상 10,000 이하의 정수
		int top = -10_000;
		int left = 10_000;
		int bottom = 10_000;
		int right = -10_000;

		for (int i = 0; i < total; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			top = Math.max(y, top);
			left = Math.min(x, left);
			bottom = Math.min(y, bottom);
			right = Math.max(x, right);
		}

		System.out.println(Math.abs((top - bottom) * (left - right)));
	}
}
