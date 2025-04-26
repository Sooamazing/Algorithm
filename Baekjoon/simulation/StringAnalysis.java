package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-26 10min
// https://www.acmicpc.net/problem/10820
public class StringAnalysis {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String sentence;
		while ((sentence = br.readLine()) != null && !sentence.isEmpty()) {
			int lower = 0;
			int upper = 0;
			int number = 0;
			int empty = 0;

			for (int i = 0; i < sentence.length(); i++) {
				char c = sentence.charAt(i);
				if (c >= 'a' && c <= 'z') {
					lower++;
				} else if (c >= 'A' && c <= 'Z') {
					upper++;
				} else if (c >= '0' && c <= '9') {
					number++;
				} else {
					empty++;
				}
			}

			sb.append(lower).append(" ")
				.append(upper).append(' ')
				.append(number).append(' ')
				.append(empty).append("\n");

		}

		System.out.println(sb);
	}
}
