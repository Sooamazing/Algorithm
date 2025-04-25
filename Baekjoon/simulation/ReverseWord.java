package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-25 10min
// https://www.acmicpc.net/problem/9093
public class ReverseWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		while (total-- > 0) {
			String[] words = br.readLine().split(" ");

			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				for (int j = word.length() - 1; j >= 0; j--) {
					sb.append(word.charAt(j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);

	}
}
