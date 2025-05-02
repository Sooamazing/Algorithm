package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

// 25-05-02 35min
// https://www.acmicpc.net/problem/1251
public class WordDivision {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String originalWord = br.readLine();

		// 첫 번째 구역 확인
		// 0~length-3 중 가장 먼저인 알파벳 모음 찾고, 비교하기
		// 먼저 끝나는 게 있다면, 거기까지가 첫 번째 구역임.
		// cbabcbaebaba
		// 1 abca
		// 2 abcba
		List<Integer> fastIndexes = new LinkedList<>();
		for (char i = 'a'; i <= 'z'; i++) {
			boolean hasNothing = true;
			for (int j = 0; j < originalWord.length() - 2; j++) {
				if (originalWord.charAt(j) == i) {
					fastIndexes.add(j);
					hasNothing = false;
				}
			}
			if (!hasNothing) {
				break;
			}
		}

		int firstIndex = 0;
		String firstReverse = "z".repeat(48);
		for (int fastIndex : fastIndexes) {
			String currentReverse = "";
			for (int i = fastIndex; i >= 0; i--) {
				currentReverse += originalWord.charAt(i);
			}
			if (firstReverse.compareTo(currentReverse) > 0) {
				firstIndex = fastIndex;
				firstReverse = currentReverse;
			}
		}
		sb.append(firstReverse);

		// 두 번째 구역
		// firstIndex~
		fastIndexes = new LinkedList<>();
		for (char i = 'a'; i <= 'z'; i++) {
			boolean hasNothing = true;
			for (int j = firstIndex + 1; j < originalWord.length() - 1; j++) {
				if (originalWord.charAt(j) == i) {
					fastIndexes.add(j);
					hasNothing = false;
				}
			}
			if (!hasNothing) {
				break;
			}
		}

		int secondIndex = firstIndex + 1;
		firstReverse = "z".repeat(48);
		for (int fastIndex : fastIndexes) {
			String currentReverse = "";
			for (int i = fastIndex; i >= firstIndex + 1; i--) {
				currentReverse += originalWord.charAt(i);
			}
			if (firstReverse.compareTo(currentReverse) > 0) {
				secondIndex = fastIndex;
				firstReverse = currentReverse;
			}
		}
		sb.append(firstReverse);

		// 세 번째 구역
		for (int i = originalWord.length() - 1; i >= secondIndex + 1; i--) {
			sb.append(originalWord.charAt(i));
		}

		System.out.println(sb);
	}
}
