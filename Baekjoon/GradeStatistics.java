package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/5800
public class GradeStatistics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {

			String[] split = br.readLine().split(" ");
			int studentNum = Integer.parseInt(split[0]);
			int[] scores = new int[studentNum];

			int maxDiff = -1;
			for (int j = 0; j < studentNum; j++) {

				scores[j] = Integer.parseInt(split[j + 1]);

			}

			Arrays.sort(scores);
			for (int j = 0; j < studentNum - 1; j++) {

				maxDiff = Math.max(maxDiff, Math.abs(scores[j] - scores[j + 1]));

			}

			String formatted = String.format(
				"Class %d\nMax %d, Min %d, Largest gap %d",
				i, scores[studentNum - 1],
				scores[0], maxDiff);
			sb.append(formatted).append("\n");

		}

		System.out.println(sb);

	}
}
