package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-25 5min
// https://www.acmicpc.net/problem/2711
public class TypomanGoChangyoung {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		for (int i = 0; i < total; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			for (int j = 0; j < word.length(); j++) {
				if (j == index - 1) {
					continue;
				}
				sb.append(word.charAt(j));
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
