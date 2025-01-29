package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-29 10min
// https://www.acmicpc.net/problem/2386
public class DobbyEnglishStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			char search = st.nextToken().toLowerCase().charAt(0);
			if (search == '#') {
				break;
			}

			int count = 0;
			while (st.hasMoreTokens()) {
				String parse = st.nextToken().toLowerCase();

				for (int i = 0; i < parse.length(); i++) {
					if (parse.charAt(i) == search) {
						count++;
					}
				}
			}

			sb.append(search).append(" ").append(count).append("\n");
		}

		System.out.println(sb);
	}
}
