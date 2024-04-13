package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-04-13 20min
// https://www.acmicpc.net/problem/5052
public class PhoneNumberList {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {

			int size = Integer.parseInt(br.readLine());
			String[] numbers = new String[size];
			boolean duplicated = false;

			for (int i = 0; i < size; i++) {
				numbers[i] = br.readLine();
			}

			Arrays.sort(numbers);

			for (int i = 0; i < size - 1; i++) {
				String prev = numbers[i];
				String next = numbers[i + 1];
				if (next.startsWith(prev)) {
					duplicated = true;
					break;
				}
			}

			// 10% 시간 초과
			// for (int i = 0; i < size; i++) {
			// 	String first = numbers[i];
			// 	int firstLen = first.length();
			//
			// 	for (int j = i + 1; j < size; j++) {
			// 		String cur = numbers[j];
			// 		int curLen = cur.length();
			// 		if (firstLen > curLen) {
			// 			if (first.startsWith(cur)) {
			// 				duplicated = true;
			// 				break;
			// 			}
			// 		} else {
			// 			if (cur.startsWith(first)) {
			// 				duplicated = true;
			// 				break;
			// 			}
			// 		}
			//
			// 	}
			// 	if (duplicated) {
			// 		break;
			// 	}
			// }

			if (duplicated) {
				sb.append("NO\n");
			} else {
				sb.append("YES\n");
			}

		}

		System.out.println(sb);

	}
}
