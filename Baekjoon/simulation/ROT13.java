package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-19 5min
// https://www.acmicpc.net/problem/11655
public class ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				sb.append((char)((c - 'A' + 13) % 26 + 'A'));
			} else if (c >= 'a' && c <= 'z') {
				sb.append((char)((c - 'a' + 13) % 26 + 'a'));
			} else {
				sb.append(c);
			}

		}
		System.out.println(sb);
	}
}
