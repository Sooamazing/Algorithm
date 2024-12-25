package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-25 1min
// https://www.acmicpc.net/problem/5522
public class CardGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Integer.parseInt(br.readLine());
		}

		System.out.println(sum);

	}
}
