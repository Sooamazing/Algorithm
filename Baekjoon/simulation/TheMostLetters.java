package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-08-26 22:20
// https://www.acmicpc.net/problem/1371
public class TheMostLetters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Map<Character, Integer> map = new HashMap<>();
		String str;
		int[] arr = new int[26];
		// 백준에서는 isEmpty()를 사용하면 안됨.
		while ((str = br.readLine()) != null) {
			// while ((str = br.readLine()) != null && !str.isEmpty()) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == ' ') {
					continue;
				}
				arr[c - 'a']++;
				// map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		int max = 0;
		for (int i = 0; i < 26; i++) {
			max = Math.max(max, arr[i]);
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] == max) {
				System.out.print((char)(i + 'a'));
			}
		}

		// map.entrySet().stream().sorted((a, b) -> {
		// 	if (a.getValue() == b.getValue()) {
		// 		return a.getKey() - b.getKey();
		// 	}
		// 	return b.getValue() - a.getValue();
		// }).forEach(e -> {
		// 	if (e.getValue() == map.entrySet().stream().findFirst().get().getValue()) {
		// 		System.out.print(e.getKey());
		// 	}
		// });
	}
}
