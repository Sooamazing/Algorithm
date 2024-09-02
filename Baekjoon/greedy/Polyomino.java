package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-09-02 5min
// https://www.acmicpc.net/problem/1343
public class Polyomino {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'X') {
				int cnt = 0;
				while (i < str.length() && str.charAt(i) == 'X') {
					cnt++;
					i++;
				}
				if (cnt % 2 != 0) {
					System.out.println(-1);
					return;
				}
				for (int j = 0; j < cnt / 4; j++) {
					sb.append("AAAA");
				}
				for (int j = 0; j < cnt % 4 / 2; j++) {
					sb.append("BB");
				}
				i--;
			} else {
				sb.append(".");
			}
		}

		System.out.println(sb);
	}
}
