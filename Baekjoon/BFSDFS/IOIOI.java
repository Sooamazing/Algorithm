package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2
// 7
// IOIOIOI // index error -> 시간 초과
// 참고: https://bowbowbow.tistory.com/6
// 24-06-26 21
// https://www.acmicpc.net/problem/5525
public class IOIOI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pInZeroNum = Integer.parseInt(br.readLine());
		int strLength = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int ans = 0;
		int cnt = 0;

		StringBuilder sb = new StringBuilder();
		sb.append("I");
		for (int i = 0; i < pInZeroNum; i++) {
			sb.append("OI");
		}
		String p = sb.toString();
		int pLength = p.length();

		for (int i = 0; i < strLength - pLength + 1; i++) {
			String substring = str.substring(i, i + p.length());
			boolean equals = str.substring(i, i + pLength).equals(p);
			if (equals) {
				ans++;
			}
		}

		System.out.println(ans);

		// copilot
		// for (int i = 0; i < strLength; i++) {
		// 	if (str.charAt(i) == 'I') {
		// 		if (i >= 2 && str.charAt(i - 2) == 'I' && str.charAt(i - 1) == 'O') {
		// 			cnt++;
		// 			if (cnt == pInZeroNum) {
		// 				cnt--;
		// 				ans++;
		// 			}
		// 		} else {
		// 			cnt = 0;
		// 		}
		// 	}
		// }

	}
}
