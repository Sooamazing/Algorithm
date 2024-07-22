package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-07-22 40min
// https://www.acmicpc.net/problem/1283
public class SpecifyingAShortcutKey {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());

		// String[] words = new String[num]; // 불필요.
		int[] shortcutIdxes = new int[num]; // 단축키가 될 문자의 idx 저장할 배열.
		Arrays.fill(shortcutIdxes, -1); // 정답 idx -1로 초기화.
		boolean[] isShortcut = new boolean[26];

		for (int i = 0; i < num; i++) {
			String cur = br.readLine();
			int wordLength = cur.length();

			// 단어 첫 글자 확인
			String[] split = cur.split(" ");
			int splitLength = split.length;
			int splitWordLength = 0;
			for (int j = 0; j < splitLength; j++) {
				String curSplit = split[j];
				char wordFirstChar = curSplit.charAt(0);

				// 소문자 / 대문자 경우 (소문자가 숫자가 더 큼)
				int idx = wordFirstChar >= 'a' ? wordFirstChar - 'a' : wordFirstChar - 'A';
				if (!isShortcut[idx]) {
					isShortcut[idx] = true;
					shortcutIdxes[i] = splitWordLength + j;
					break;
				}
				// idx를 저장하기 위해서는 이전 split의 단어 길이 필요.
				splitWordLength += curSplit.length();
			}

			// 모든 단어의 첫 글자가 다 지정되어 shortcut이 지정되지 않은 경우
			if (shortcutIdxes[i] == -1) {
				for (int j = 0; j < wordLength; j++) {
					char c = cur.charAt(j);
					if (c == ' ')
						continue; // 공백 제외
					// 소문자 / 대문자 경우 (소문자가 숫자가 더 큼)
					int idx = c >= 'a' ? c - 'a' : c - 'A';
					if (!isShortcut[idx]) {
						isShortcut[idx] = true;
						shortcutIdxes[i] = j;
						break;
					}
				}
			}

			// 출력 sb에 추가
			for (int j = 0; j < wordLength; j++) {
				if (j == shortcutIdxes[i]) {
					sb.append("[").append(cur.charAt(j)).append("]");
					continue;
				}
				sb.append(cur.charAt(j));
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
