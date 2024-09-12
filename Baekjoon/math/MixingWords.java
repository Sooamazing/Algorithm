package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-29 25min, 25% 시간 초과
// https://www.acmicpc.net/problem/9177
public class MixingWords {
	static String word_1;
	static String word_2;
	static String goal;

	static int word_1_length;
	static int word_2_length;
	static int goal_length;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 1; i <= testCase; i++) {
			st = new StringTokenizer(br.readLine());
			word_1 = st.nextToken();
			word_2 = st.nextToken();
			goal = st.nextToken();

			word_1_length = word_1.length();
			word_2_length = word_2.length();
			goal_length = goal.length();

			boolean possible = isPossible(0, 0, 0);
			sb.append("Data set ").append(i).append(": ")
				.append(possible ? "yes" : "no").append("\n");
		}
		System.out.println(sb);
	}

	static boolean isPossible(int word_1_idx, int word_2_idx, int goal_idx) {

		boolean isPossible = false;
		if (goal_idx == goal_length) {
			// isPossible 전역 변수으로 조건에 넣는 건 X, 함수 빠져나온 후 무조건 false됨. (isPossible || goal_idx == goal_length)인 경우.
			isPossible = true;
			return true;
		}

		if (word_1_idx < word_1_length && word_1.charAt(word_1_idx) == goal.charAt(
			goal_idx)) {
			isPossible = isPossible(word_1_idx + 1, word_2_idx, goal_idx + 1);
		}

		if (word_2_idx < word_2_length && word_2.charAt(word_2_idx) == goal.charAt(
			goal_idx)) {
			isPossible = isPossible(word_1_idx, word_2_idx + 1, goal_idx + 1);
		}

		return isPossible;
	}
}
