package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-01 15min
// https://www.acmicpc.net/problem/6996
public class Anagram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		while (total-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String first = st.nextToken();
			String second = st.nextToken();

			int length = first.length();
			if (length != second.length()) {
				sb.append(first).append(" & ").append(second).append(" are NOT anagrams.\n");
				continue;
			}

			int[] firstAlphabet = new int[26];
			int[] secondAlphabet = new int[26];
			for (int i = 0; i < length; i++) {
				firstAlphabet[first.charAt(i) - 'a']++;
				secondAlphabet[second.charAt(i) - 'a']++;
			}

			boolean isSame = true;
			for (int i = 0; i < length; i++) {
				if (firstAlphabet[i] != secondAlphabet[i]) {
					isSame = false;
					sb.append(first).append(" & ").append(second).append(" are NOT anagrams.\n");
					break;
				}
			}
			if (isSame) {
				sb.append(first).append(" & ").append(second).append(" are anagrams.\n");
			}
		}

		System.out.println(sb);
	}
}
