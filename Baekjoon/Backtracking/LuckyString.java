package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-06-05 50min
// https://www.acmicpc.net/problem/1342
// 참고: https://kimtaesoo99.tistory.com/159
public class LuckyString {
	static int length;
	static String str;
	static int[] alphabets;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();
		alphabets = new int[26];
		length = str.length();
		for (int i = 0; i < length; i++) {
			alphabets[str.charAt(i) - 'a']++;
		}
		visit = new boolean[length];
		temp = new char[length];

		calc(0, '0');

		System.out.println(result);

	}

	// static Set<String> result = new HashSet<>();
	static int result;
	static boolean[] visit;
	static char[] temp;

	static void calc(int depth, char pre) {

		if (depth == length) {
			// if (temp[depth - 2] != temp[depth - 1]) // Idx error
			// char[] -> String
			// result.add(String.valueOf(temp));
			result++;
			return;
		}

		for (int i = 0; i < 26; i++) {

			if (alphabets[i] != 0 && pre != (char)(i + 'a')) {
				// if (alphabets[i] != 0 && (depth == 0 || depth != 0 && temp[depth - 1] != (char)(i + 'a')) { // Idx error
				alphabets[i]--;
				// temp[depth] = (char)(i + 'a');
				calc(depth + 1, (char)(i + 'a'));
				alphabets[i]++;
			}

			// 중복 제거 필요. (abababa 구분 불가)
			// // 괄호 없으니 error
			// if (!visit[i] && (depth == 0 || depth != 0 && temp[depth - 1] != str.charAt(i))) {
			// 	visit[i] = true;
			// 	temp[depth] = str.charAt(i);
			// 	calc(depth + 1);
			// 	visit[i] = false;
			// }

		}
	}
}
