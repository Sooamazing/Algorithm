package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-31 10min
// https://www.acmicpc.net/problem/2675
public class StringIteration {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		StringTokenizer st;

		int total = Integer.parseInt(br.readLine());

		while (total-- > 0) {

			st = new StringTokenizer(br.readLine());

			int repeat = Integer.parseInt(st.nextToken());

			String word = st.nextToken();

			int length = word.length();

			for (int i = 0; i < length; i++) {

				sb.append(String.valueOf(word.charAt(i)).repeat(repeat));

			}

			sb.append("\n");

		}

		System.out.println(sb);

	}

}
