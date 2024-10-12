package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 24-10-12 15min
// https://www.acmicpc.net/problem/1972
public class AstonishingString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str;
		while ((str = br.readLine()).charAt(0) != '*') {
			int length = str.length();
			boolean isAstonishing = true;

			for (int i = 1; i < length - 1; i++) {
				Set<String> set = new HashSet<>();
				for (int j = 0; j < length; j++) {
					if (i + j >= length) {
						break;
					}
					char first = str.charAt(j);
					char second = str.charAt(j + i);
					String s = String.valueOf(new char[] {first, second});
					if (set.contains(s)) {
						isAstonishing = false;
						break;
					}
					set.add(s);
				}

				if (!isAstonishing) {
					break;
				}
			}
			sb.append(str).append(" is ").append(isAstonishing ? "surprising.\n" : "NOT surprising.\n");

		}

		System.out.println(sb);

	}
}
