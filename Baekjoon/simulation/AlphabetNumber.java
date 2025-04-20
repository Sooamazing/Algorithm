package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-20 5min
// https://www.acmicpc.net/problem/10808
public class AlphabetNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();
		int[] alphabets = new int[26];
		for (int i = 0; i < word.length(); i++) {
			alphabets[word.charAt(i) - 'a']++;
		}

		for (int alphabetNumber : alphabets) {
			sb.append(alphabetNumber).append(" ");
		}

		System.out.println(sb);

	}
}
