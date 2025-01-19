package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-01-19 5min
// https://www.acmicpc.net/problem/1013
public class ConnectToServerWhenMissingKorea {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		String regex = br.readLine().replace("*", ".*");
		while (total-- > 0) {
			String word = br.readLine();
			if (word.matches(regex)) {
				sb.append("DA\n");
			} else {
				sb.append("NE\n");
			}
		}

		System.out.println(sb);

	}
}
