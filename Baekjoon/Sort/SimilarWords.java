// https://www.acmicpc.net/problem/2179
package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimilarWords {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// String[][] arr = new String[N][N + 1];
		String[] arr = new String[N];
		String[] result = new String[2];
		int maxDigit = 0;
		int firstIdx = 200000;

		for (int i = 0; i < N; i++) {

			String n = arr[i] = br.readLine();

			for (int j = 0; j < i; j++) {

				String p = arr[j];

				// 같은 문자열 제외
				if (n.equals(p)) {
					continue;
				}

				int length = n.length();
				int digit = 0;

				while (digit < length) {

					if (digit < p.length() && n.charAt(digit) == p.charAt(digit)) {

						digit++;
						// arr[i][j] = String.valueOf(digit);

						// maxDigit <= digit && j < firstIdx 수정
						if (maxDigit <= digit) {
							if (maxDigit == digit && j < firstIdx) {
								firstIdx = j;
								maxDigit = digit;
								result[0] = p;
								result[1] = n;
							} else if (maxDigit < digit) {
								firstIdx = j;
								maxDigit = digit;
								result[0] = p;
								result[1] = n;
							}
						} else {
							break;
						}

					}
				}

			}

		}

		System.out.println(result[0] + "\n" + result[1]);
	}
}
