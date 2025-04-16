package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-16 35min
// https://www.acmicpc.net/problem/2607
// 반례: https://www.acmicpc.net/board/view/143776
// 2
// AB
// ABCD
public class SimilarWords {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		String standard = br.readLine();
		int[] standardArray = new int[26];
		for (int i = 0; i < standard.length(); i++) {
			// 알파벳 대문자만 주어짐.
			standardArray[standard.charAt(i) - 'A']++;
		}

		int result = 0;
		for (int i = 1; i < total; i++) {
			String controlWord = br.readLine();
			int[] controlWordArray = new int[26];
			for (int j = 0; j < controlWord.length(); j++) {
				// 알파벳 대문자만 주어짐.
				controlWordArray[controlWord.charAt(j) - 'A']++;
			}

			int difference = 0;
			boolean isAdd2Different = true;
			for (int j = 0; j < 26; j++) {
				if (controlWordArray[j] == standardArray[j]) {
					continue;
				}

				int absDifference = Math.abs(controlWordArray[j] - standardArray[j]);
				difference += absDifference;

				if (absDifference >= 2) {
					isAdd2Different = false;
					break;
				}
			}

			boolean isWordLengthSame = controlWord.length() == standard.length();
			if (0 == difference || difference == 1 || (isWordLengthSame && isAdd2Different && difference == 2)) {
				result++;
			}
		}

		System.out.println(result);
	}
}
