package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-08 5min
// https://www.acmicpc.net/problem/8958
public class OXQuiz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		for (int i = 0; i < total; i++) {
			String str = br.readLine();
			int sum = 0;

			int seq = 1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					sum += seq++;
				} else {
					seq = 1;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);

	}
}
