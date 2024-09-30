package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-09-30 10min
// https://www.acmicpc.net/problem/2145
public class GameOfNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String num;
		while ((num = br.readLine()).charAt(0) - '0' != 0) {
			int total;
			do {
				total = 0;
				for (int i = 0; i < num.length(); i++) {
					total += (num.charAt(i) - '0');
				}
				num = String.valueOf(total);
			} while (total >= 10);
			sb.append(total).append("\n");
		}
		System.out.println(sb);
	}
}
