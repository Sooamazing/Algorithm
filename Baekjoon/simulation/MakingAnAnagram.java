package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-10 10min
// https://www.acmicpc.net/problem/1919
public class MakingAnAnagram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] alphabets = new int[26];
		String firstSentence = br.readLine();
		for (int i = 0; i < firstSentence.length(); i++) {
			alphabets[firstSentence.charAt(i) - 'a']++;
		}

		int result = 0;
		String secondSentence = br.readLine();
		for (int i = 0; i < secondSentence.length(); i++) {
			char current = secondSentence.charAt(i);
			if (alphabets[current - 'a'] > 0) {
				alphabets[current - 'a']--;
				continue;
			}
			result++;
		}

		for (int i = 0; i < 26; i++) {
			result += alphabets[i];
		}

		System.out.println(result);

	}
}
