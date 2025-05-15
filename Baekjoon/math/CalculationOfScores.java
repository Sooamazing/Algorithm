package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-15 5min
// https://www.acmicpc.net/problem/2506
public class CalculationOfScores {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int sequence = 0;
		int result = 0;
		for (int i = 0; i < total; i++) {
			boolean isTrue = st.nextToken().charAt(0) == '1';

			if (isTrue) {
				sequence++;
			} else {
				sequence = 0;
			}

			result += sequence;

		}

		System.out.println(result);

	}
}
