package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-09-25 10min
// https://www.acmicpc.net/problem/1157
public class StudyingWords {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		int[] alphabet = new int[26];
		for (int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i) - 'A']++;
		}

		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (max < alphabet[i]) {
				max = alphabet[i];
				maxIdx = i;
			}
		}

		int maxCount = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (max == alphabet[i]) {
				maxCount++;
			}
		}

		if (maxCount > 1) {
			System.out.println("?");
		} else {
			System.out.println((char)(maxIdx + 'A'));
		}

	}
}
