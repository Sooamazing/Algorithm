package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-07 5min
// https://www.acmicpc.net/problem/2010
public class Plug {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int result = 0;
		for (int i = 0; i < total; i++) {
			int num = Integer.parseInt(br.readLine());
			result += num - 1;
		}

		System.out.println(result + 1);

	}
}
