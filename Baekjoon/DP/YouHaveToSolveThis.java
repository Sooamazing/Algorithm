package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-08-30 20min
// https://www.acmicpc.net/problem/17390
public class YouHaveToSolveThis {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		int questionNum = Integer.parseInt(st.nextToken());
		int[] questions = new int[length + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < length + 1; i++) {
			questions[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(questions);
		for (int i = 1; i < length + 1; i++) {
			questions[i] += questions[i - 1];
		}

		while (questionNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append(questions[end] - questions[start - 1]).append("\n");
		}

		System.out.println(sb);
	}
}
