package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakePalindrom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		int len = line.length();
		int[] alphabet = new int[26];
		char[] result = new char[len];

		int odd = 0;
		for (int i = 0; i < len; i++) {
			int cur = line.charAt(i) - 'A';
			alphabet[cur]++;
			if (alphabet[cur] % 2 == 1) {
				odd++;
			} else {
				odd--;
			}
		}

		// 길이가 짝수이면, 홀수 X, 홀수 길이면 홀수는 1개만 가능
		if (!((len % 2 == 0 && odd == 0) || (len % 2 == 1 && odd == 1))) {
			System.out.println("I'm Sorry Hansoo");
			return;
		} else if (len % 2 == 1) {
			// 홀수 길이이면서 홀수가 1개인 경우
			for (int i = 0; i < 26; i++) {
				if (alphabet[i] % 2 == 1) {
					result[len / 2] = (char)(i + 'A');
					alphabet[i]--;
					break;
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			while (alphabet[i] > 0) {
				for (int j = 0; j < len / 2; j++) {
					if (result[j] == 0) {
						result[j] = (char)(i + 'A');
						result[len - j - 1] = (char)(i + 'A');
						alphabet[i] -= 2;
						break;
					}
				}
			}
		}

		for (int i = 0; i < len; i++) {
			sb.append(result[i]);
		}

		System.out.println(sb);

	}
}
