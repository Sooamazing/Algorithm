package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-25 5min
// https://www.acmicpc.net/problem/6443
public class Anagram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {

			String str = br.readLine();

			// copilot
			// String str = br.readLine();
			// char[] chars = str.toCharArray();
			// Arrays.sort(chars);
			// str = new String(chars);
			// sb.append(str).append("\n");
			// while(true) {
			// 	int i = str.length() - 1;
			// 	while(i > 0 && str.charAt(i - 1) >= str.charAt(i)) {
			// 		i--;
			// 	}
			// 	if (i == 0) {
			// 		break;
			// 	}
			// 	int j = str.length() - 1;
			// 	while(str.charAt(i - 1) >= str.charAt(j)) {
			// 		j--;
			// 	}
			// 	char temp = str.charAt(i - 1);
			// 	chars[i - 1] = str.charAt(j);
			// 	chars[j] = temp;
			// 	Arrays.sort(chars, i, str.length());
			// 	str = new String(chars);
			// 	sb.append(str).append("\n");
			// }
		}

		System.out.println(sb);
	}

	static void anagram(String str, String prefix) {

		// copilot
		// if (str.length() == 0) {
		// 	System.out.println(prefix);
		// 	return;
		// }
		//
		// for (int i = 0; i < str.length(); i++) {
		// 	String rem = str.substring(0, i) + str.substring(i + 1);
		// 	anagram(rem, prefix + str.charAt(i));
		// }
	}
}
