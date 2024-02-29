package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1834
public class NumberEqualToTheRest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());

		long sum = 0;
		for (int i = 1; i < N; i++) {
			sum += (i + i * N);
		}

		System.out.println(sum);
	}
}
