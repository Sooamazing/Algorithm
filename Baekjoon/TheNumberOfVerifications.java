package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2475
public class TheNumberOfVerifications {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		String[] split = br.readLine().split(" ");

		for (int i = 0; i < 5; i++) {
			sum += (int)Math.pow(Integer.parseInt(split[i]), 2);
		}

		System.out.println(sum % 10);

	}
}
