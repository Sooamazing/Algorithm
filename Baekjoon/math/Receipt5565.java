package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-21 3min
// https://www.acmicpc.net/problem/5565
public class Receipt5565 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		for (int i = 0; i < 9; i++) {
			total -= Integer.parseInt(br.readLine());
		}

		System.out.println(total);
	}
}
